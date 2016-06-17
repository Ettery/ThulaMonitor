/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpTermsRecord;

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
public class WpTerms extends TableImpl<WpTermsRecord> {

    private static final long serialVersionUID = 1337282288;

    /**
     * The reference instance of <code>wordpress.01.wp_terms</code>
     */
    public static final WpTerms WP_TERMS = new WpTerms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpTermsRecord> getRecordType() {
        return WpTermsRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_terms.term_id</code>.
     */
    public final TableField<WpTermsRecord, ULong> TERM_ID = createField("term_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_terms.name</code>.
     */
    public final TableField<WpTermsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_terms.slug</code>.
     */
    public final TableField<WpTermsRecord, String> SLUG = createField("slug", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_terms.term_group</code>.
     */
    public final TableField<WpTermsRecord, Long> TERM_GROUP = createField("term_group", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>wordpress.01.wp_terms</code> table reference
     */
    public WpTerms() {
        this("wp_terms", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_terms</code> table reference
     */
    public WpTerms(String alias) {
        this(alias, WP_TERMS);
    }

    private WpTerms(String alias, Table<WpTermsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpTerms(String alias, Table<WpTermsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpTermsRecord, ULong> getIdentity() {
        return Keys.IDENTITY_WP_TERMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WpTermsRecord> getPrimaryKey() {
        return Keys.KEY_WP_TERMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpTermsRecord>> getKeys() {
        return Arrays.<UniqueKey<WpTermsRecord>>asList(Keys.KEY_WP_TERMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpTerms as(String alias) {
        return new WpTerms(alias, this);
    }

    /**
     * Rename this table
     */
    public WpTerms rename(String name) {
        return new WpTerms(name, null);
    }
}