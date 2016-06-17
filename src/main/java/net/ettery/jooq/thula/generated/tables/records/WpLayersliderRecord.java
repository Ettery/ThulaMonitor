/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.WpLayerslider;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WpLayersliderRecord extends UpdatableRecordImpl<WpLayersliderRecord> implements Record9<Integer, Integer, String, String, String, Integer, Integer, Byte, Byte> {

    private static final long serialVersionUID = 1064766614;

    /**
     * Setter for <code>wordpress.01.wp_layerslider.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.author</code>.
     */
    public void setAuthor(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.author</code>.
     */
    public Integer getAuthor() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.slug</code>.
     */
    public void setSlug(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.slug</code>.
     */
    public String getSlug() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.data</code>.
     */
    public void setData(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.data</code>.
     */
    public String getData() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.date_c</code>.
     */
    public void setDateC(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.date_c</code>.
     */
    public Integer getDateC() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.date_m</code>.
     */
    public void setDateM(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.date_m</code>.
     */
    public Integer getDateM() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.flag_hidden</code>.
     */
    public void setFlagHidden(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.flag_hidden</code>.
     */
    public Byte getFlagHidden() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>wordpress.01.wp_layerslider.flag_deleted</code>.
     */
    public void setFlagDeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_layerslider.flag_deleted</code>.
     */
    public Byte getFlagDeleted() {
        return (Byte) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, Integer, Byte, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, Integer, Byte, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WpLayerslider.WP_LAYERSLIDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WpLayerslider.WP_LAYERSLIDER.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WpLayerslider.WP_LAYERSLIDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WpLayerslider.WP_LAYERSLIDER.SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WpLayerslider.WP_LAYERSLIDER.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return WpLayerslider.WP_LAYERSLIDER.DATE_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return WpLayerslider.WP_LAYERSLIDER.DATE_M;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return WpLayerslider.WP_LAYERSLIDER.FLAG_HIDDEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return WpLayerslider.WP_LAYERSLIDER.FLAG_DELETED;
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
    public Integer value2() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDateC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDateM();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getFlagHidden();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getFlagDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value2(Integer value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value4(String value) {
        setSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value5(String value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value6(Integer value) {
        setDateC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value7(Integer value) {
        setDateM(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value8(Byte value) {
        setFlagHidden(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord value9(Byte value) {
        setFlagDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpLayersliderRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6, Integer value7, Byte value8, Byte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WpLayersliderRecord
     */
    public WpLayersliderRecord() {
        super(WpLayerslider.WP_LAYERSLIDER);
    }

    /**
     * Create a detached, initialised WpLayersliderRecord
     */
    public WpLayersliderRecord(Integer id, Integer author, String name, String slug, String data, Integer dateC, Integer dateM, Byte flagHidden, Byte flagDeleted) {
        super(WpLayerslider.WP_LAYERSLIDER);

        set(0, id);
        set(1, author);
        set(2, name);
        set(3, slug);
        set(4, data);
        set(5, dateC);
        set(6, dateM);
        set(7, flagHidden);
        set(8, flagDeleted);
    }
}
