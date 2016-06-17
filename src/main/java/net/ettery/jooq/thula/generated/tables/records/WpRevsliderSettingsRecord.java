/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.WpRevsliderSettings;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class WpRevsliderSettingsRecord extends TableRecordImpl<WpRevsliderSettingsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1203521751;

    /**
     * Setter for <code>wordpress.01.wp_revslider_settings.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_settings.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_settings.general</code>.
     */
    public void setGeneral(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_settings.general</code>.
     */
    public String getGeneral() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_settings.params</code>.
     */
    public void setParams(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_settings.params</code>.
     */
    public String getParams() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WpRevsliderSettings.WP_REVSLIDER_SETTINGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WpRevsliderSettings.WP_REVSLIDER_SETTINGS.GENERAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WpRevsliderSettings.WP_REVSLIDER_SETTINGS.PARAMS;
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
        return getGeneral();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSettingsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSettingsRecord value2(String value) {
        setGeneral(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSettingsRecord value3(String value) {
        setParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSettingsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WpRevsliderSettingsRecord
     */
    public WpRevsliderSettingsRecord() {
        super(WpRevsliderSettings.WP_REVSLIDER_SETTINGS);
    }

    /**
     * Create a detached, initialised WpRevsliderSettingsRecord
     */
    public WpRevsliderSettingsRecord(Integer id, String general, String params) {
        super(WpRevsliderSettings.WP_REVSLIDER_SETTINGS);

        set(0, id);
        set(1, general);
        set(2, params);
    }
}
