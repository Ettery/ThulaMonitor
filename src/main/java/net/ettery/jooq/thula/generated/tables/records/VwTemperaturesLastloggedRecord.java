/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.VwTemperaturesLastlogged;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwTemperaturesLastloggedRecord extends TableRecordImpl<VwTemperaturesLastloggedRecord> implements Record5<Integer, String, String, Timestamp, BigDecimal> {

    private static final long serialVersionUID = -1156575783;

    /**
     * Setter for <code>wordpress.01.vw_temperatures_lastlogged.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_temperatures_lastlogged.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>wordpress.01.vw_temperatures_lastlogged.group_name</code>.
     */
    public void setGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_temperatures_lastlogged.group_name</code>.
     */
    public String getGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wordpress.01.vw_temperatures_lastlogged.sensor_name</code>.
     */
    public void setSensorName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_temperatures_lastlogged.sensor_name</code>.
     */
    public String getSensorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpress.01.vw_temperatures_lastlogged.time</code>.
     */
    public void setTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_temperatures_lastlogged.time</code>.
     */
    public Timestamp getTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>wordpress.01.vw_temperatures_lastlogged.value</code>.
     */
    public void setValue(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_temperatures_lastlogged.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED.GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED.SENSOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSensorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord value2(String value) {
        setGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord value3(String value) {
        setSensorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord value4(Timestamp value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord value5(BigDecimal value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwTemperaturesLastloggedRecord values(Integer value1, String value2, String value3, Timestamp value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VwTemperaturesLastloggedRecord
     */
    public VwTemperaturesLastloggedRecord() {
        super(VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED);
    }

    /**
     * Create a detached, initialised VwTemperaturesLastloggedRecord
     */
    public VwTemperaturesLastloggedRecord(Integer id, String groupName, String sensorName, Timestamp time, BigDecimal value) {
        super(VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED);

        set(0, id);
        set(1, groupName);
        set(2, sensorName);
        set(3, time);
        set(4, value);
    }
}
