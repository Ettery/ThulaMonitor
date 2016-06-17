/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.TemperaturelogRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Temperaturelog extends TableImpl<TemperaturelogRecord> {

    private static final long serialVersionUID = 1210629571;

    /**
     * The reference instance of <code>wordpress.01.temperaturelog</code>
     */
    public static final Temperaturelog TEMPERATURELOG = new Temperaturelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TemperaturelogRecord> getRecordType() {
        return TemperaturelogRecord.class;
    }

    /**
     * The column <code>wordpress.01.temperaturelog.id</code>.
     */
    public final TableField<TemperaturelogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.temperaturelog.group_name</code>.
     */
    public final TableField<TemperaturelogRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>wordpress.01.temperaturelog.sensor_name</code>.
     */
    public final TableField<TemperaturelogRecord, String> SENSOR_NAME = createField("sensor_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>wordpress.01.temperaturelog.time</code>.
     */
    public final TableField<TemperaturelogRecord, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.temperaturelog.value</code>.
     */
    public final TableField<TemperaturelogRecord, BigDecimal> VALUE = createField("value", org.jooq.impl.SQLDataType.DECIMAL.precision(18, 8).nullable(false), this, "");

    /**
     * Create a <code>wordpress.01.temperaturelog</code> table reference
     */
    public Temperaturelog() {
        this("temperaturelog", null);
    }

    /**
     * Create an aliased <code>wordpress.01.temperaturelog</code> table reference
     */
    public Temperaturelog(String alias) {
        this(alias, TEMPERATURELOG);
    }

    private Temperaturelog(String alias, Table<TemperaturelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Temperaturelog(String alias, Table<TemperaturelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Wordpress_01.WORDPRESS_01;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TemperaturelogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TEMPERATURELOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TemperaturelogRecord> getPrimaryKey() {
        return Keys.KEY_TEMPERATURELOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TemperaturelogRecord>> getKeys() {
        return Arrays.<UniqueKey<TemperaturelogRecord>>asList(Keys.KEY_TEMPERATURELOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Temperaturelog as(String alias) {
        return new Temperaturelog(alias, this);
    }

    /**
     * Rename this table
     */
    public Temperaturelog rename(String name) {
        return new Temperaturelog(name, null);
    }
}
