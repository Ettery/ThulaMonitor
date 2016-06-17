package net.ettery.ThulaMonitor;

import net.ettery.rpi.ILogger;
import net.ettery.rpi.SensorOutput;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class CheckMissingData extends Check {

    public CheckMissingData(@NotNull Configuration config, @NotNull ILogger logger){
        super(config, logger);
    }

    @Override
    public void run() {
        ArrayList<SensorOutput> values = loadLastValues(_config);
        if(!valuesPassCheck(values, _config))
        {
            ArrayList<String> logMessages = prepareOutput(values, _config);
            logFailedCheck(logMessages, _logger);
            notifyViaEmail(logMessages, _config);
        }
    }

    private ArrayList<SensorOutput> loadLastValues(@NotNull Configuration config){
        return new ArrayList<SensorOutput>();
    }

    private ArrayList<String> prepareOutput(@NotNull ArrayList<SensorOutput> values, @NotNull Configuration config){
        return new ArrayList<String>();
    }

    @Override
    protected Boolean valuesPassCheck(@NotNull List<SensorOutput> values, @NotNull Configuration config){
        return true;
    }

}
