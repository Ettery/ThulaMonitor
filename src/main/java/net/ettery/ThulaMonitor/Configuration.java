package net.ettery.ThulaMonitor;

import java.util.Properties;

public class Configuration {
    private String _databaseUrl;
    private String _databaseUser;
    private String _databasePass;
    private String _logFilePath;
    private String _gmailClientSecretPath;
    private String _gmailClientSecretFile;
    private String _gmailSender;
    private String _notifyRecipientEmails;
    private int _temperatureLimitMax;
    private int _temperatureLimitMin;
    private int _pollInterval;
    private int _hoursBeforeWhichIgnore;
    private int _noDataTimeLimit;

    public String getDatabaseUrl(){
        return _databaseUrl;
    }
    public String getDatabaseUser(){
        return _databaseUser;
    }
    public String getDatabasePass(){
        return _databasePass;
    }
    public String getLogFilePath(){
        return _logFilePath;
    }
    public int getTemperatureLimitMax(){
        return _temperatureLimitMax;
    }
    public int getTemperatureLimitMin(){
        return _temperatureLimitMin;
    }
    public int getPollInterval(){
        return _pollInterval;
    }
    public int getHoursBeforeWhichIgnore(){
        return _hoursBeforeWhichIgnore;
    }
    public int getNoDataTimeLimit(){
        return _noDataTimeLimit;
    }
    public String getGmailClientSecretPath(){
        return _gmailClientSecretPath;
    }
    public String getGmailClientSecretFile(){
        return _gmailClientSecretFile;
    }
    public String getGmailSender(){
        return _gmailSender;
    }
    public String getNotifyRecipientEmails(){
        return _notifyRecipientEmails;
    }

    public Configuration(Properties props){
        _databaseUrl = props.getProperty("database-url");
        _databaseUser = props.getProperty("database-user");
        _databasePass = props.getProperty("database-pass");
        _logFilePath = props.getProperty("log-file-path");
        _temperatureLimitMax = Integer.parseInt(props.getProperty("temp-limit-max"));
        _temperatureLimitMin = Integer.parseInt(props.getProperty("temp-limit-min"));
        _noDataTimeLimit = Integer.parseInt(props.getProperty("no-data-time-limit-millisec"));
        _pollInterval = Integer.parseInt(props.getProperty("poll-millisec"));

        _gmailClientSecretPath = props.getProperty("gmail-secret-path");
        _gmailClientSecretFile = props.getProperty("gmail-secret-file");
        _gmailSender = props.getProperty("gmail-sender-mail");
        _notifyRecipientEmails = props.getProperty("notify-recipient-emails");
    }

}
