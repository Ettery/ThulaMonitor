package net.ettery.ThulaMonitor;

import net.ettery.rpi.sensors.SensorOutput;
import net.ettery.utils.ILogger;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.TimerTask;

public abstract class Check extends TimerTask {
    protected ILogger _logger;
    protected Configuration _config;

    public Check(Configuration config, ILogger logger){
        _config = config;
        _logger = logger;
    }

    @Override
    public void run() {}

    protected void logFailedCheck(List<String> messages, ILogger logger){
        messages.stream().forEach(m->{logger.WriteError(m);});
    }

    protected void notifyViaEmail(List<String> values, Configuration config){

    }

    protected abstract Boolean valuesPassCheck(@NotNull List<SensorOutput> values, @NotNull Configuration config);
}
