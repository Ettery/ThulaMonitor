/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.WpCommentmeta;

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
public class WpCommentmetaRecord extends UpdatableRecordImpl<WpCommentmetaRecord> implements Record4<ULong, ULong, String, String> {

    private static final long serialVersionUID = -293406796;

    /**
     * Setter for <code>wordpress.01.wp_commentmeta.meta_id</code>.
     */
    public void setMetaId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_commentmeta.meta_id</code>.
     */
    public ULong getMetaId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>wordpress.01.wp_commentmeta.comment_id</code>.
     */
    public void setCommentId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_commentmeta.comment_id</code>.
     */
    public ULong getCommentId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>wordpress.01.wp_commentmeta.meta_key</code>.
     */
    public void setMetaKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_commentmeta.meta_key</code>.
     */
    public String getMetaKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpress.01.wp_commentmeta.meta_value</code>.
     */
    public void setMetaValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_commentmeta.meta_value</code>.
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
        return WpCommentmeta.WP_COMMENTMETA.META_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return WpCommentmeta.WP_COMMENTMETA.COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WpCommentmeta.WP_COMMENTMETA.META_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WpCommentmeta.WP_COMMENTMETA.META_VALUE;
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
        return getCommentId();
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
    public WpCommentmetaRecord value1(ULong value) {
        setMetaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpCommentmetaRecord value2(ULong value) {
        setCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpCommentmetaRecord value3(String value) {
        setMetaKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpCommentmetaRecord value4(String value) {
        setMetaValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpCommentmetaRecord values(ULong value1, ULong value2, String value3, String value4) {
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
     * Create a detached WpCommentmetaRecord
     */
    public WpCommentmetaRecord() {
        super(WpCommentmeta.WP_COMMENTMETA);
    }

    /**
     * Create a detached, initialised WpCommentmetaRecord
     */
    public WpCommentmetaRecord(ULong metaId, ULong commentId, String metaKey, String metaValue) {
        super(WpCommentmeta.WP_COMMENTMETA);

        set(0, metaId);
        set(1, commentId);
        set(2, metaKey);
        set(3, metaValue);
    }
}
