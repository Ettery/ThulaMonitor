/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpTermmetaRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class WpTermmeta extends TableImpl<WpTermmetaRecord> {

    private static final long serialVersionUID = -1709034126;

    /**
     * The reference instance of <code>wordpress.01.wp_termmeta</code>
     */
    public static final WpTermmeta WP_TERMMETA = new WpTermmeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpTermmetaRecord> getRecordType() {
        return WpTermmetaRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_termmeta.meta_id</code>.
     */
    public final TableField<WpTermmetaRecord, ULong> META_ID = createField("meta_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_termmeta.term_id</code>.
     */
    public final TableField<WpTermmetaRecord, ULong> TERM_ID = createField("term_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>wordpress.01.wp_termmeta.meta_key</code>.
     */
    public final TableField<WpTermmetaRecord, String> META_KEY = createField("meta_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>wordpress.01.wp_termmeta.meta_value</code>.
     */
    public final TableField<WpTermmetaRecord, String> META_VALUE = createField("meta_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>wordpress.01.wp_termmeta</code> table reference
     */
    public WpTermmeta() {
        this("wp_termmeta", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_termmeta</code> table reference
     */
    public WpTermmeta(String alias) {
        this(alias, WP_TERMMETA);
    }

    private WpTermmeta(String alias, Table<WpTermmetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpTermmeta(String alias, Table<WpTermmetaRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpTermmetaRecord, ULong> getIdentity() {
        return Keys.IDENTITY_WP_TERMMETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WpTermmetaRecord> getPrimaryKey() {
        return Keys.KEY_WP_TERMMETA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpTermmetaRecord>> getKeys() {
        return Arrays.<UniqueKey<WpTermmetaRecord>>asList(Keys.KEY_WP_TERMMETA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTermmeta as(String alias) {
        return new WpTermmeta(alias, this);
    }

    /**
     * Rename this table
     */
    public WpTermmeta rename(String name) {
        return new WpTermmeta(name, null);
    }
}
