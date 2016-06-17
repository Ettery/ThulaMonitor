package net.ettery.ThulaMonitor;

import net.ettery.jooq.thula.generated.Wordpress_01;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatabaseUtils {
    public final static SimpleDateFormat javaDateTimeFormat = new SimpleDateFormat("yyyyy-MM-dd hh:mm:ss");
    public final static DateTimeFormatter jodaDateTimeFormat = DateTimeFormat.forPattern("yyyyy-MM-dd hh:mm:ss");

    static Configuration _configuration;

    public static LocalDateTime convertTsToLdt(Timestamp time){
        return LocalDateTime.parse(javaDateTimeFormat.format(time), jodaDateTimeFormat);
    }


    public static void setConfiguration(Configuration config){
        _configuration = config;

        // Set the database name for jOOQ, after extracting from the URL
        Wordpress_01.WORDPRESS_DB_NAME = DatabaseUtils.getDatabaseName();
    }

    public static String getDatabaseName(){
        String dbName = "WORDPRESS_DB_NAME_UNABLE_TO_EXTRACT";
        String url = _configuration.getDatabaseUrl();   // jdbc:mysql://localhost:3306/wordpress.01
        Matcher matcher = Pattern.compile("^jdbc:mysql://[\\w\\.-[\\s:]]*:[0-9]{1,8}/([\\w\\.-[\\s:/]]*)$").matcher(url);
        if(matcher.find()){
            dbName = matcher.group(1);
        }
        return dbName;
    }

    public static DSLContext jOoqConnection() throws SQLException {
        String userName = _configuration.getDatabaseUser();
        String password = _configuration.getDatabasePass();
        String url =  _configuration.getDatabaseUrl();
        DSLContext db = null;

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        Connection conn = DriverManager.getConnection(url, userName, password);
        return DSL.using(conn, SQLDialect.MYSQL);
    }


}
