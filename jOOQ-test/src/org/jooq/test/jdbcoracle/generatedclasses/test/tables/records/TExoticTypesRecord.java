/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord> implements org.jooq.Record2<java.lang.Integer, java.util.UUID>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITExoticTypes {

	private static final long serialVersionUID = -1597339500;

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.UU</code>. 
	 */
	@Override
	public void setUu(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.UU</code>. 
	 */
	@Override
	public java.util.UUID getUu() {
		return (java.util.UUID) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes.UU;
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
	public java.util.UUID value2() {
		return getUu();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITExoticTypes from) {
		setId(from.getId());
		setUu(from.getUu());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITExoticTypes> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES);
	}
}
