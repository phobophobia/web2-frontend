/**
 * This class is generated by jOOQ
 */
package hu.tilos.radio.jooqmodel.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends org.jooq.impl.UpdatableRecordImpl<hu.tilos.radio.jooqmodel.tables.records.UserRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -569277131;

	/**
	 * Setter for <code>tilos2.user.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>tilos2.user.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>tilos2.user.role_id</code>.
	 */
	public void setRoleId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>tilos2.user.role_id</code>.
	 */
	public java.lang.Integer getRoleId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>tilos2.user.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>tilos2.user.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>tilos2.user.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>tilos2.user.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>tilos2.user.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>tilos2.user.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>tilos2.user.salt</code>.
	 */
	public void setSalt(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>tilos2.user.salt</code>.
	 */
	public java.lang.String getSalt() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.ROLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return hu.tilos.radio.jooqmodel.tables.User.USER.SALT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getRoleId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSalt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(java.lang.Integer value) {
		setRoleId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value5(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value6(java.lang.String value) {
		setSalt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(hu.tilos.radio.jooqmodel.tables.User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(java.lang.Integer id, java.lang.Integer roleId, java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String salt) {
		super(hu.tilos.radio.jooqmodel.tables.User.USER);

		setValue(0, id);
		setValue(1, roleId);
		setValue(2, username);
		setValue(3, password);
		setValue(4, email);
		setValue(5, salt);
	}
}