/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.WpRevsliderSlides;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class WpRevsliderSlidesRecord extends TableRecordImpl<WpRevsliderSlidesRecord> implements Record5<Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = -1261658990;

    /**
     * Setter for <code>wordpress.01.wp_revslider_slides.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_slides.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_slides.slider_id</code>.
     */
    public void setSliderId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_slides.slider_id</code>.
     */
    public Integer getSliderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_slides.slide_order</code>.
     */
    public void setSlideOrder(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_slides.slide_order</code>.
     */
    public Integer getSlideOrder() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_slides.params</code>.
     */
    public void setParams(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_slides.params</code>.
     */
    public String getParams() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wordpress.01.wp_revslider_slides.layers</code>.
     */
    public void setLayers(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpress.01.wp_revslider_slides.layers</code>.
     */
    public String getLayers() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WpRevsliderSlides.WP_REVSLIDER_SLIDES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WpRevsliderSlides.WP_REVSLIDER_SLIDES.SLIDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WpRevsliderSlides.WP_REVSLIDER_SLIDES.SLIDE_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WpRevsliderSlides.WP_REVSLIDER_SLIDES.PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WpRevsliderSlides.WP_REVSLIDER_SLIDES.LAYERS;
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
        return getSliderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSlideOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLayers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord value2(Integer value) {
        setSliderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord value3(Integer value) {
        setSlideOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord value4(String value) {
        setParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord value5(String value) {
        setLayers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderSlidesRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5) {
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
     * Create a detached WpRevsliderSlidesRecord
     */
    public WpRevsliderSlidesRecord() {
        super(WpRevsliderSlides.WP_REVSLIDER_SLIDES);
    }

    /**
     * Create a detached, initialised WpRevsliderSlidesRecord
     */
    public WpRevsliderSlidesRecord(Integer id, Integer sliderId, Integer slideOrder, String params, String layers) {
        super(WpRevsliderSlides.WP_REVSLIDER_SLIDES);

        set(0, id);
        set(1, sliderId);
        set(2, slideOrder);
        set(3, params);
        set(4, layers);
    }
}