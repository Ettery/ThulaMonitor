/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpRevsliderLayerAnimationsRecord;

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
public class WpRevsliderLayerAnimations extends TableImpl<WpRevsliderLayerAnimationsRecord> {

    private static final long serialVersionUID = -1532626949;

    /**
     * The reference instance of <code>wordpress.01.wp_revslider_layer_animations</code>
     */
    public static final WpRevsliderLayerAnimations WP_REVSLIDER_LAYER_ANIMATIONS = new WpRevsliderLayerAnimations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpRevsliderLayerAnimationsRecord> getRecordType() {
        return WpRevsliderLayerAnimationsRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_revslider_layer_animations.id</code>.
     */
    public final TableField<WpRevsliderLayerAnimationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_revslider_layer_animations.handle</code>.
     */
    public final TableField<WpRevsliderLayerAnimationsRecord, String> HANDLE = createField("handle", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_revslider_layer_animations.params</code>.
     */
    public final TableField<WpRevsliderLayerAnimationsRecord, String> PARAMS = createField("params", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>wordpress.01.wp_revslider_layer_animations</code> table reference
     */
    public WpRevsliderLayerAnimations() {
        this("wp_revslider_layer_animations", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_revslider_layer_animations</code> table reference
     */
    public WpRevsliderLayerAnimations(String alias) {
        this(alias, WP_REVSLIDER_LAYER_ANIMATIONS);
    }

    private WpRevsliderLayerAnimations(String alias, Table<WpRevsliderLayerAnimationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpRevsliderLayerAnimations(String alias, Table<WpRevsliderLayerAnimationsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpRevsliderLayerAnimationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WP_REVSLIDER_LAYER_ANIMATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpRevsliderLayerAnimationsRecord>> getKeys() {
        return Arrays.<UniqueKey<WpRevsliderLayerAnimationsRecord>>asList(Keys.KEY_WP_REVSLIDER_LAYER_ANIMATIONS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpRevsliderLayerAnimations as(String alias) {
        return new WpRevsliderLayerAnimations(alias, this);
    }

    /**
     * Rename this table
     */
    public WpRevsliderLayerAnimations rename(String name) {
        return new WpRevsliderLayerAnimations(name, null);
    }
}
