package net.ettery.ThulaMonitor;

import net.ettery.utils.DatabaseUtils;
import net.ettery.utils.FileLogger;
import net.ettery.utils.ILogger;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Configuration _configuration;
        Monitor _monitor;
        ILogger _logger;

        if (args.length != 1)
            throw (new IllegalArgumentException("ThulaMonitor must run with one command-line parameter, the configuration .properties file path."));

        Properties _props = new Properties();
        try {
            _props.load(new FileInputStream(args[0]));
            _configuration = new Configuration(_props);
            DatabaseUtils.setConfiguration(_configuration.getDatabaseUrl(),
                                                _configuration.getDatabaseUser(),
                                                _configuration.getDatabasePass());
            _logger = new FileLogger().initialise(_props);

            GmailHelper.initialise(_configuration);
            GmailHelper.ReadLabels();

            GmailHelper.sendMessage("ettery@gmail.com", _configuration.getGmailSender(), "Test message subject", "Test message body");

//            _monitor = new Monitor(_configuration, _logger);
//            _monitor.Start();
        } catch (Exception exc) {
            System.out.println(exc.getStackTrace());
        }
    }
}
