/**
 * This class is generated by jOOQ
 */
package net.ettery.jooq.thula.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import net.ettery.jooq.thula.generated.tables.VwBirchpressClients;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwBirchpressClientsRecord extends TableRecordImpl<VwBirchpressClientsRecord> implements Record10<ULong, Timestamp, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1547398272;

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.client_id</code>.
     */
    public void setClientId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.client_id</code>.
     */
    public ULong getClientId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.pass</code>.
     */
    public void setPass(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.pass</code>.
     */
    public String getPass() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.phone</code>.
     */
    public void setPhone(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.phone</code>.
     */
    public String getPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.ma_provider</code>.
     */
    public void setMaProvider(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.ma_provider</code>.
     */
    public String getMaProvider() {
        return (String) get(7);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.ma_number</code>.
     */
    public void setMaNumber(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.ma_number</code>.
     */
    public String getMaNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>wordpress.01.vw_birchpress_clients.ma_member</code>.
     */
    public void setMaMember(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>wordpress.01.vw_birchpress_clients.ma_member</code>.
     */
    public String getMaMember() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.PASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.MA_PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.MA_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return VwBirchpressClients.VW_BIRCHPRESS_CLIENTS.MA_MEMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMaProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMaNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMaMember();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value1(ULong value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value2(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value6(String value) {
        setPass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value7(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value8(String value) {
        setMaProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value9(String value) {
        setMaNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord value10(String value) {
        setMaMember(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwBirchpressClientsRecord values(ULong value1, Timestamp value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VwBirchpressClientsRecord
     */
    public VwBirchpressClientsRecord() {
        super(VwBirchpressClients.VW_BIRCHPRESS_CLIENTS);
    }

    /**
     * Create a detached, initialised VwBirchpressClientsRecord
     */
    public VwBirchpressClientsRecord(ULong clientId, Timestamp createDate, String firstName, String lastName, String email, String pass, String phone, String maProvider, String maNumber, String maMember) {
        super(VwBirchpressClients.VW_BIRCHPRESS_CLIENTS);

        set(0, clientId);
        set(1, createDate);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, pass);
        set(6, phone);
        set(7, maProvider);
        set(8, maNumber);
        set(9, maMember);
    }
}
