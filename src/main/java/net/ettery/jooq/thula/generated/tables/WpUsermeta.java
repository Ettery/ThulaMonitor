/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpUsermetaRecord;

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
public class WpUsermeta extends TableImpl<WpUsermetaRecord> {

    private static final long serialVersionUID = -1199178720;

    /**
     * The reference instance of <code>wordpress.01.wp_usermeta</code>
     */
    public static final WpUsermeta WP_USERMETA = new WpUsermeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpUsermetaRecord> getRecordType() {
        return WpUsermetaRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_usermeta.umeta_id</code>.
     */
    public final TableField<WpUsermetaRecord, ULong> UMETA_ID = createField("umeta_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_usermeta.user_id</code>.
     */
    public final TableField<WpUsermetaRecord, ULong> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>wordpress.01.wp_usermeta.meta_key</code>.
     */
    public final TableField<WpUsermetaRecord, String> META_KEY = createField("meta_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>wordpress.01.wp_usermeta.meta_value</code>.
     */
    public final TableField<WpUsermetaRecord, String> META_VALUE = createField("meta_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>wordpress.01.wp_usermeta</code> table reference
     */
    public WpUsermeta() {
        this("wp_usermeta", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_usermeta</code> table reference
     */
    public WpUsermeta(String alias) {
        this(alias, WP_USERMETA);
    }

    private WpUsermeta(String alias, Table<WpUsermetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpUsermeta(String alias, Table<WpUsermetaRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpUsermetaRecord, ULong> getIdentity() {
        return Keys.IDENTITY_WP_USERMETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WpUsermetaRecord> getPrimaryKey() {
        return Keys.KEY_WP_USERMETA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpUsermetaRecord>> getKeys() {
        return Arrays.<UniqueKey<WpUsermetaRecord>>asList(Keys.KEY_WP_USERMETA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpUsermeta as(String alias) {
        return new WpUsermeta(alias, this);
    }

    /**
     * Rename this table
     */
    public WpUsermeta rename(String name) {
        return new WpUsermeta(name, null);
    }
}
