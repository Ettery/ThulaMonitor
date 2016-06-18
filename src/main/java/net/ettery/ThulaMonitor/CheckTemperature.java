package net.ettery.ThulaMonitor;

import net.ettery.jooq.thula.generated.tables.records.VwTemperaturesLastloggedRecord;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

import net.ettery.rpi.sensors.SensorOutput;
import net.ettery.utils.DatabaseUtils;
import net.ettery.utils.DateUtils;
import net.ettery.utils.ILogger;
import org.joda.time.*;
import org.jooq.DSLContext;
import org.jooq.Result;

import javax.validation.constraints.NotNull;

import static net.ettery.jooq.thula.generated.Tables.VW_TEMPERATURES_LASTLOGGED;
import static net.ettery.utils.DateUtils.javaDateTimeFmt;
import static net.ettery.utils.DateUtils.jodaDateTimeFmt;

public class CheckTemperature extends Check {

    public CheckTemperature(@NotNull Configuration config, @NotNull ILogger logger){
        super(config, logger);
    }

    @Override
    public void run() {
        List<SensorOutput> values = loadLastValues(_config);
        if(!valuesPassCheck(values, _config))
        {
            List<String> logMessages = prepareOutput(values, _config);
            logFailedCheck(logMessages, _logger);
            notifyViaEmail(logMessages, _config);
        }
    }

    private List<SensorOutput> loadLastValues(@NotNull Configuration config){
        List<SensorOutput> values = new ArrayList<SensorOutput>();

        try{
            DSLContext db = DatabaseUtils.jOoqConnection();
            Result<VwTemperaturesLastloggedRecord> result = db.selectFrom(VW_TEMPERATURES_LASTLOGGED).fetch();
            result.stream().map(r->
                                {
                                    return new SensorOutput(DateUtils.convertTsToDt(r.getTime()), r.getSensorName(), r.getGroupName(), r.getValue().doubleValue(), "");
                                })
                            .forEach(so->values.add(so));
            return values;
        }
        catch(SQLException sqlExc)
        {
            _logger.WriteError(sqlExc);
        }
        return values;
    }

    private List<String> prepareOutput(@NotNull List<SensorOutput> values, @NotNull Configuration config) {
        // The <sensorname> sensor at <group> is reading <value> and it needs to stay <below/above> <min/max>

        List<String> lines = new ArrayList<String>();

        addLinesForSensorsNotReporting(values, config, lines);
        addLinesForSensorsOutOfRange(values, config, lines);

        return lines;
    }

    private List<String> addLinesForSensorsNotReporting(@NotNull List<SensorOutput> values, @NotNull Configuration config, @NotNull List<String> lines){
        int count = lines.size();
        final Duration maxDuration = new Duration(config.getNoDataTimeLimit());
        final String messageDataNotReported = "The monitor at %s has not updated temperatures for %d minutes (last read %s).  The power may be off at this location.";

        // Output lines for locations which have stopped logging data

        // Reduce the list of sensor values by
        // 1) Taking the most recent report from each group (location), and
        // 2) Filtering to include only those which have not been updated within the last x milliseconds as configured (typically the last hour
        // 3) Ignoring those which have not been updated for more than y milliseconds (typically the last day - assume after that that there is something wrong with this location and action has been taken)
        Map<String, Optional<SensorOutput>> groups = values.stream()
                .collect(Collectors.groupingBy(SensorOutput::getGroupName,
                        Collectors.maxBy(new Comparator<SensorOutput>() {public int compare(SensorOutput o1, SensorOutput o2) {return (o1.getTime().isBefore(o2.getTime())? -1 : 1);}})
                ));
        groups.entrySet().stream()
                .map(m->m.getValue().get())
                .filter(v->(mustHaveValueSince().isAfter(v.getTime()) && butNotEarlierThan().isBefore(v.getTime())))
                .collect(Collectors.toList())
                .forEach(v->lines.add(String.format
                        (messageDataNotReported,
                                v.getGroupName(),
                                new Duration(v.getTime(), DateTime.now()).getStandardMinutes(),
                                v.getTime().toString(jodaDateTimeFmt.withZone(config.getTimeZone())))
                        ));


        if(lines.size() > count){
            lines.add("<p/>");
            lines.add(String.format("Warning: No more than %d minutes should pass between temperature reports.  If this persists, please investigate what is wrong at the reported location.", maxDuration.getStandardMinutes()));
            lines.add("<p/>");
        }

        return lines;
    }

    private List<String> addLinesForSensorsOutOfRange(@NotNull List<SensorOutput> values, @NotNull Configuration config, @NotNull List<String> lines){
        // The <sensorname> sensor at <group> is reading <value> and it needs to stay <below/above> <min/max>
        final String messageFmtOutOfRange = "The %s sensor at %s is reading %f and it needs to stay %s %d (last read %s).";
        String maxDescrip = "below";
        int count = lines.size();

        values.stream()
                .filter(v->v.getValue()>config.getTemperatureLimitMax())
                .filter(v->butNotEarlierThan().isBefore(v.getTime()))
                .forEach(v->lines.add(String.format
                        (messageFmtOutOfRange,
                                v.getSensorName(),
                                v.getGroupName(),
                                v.getValue(),
                                maxDescrip,
                                config.getTemperatureLimitMax(),
                                v.getTime().toString(jodaDateTimeFmt.withZone(config.getTimeZone())))
                        ));

        if(lines.size() > count){
            lines.add("<p/>");
            lines.add(String.format("Warning: Fridge temperatures should not exceed %d degC.  Please check that the fridge has power and is working.  If the high temperatures persist, the vaccines will need to be moved.", config.getTemperatureLimitMax()));
            lines.add("<p/>");
            count = lines.size();
        }

        String minDescrip = "above";

        values.stream()
                .filter(v->v.getValue()<config.getTemperatureLimitMin())
                .filter(v->butNotEarlierThan().isBefore(v.getTime()))
                .forEach(v->lines.add(String.format
                        (messageFmtOutOfRange,
                                v.getSensorName(),
                                v.getGroupName(),
                                v.getValue(),
                                minDescrip,
                                config.getTemperatureLimitMin(),
                                v.getTime().toString(jodaDateTimeFmt.withZone(config.getTimeZone()))
                        )));

        if(lines.size() > count){
            lines.add("<p/>");
            lines.add("Warning: Please turn this fridge up a bit.  If a temperature of less than zero persists, the vaccines may freeze.");
            lines.add("<p/>");
        }

        return lines;
    }

    @Override
    protected Boolean valuesPassCheck(@NotNull List<SensorOutput> values, @NotNull Configuration config){
        Boolean lastRecordIsRecent = values.stream().filter(v->(mustHaveValueSince().isAfter(v.getTime()) && butNotEarlierThan().isBefore(v.getTime()))).count()==0;
        Boolean valueIsInRange = (values.stream().allMatch(v->(v.getValue()<=config.getTemperatureLimitMax() && v.getValue() >= config.getTemperatureLimitMin())));

        return lastRecordIsRecent && valueIsInRange;
    }

    private DateTime mustHaveValueSince(){
        return DateTime.now().minusMillis(_config.getNoDataTimeLimit());
    }

    private DateTime butNotEarlierThan(){
        return DateTime.now().minusHours(_config.getHoursBeforeWhichIgnore());
    }

}
