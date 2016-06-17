/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.Keys;
import net.ettery.jooq.thula.generated.Wordpress_01;
import net.ettery.jooq.thula.generated.tables.records.WpPostsRecord;

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
public class WpPosts extends TableImpl<WpPostsRecord> {

    private static final long serialVersionUID = -1490608339;

    /**
     * The reference instance of <code>wordpress.01.wp_posts</code>
     */
    public static final WpPosts WP_POSTS = new WpPosts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WpPostsRecord> getRecordType() {
        return WpPostsRecord.class;
    }

    /**
     * The column <code>wordpress.01.wp_posts.ID</code>.
     */
    public final TableField<WpPostsRecord, ULong> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_author</code>.
     */
    public final TableField<WpPostsRecord, ULong> POST_AUTHOR = createField("post_author", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_date</code>.
     */
    public final TableField<WpPostsRecord, Timestamp> POST_DATE = createField("post_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_date_gmt</code>.
     */
    public final TableField<WpPostsRecord, Timestamp> POST_DATE_GMT = createField("post_date_gmt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_content</code>.
     */
    public final TableField<WpPostsRecord, String> POST_CONTENT = createField("post_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_title</code>.
     */
    public final TableField<WpPostsRecord, String> POST_TITLE = createField("post_title", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_excerpt</code>.
     */
    public final TableField<WpPostsRecord, String> POST_EXCERPT = createField("post_excerpt", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_status</code>.
     */
    public final TableField<WpPostsRecord, String> POST_STATUS = createField("post_status", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("publish", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.comment_status</code>.
     */
    public final TableField<WpPostsRecord, String> COMMENT_STATUS = createField("comment_status", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("open", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.ping_status</code>.
     */
    public final TableField<WpPostsRecord, String> PING_STATUS = createField("ping_status", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("open", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_password</code>.
     */
    public final TableField<WpPostsRecord, String> POST_PASSWORD = createField("post_password", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_name</code>.
     */
    public final TableField<WpPostsRecord, String> POST_NAME = createField("post_name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.to_ping</code>.
     */
    public final TableField<WpPostsRecord, String> TO_PING = createField("to_ping", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.pinged</code>.
     */
    public final TableField<WpPostsRecord, String> PINGED = createField("pinged", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_modified</code>.
     */
    public final TableField<WpPostsRecord, Timestamp> POST_MODIFIED = createField("post_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_modified_gmt</code>.
     */
    public final TableField<WpPostsRecord, Timestamp> POST_MODIFIED_GMT = createField("post_modified_gmt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_content_filtered</code>.
     */
    public final TableField<WpPostsRecord, String> POST_CONTENT_FILTERED = createField("post_content_filtered", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_parent</code>.
     */
    public final TableField<WpPostsRecord, ULong> POST_PARENT = createField("post_parent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.guid</code>.
     */
    public final TableField<WpPostsRecord, String> GUID = createField("guid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.menu_order</code>.
     */
    public final TableField<WpPostsRecord, Integer> MENU_ORDER = createField("menu_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_type</code>.
     */
    public final TableField<WpPostsRecord, String> POST_TYPE = createField("post_type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("post", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.post_mime_type</code>.
     */
    public final TableField<WpPostsRecord, String> POST_MIME_TYPE = createField("post_mime_type", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wordpress.01.wp_posts.comment_count</code>.
     */
    public final TableField<WpPostsRecord, Long> COMMENT_COUNT = createField("comment_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>wordpress.01.wp_posts</code> table reference
     */
    public WpPosts() {
        this("wp_posts", null);
    }

    /**
     * Create an aliased <code>wordpress.01.wp_posts</code> table reference
     */
    public WpPosts(String alias) {
        this(alias, WP_POSTS);
    }

    private WpPosts(String alias, Table<WpPostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WpPosts(String alias, Table<WpPostsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WpPostsRecord, ULong> getIdentity() {
        return Keys.IDENTITY_WP_POSTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WpPostsRecord> getPrimaryKey() {
        return Keys.KEY_WP_POSTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WpPostsRecord>> getKeys() {
        return Arrays.<UniqueKey<WpPostsRecord>>asList(Keys.KEY_WP_POSTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WpPosts as(String alias) {
        return new WpPosts(alias, this);
    }

    /**
     * Rename this table
     */
    public WpPosts rename(String name) {
        return new WpPosts(name, null);
    }
}