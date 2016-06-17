/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.WpTermmeta;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


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
public class WpTermmetaRecord extends UpdatableRecordImpl<WpTermmetaRecord> implements Record4<ULong, ULong, String, String> {

    private static final long serialVersionUID = -506564657;

    /**
     * Setter for <code>wordpress.01.wp_termmeta.meta_id</code>.
     */
    public void setMetaId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_termmeta.meta_id</code>.
     */
    public ULong getMetaId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>wordpress.01.wp_termmeta.term_id</code>.
     */
    public void setTermId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_termmeta.term_id</code>.
     */
    public ULong getTermId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>wordpress.01.wp_termmeta.meta_key</code>.
     */
    public void setMetaKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_termmeta.meta_key</code>.
     */
    public String getMetaKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpress.01.wp_termmeta.meta_value</code>.
     */
    public void setMetaValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_termmeta.meta_value</code>.
     */
    public String getMetaValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, ULong, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, ULong, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return WpTermmeta.WP_TERMMETA.META_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return WpTermmeta.WP_TERMMETA.TERM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WpTermmeta.WP_TERMMETA.META_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WpTermmeta.WP_TERMMETA.META_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getMetaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getTermId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMetaKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMetaValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmetaRecord value1(ULong value) {
        setMetaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmetaRecord value2(ULong value) {
        setTermId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmetaRecord value3(String value) {
        setMetaKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmetaRecord value4(String value) {
        setMetaValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmetaRecord values(ULong value1, ULong value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WpTermmetaRecord
     */
    public WpTermmetaRecord() {
        super(WpTermmeta.WP_TERMMETA);
    }

    /**
     * Create a detached, initialised WpTermmetaRecord
     */
    public WpTermmetaRecord(ULong metaId, ULong termId, String metaKey, String metaValue) {
        super(WpTermmeta.WP_TERMMETA);

        set(0, metaId);
        set(1, termId);
        set(2, metaKey);
        set(3, metaValue);
    }
}
