package net.ettery.ThulaMonitor;
import net.ettery.utils.ILogger;

import java.util.Timer;

public class Monitor {
    Timer _timerTemperature;
//    Timer _timerMissingData;
    Configuration _config;
    ILogger _logger;

    public Monitor(Configuration config, ILogger logger){
        _logger = logger;
        _config = config;
        _timerTemperature = new Timer("temperature", true);
//        _timerMissingData = new Timer("missdata", true);
    }

    public void Start(){
        _timerTemperature.schedule(new CheckTemperature(_config, _logger), 3000, _config.getPollInterval());
//        _timerMissingData.schedule(new CheckMissingData(_config, _logger), 3000, _config.getNoDataTimeLimit());

        while(true){
            try {
                Thread.sleep(_config.getPollInterval()/4);
            } catch (InterruptedException e) {
                _logger.WriteError(e);
            }
        }
    }
}
