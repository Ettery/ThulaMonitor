package net.ettery.ThulaMonitor;

import net.ettery.rpi.sensors.SensorOutput;
import net.ettery.utils.ILogger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimerTask;

import static net.ettery.utils.DateUtils.jodaDateTimeFmt;

public abstract class Check extends TimerTask {
    protected ILogger _logger;
    protected Configuration _config;

    public Check(Configuration config, ILogger logger){
        _config = config;
        _logger = logger;
    }

    @Override
    public void run(){
        _logger.WriteInfo("Check(s) completed.");
    };

    protected void logFailedCheck(@NotNull List<String> messages, @NotNull ILogger logger){
        messages.stream().forEach(m->{
            if(m.trim().length()!=0 && ! m.contains("Warning"))
                logger.WriteError(m);
        });
    }

    protected void notifyViaEmail(@NotNull List<String> messages, @NotNull Configuration config){
        String subject = String.format("Temperature Alert - %s", DateTime.now(config.getTimeZone()).toString(jodaDateTimeFmt));
        String body = prepareHtmlBody(messages);

        ArrayList<String> recipients = new ArrayList<String>(Arrays.asList(config.getNotifyRecipientEmails().split("[ ]*,[ ]*")));
        recipients.stream().forEach(r->GmailHelper.sendMessage(r, config.getGmailSender(), subject, body, true, _logger));
    }

    private String prepareHtmlBody(@NotNull List<String> messages){
        StringBuilder str = new StringBuilder("<html>");
        messages.stream().forEach(m-> {
                                    String l = (m.trim().length()==0)?"<p/>":(m.contains("Warning")?"<b>"+m+"</b><br/>":m+"<br/>");
                                    str.append(l);
                                });
        str.append("</html>");
        return str.toString();
    }

    protected abstract Boolean valuesPassCheck(@NotNull List<SensorOutput> values, @NotNull Configuration config);
}
