package net.ettery.ThulaMonitor;

import net.ettery.utils.DatabaseUtils;
import net.ettery.utils.FileLogger;
import net.ettery.utils.ILogger;
import org.joda.time.DateTime;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Select;

import java.io.*;
import java.util.*;

import static net.ettery.jooq.thula.generated.Tables.TEMPERATURELOG;

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
            _logger = new FileLogger().initialise(_props);
            DatabaseUtils.setConfiguration(_configuration.getDatabaseUrl(),
                                            _configuration.getDatabaseUser(),
                                            _configuration.getDatabasePass());

            GmailHelper.initialise(_configuration);

            _monitor = new Monitor(_configuration, _logger);
            _monitor.Start();

        } catch (Exception exc) {
             exc.printStackTrace(System.err);
        }
    }
}
