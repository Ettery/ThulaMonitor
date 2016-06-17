/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpCommentmetaRecord;

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
public class WpCommentmeta extends TableImpl<WpCommentmetaRecord> {

    private static final long serialVersionUID = -1691459;

    /**
     * The reference instance of <code>wordpress.01.wp_commentmeta</code>
     */
    public static final WpCommentmeta WP_COMMENTMETA = new WpCommentmeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpCommentmetaRecord> getRecordType() {
        return WpCommentmetaRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_commentmeta.meta_id</code>.
     */
    public final TableField<WpCommentmetaRecord, ULong> META_ID = createField("meta_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_commentmeta.comment_id</code>.
     */
    public final TableField<WpCommentmetaRecord, ULong> COMMENT_ID = createField("comment_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>wordpress.01.wp_commentmeta.meta_key</code>.
     */
    public final TableField<WpCommentmetaRecord, String> META_KEY = createField("meta_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>wordpress.01.wp_commentmeta.meta_value</code>.
     */
    public final TableField<WpCommentmetaRecord, String> META_VALUE = createField("meta_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>wordpress.01.wp_commentmeta</code> table reference
     */
    public WpCommentmeta() {
        this("wp_commentmeta", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_commentmeta</code> table reference
     */
    public WpCommentmeta(String alias) {
        this(alias, WP_COMMENTMETA);
    }

    private WpCommentmeta(String alias, Table<WpCommentmetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpCommentmeta(String alias, Table<WpCommentmetaRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpCommentmetaRecord, ULong> getIdentity() {
        return Keys.IDENTITY_WP_COMMENTMETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WpCommentmetaRecord> getPrimaryKey() {
        return Keys.KEY_WP_COMMENTMETA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpCommentmetaRecord>> getKeys() {
        return Arrays.<UniqueKey<WpCommentmetaRecord>>asList(Keys.KEY_WP_COMMENTMETA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpCommentmeta as(String alias) {
        return new WpCommentmeta(alias, this);
    }

    /**
     * Rename this table
     */
    public WpCommentmeta rename(String name) {
        return new WpCommentmeta(name, null);
    }
}
