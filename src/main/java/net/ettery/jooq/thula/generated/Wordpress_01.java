/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.Temperaturelog;
import net.ettery.jooq.thula.generated.tables.VwBirchpressAppointments;
import net.ettery.jooq.thula.generated.tables.VwBirchpressClients;
import net.ettery.jooq.thula.generated.tables.VwTemperaturesLastlogged;
import net.ettery.jooq.thula.generated.tables.VwTemperaturesMinmax;
import net.ettery.jooq.thula.generated.tables.WpCommentmeta;
import net.ettery.jooq.thula.generated.tables.WpComments;
import net.ettery.jooq.thula.generated.tables.WpLayerslider;
import net.ettery.jooq.thula.generated.tables.WpLinks;
import net.ettery.jooq.thula.generated.tables.WpOptions;
import net.ettery.jooq.thula.generated.tables.WpPostmeta;
import net.ettery.jooq.thula.generated.tables.WpPosts;
import net.ettery.jooq.thula.generated.tables.WpRevsliderCss;
import net.ettery.jooq.thula.generated.tables.WpRevsliderLayerAnimations;
import net.ettery.jooq.thula.generated.tables.WpRevsliderSettings;
import net.ettery.jooq.thula.generated.tables.WpRevsliderSliders;
import net.ettery.jooq.thula.generated.tables.WpRevsliderSlides;
import net.ettery.jooq.thula.generated.tables.WpRevsliderStaticSlides;
import net.ettery.jooq.thula.generated.tables.WpTermRelationships;
import net.ettery.jooq.thula.generated.tables.WpTermTaxonomy;
import net.ettery.jooq.thula.generated.tables.WpTermmeta;
import net.ettery.jooq.thula.generated.tables.WpTerms;
import net.ettery.jooq.thula.generated.tables.WpUsermeta;
import net.ettery.jooq.thula.generated.tables.WpUsers;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Wordpress_01 extends SchemaImpl {

    private static final long serialVersionUID = -621720155;

    /**
     * The reference instance of <code>wordpress.01</code>
     */
    public static final Wordpress_01 WORDPRESS_01 = new Wordpress_01();
    public static String WORDPRESS_DB_NAME = "WORDPRESS_DB_NAME_UNDEFINED";

    /**
     * The table <code>wordpress.01.temperaturelog</code>.
     */
    public final Temperaturelog TEMPERATURELOG = net.ettery.jooq.thula.generated.tables.Temperaturelog.TEMPERATURELOG;

    /**
     * VIEW
     */
    public final VwBirchpressAppointments VW_BIRCHPRESS_APPOINTMENTS = net.ettery.jooq.thula.generated.tables.VwBirchpressAppointments.VW_BIRCHPRESS_APPOINTMENTS;

    /**
     * VIEW
     */
    public final VwBirchpressClients VW_BIRCHPRESS_CLIENTS = net.ettery.jooq.thula.generated.tables.VwBirchpressClients.VW_BIRCHPRESS_CLIENTS;

    /**
     * VIEW
     */
    public final VwTemperaturesLastlogged VW_TEMPERATURES_LASTLOGGED = net.ettery.jooq.thula.generated.tables.VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED;

    /**
     * VIEW
     */
    public final VwTemperaturesMinmax VW_TEMPERATURES_MINMAX = net.ettery.jooq.thula.generated.tables.VwTemperaturesMinmax.VW_TEMPERATURES_MINMAX;

    /**
     * The table <code>wordpress.01.wp_commentmeta</code>.
     */
    public final WpCommentmeta WP_COMMENTMETA = net.ettery.jooq.thula.generated.tables.WpCommentmeta.WP_COMMENTMETA;

    /**
     * The table <code>wordpress.01.wp_comments</code>.
     */
    public final WpComments WP_COMMENTS = net.ettery.jooq.thula.generated.tables.WpComments.WP_COMMENTS;

    /**
     * The table <code>wordpress.01.wp_layerslider</code>.
     */
    public final WpLayerslider WP_LAYERSLIDER = net.ettery.jooq.thula.generated.tables.WpLayerslider.WP_LAYERSLIDER;

    /**
     * The table <code>wordpress.01.wp_links</code>.
     */
    public final WpLinks WP_LINKS = net.ettery.jooq.thula.generated.tables.WpLinks.WP_LINKS;

    /**
     * The table <code>wordpress.01.wp_options</code>.
     */
    public final WpOptions WP_OPTIONS = net.ettery.jooq.thula.generated.tables.WpOptions.WP_OPTIONS;

    /**
     * The table <code>wordpress.01.wp_postmeta</code>.
     */
    public final WpPostmeta WP_POSTMETA = net.ettery.jooq.thula.generated.tables.WpPostmeta.WP_POSTMETA;

    /**
     * The table <code>wordpress.01.wp_posts</code>.
     */
    public final WpPosts WP_POSTS = net.ettery.jooq.thula.generated.tables.WpPosts.WP_POSTS;

    /**
     * The table <code>wordpress.01.wp_revslider_css</code>.
     */
    public final WpRevsliderCss WP_REVSLIDER_CSS = net.ettery.jooq.thula.generated.tables.WpRevsliderCss.WP_REVSLIDER_CSS;

    /**
     * The table <code>wordpress.01.wp_revslider_layer_animations</code>.
     */
    public final WpRevsliderLayerAnimations WP_REVSLIDER_LAYER_ANIMATIONS = net.ettery.jooq.thula.generated.tables.WpRevsliderLayerAnimations.WP_REVSLIDER_LAYER_ANIMATIONS;

    /**
     * The table <code>wordpress.01.wp_revslider_settings</code>.
     */
    public final WpRevsliderSettings WP_REVSLIDER_SETTINGS = net.ettery.jooq.thula.generated.tables.WpRevsliderSettings.WP_REVSLIDER_SETTINGS;

    /**
     * The table <code>wordpress.01.wp_revslider_sliders</code>.
     */
    public final WpRevsliderSliders WP_REVSLIDER_SLIDERS = net.ettery.jooq.thula.generated.tables.WpRevsliderSliders.WP_REVSLIDER_SLIDERS;

    /**
     * The table <code>wordpress.01.wp_revslider_slides</code>.
     */
    public final WpRevsliderSlides WP_REVSLIDER_SLIDES = net.ettery.jooq.thula.generated.tables.WpRevsliderSlides.WP_REVSLIDER_SLIDES;

    /**
     * The table <code>wordpress.01.wp_revslider_static_slides</code>.
     */
    public final WpRevsliderStaticSlides WP_REVSLIDER_STATIC_SLIDES = net.ettery.jooq.thula.generated.tables.WpRevsliderStaticSlides.WP_REVSLIDER_STATIC_SLIDES;

    /**
     * The table <code>wordpress.01.wp_termmeta</code>.
     */
    public final WpTermmeta WP_TERMMETA = net.ettery.jooq.thula.generated.tables.WpTermmeta.WP_TERMMETA;

    /**
     * The table <code>wordpress.01.wp_terms</code>.
     */
    public final WpTerms WP_TERMS = net.ettery.jooq.thula.generated.tables.WpTerms.WP_TERMS;

    /**
     * The table <code>wordpress.01.wp_term_relationships</code>.
     */
    public final WpTermRelationships WP_TERM_RELATIONSHIPS = net.ettery.jooq.thula.generated.tables.WpTermRelationships.WP_TERM_RELATIONSHIPS;

    /**
     * The table <code>wordpress.01.wp_term_taxonomy</code>.
     */
    public final WpTermTaxonomy WP_TERM_TAXONOMY = net.ettery.jooq.thula.generated.tables.WpTermTaxonomy.WP_TERM_TAXONOMY;

    /**
     * The table <code>wordpress.01.wp_usermeta</code>.
     */
    public final WpUsermeta WP_USERMETA = net.ettery.jooq.thula.generated.tables.WpUsermeta.WP_USERMETA;

    /**
     * The table <code>wordpress.01.wp_users</code>.
     */
    public final WpUsers WP_USERS = net.ettery.jooq.thula.generated.tables.WpUsers.WP_USERS;

    /**
     * No further instances allowed
     */
    private Wordpress_01() {
        super(WORDPRESS_DB_NAME, null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Temperaturelog.TEMPERATURELOG,
            VwBirchpressAppointments.VW_BIRCHPRESS_APPOINTMENTS,
            VwBirchpressClients.VW_BIRCHPRESS_CLIENTS,
            VwTemperaturesLastlogged.VW_TEMPERATURES_LASTLOGGED,
            VwTemperaturesMinmax.VW_TEMPERATURES_MINMAX,
            WpCommentmeta.WP_COMMENTMETA,
            WpComments.WP_COMMENTS,
            WpLayerslider.WP_LAYERSLIDER,
            WpLinks.WP_LINKS,
            WpOptions.WP_OPTIONS,
            WpPostmeta.WP_POSTMETA,
            WpPosts.WP_POSTS,
            WpRevsliderCss.WP_REVSLIDER_CSS,
            WpRevsliderLayerAnimations.WP_REVSLIDER_LAYER_ANIMATIONS,
            WpRevsliderSettings.WP_REVSLIDER_SETTINGS,
            WpRevsliderSliders.WP_REVSLIDER_SLIDERS,
            WpRevsliderSlides.WP_REVSLIDER_SLIDES,
            WpRevsliderStaticSlides.WP_REVSLIDER_STATIC_SLIDES,
            WpTermmeta.WP_TERMMETA,
            WpTerms.WP_TERMS,
            WpTermRelationships.WP_TERM_RELATIONSHIPS,
            WpTermTaxonomy.WP_TERM_TAXONOMY,
            WpUsermeta.WP_USERMETA,
            WpUsers.WP_USERS);
    }
}
