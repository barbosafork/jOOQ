/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -65333786;

	/**
	 * The singleton instance of <code>TEST.T_DATES</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDates T_DATES = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>TEST.T_DATES.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.precision(7), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.D</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE.precision(7), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.T</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Timestamp> T = createField("T", org.jooq.impl.SQLDataType.TIMESTAMP.precision(11), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.TS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP.precision(11), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.D_INT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER.precision(7), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.TS_BIGINT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT.precision(18), T_DATES);

	/**
	 * The column <code>TEST.T_DATES.I_Y</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.types.YearToMonth> I_Y = createField("I_Y", org.jooq.impl.SQLDataType.INTERVALYEARTOMONTH, T_DATES);

	/**
	 * The column <code>TEST.T_DATES.I_D</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.types.DayToSecond> I_D = createField("I_D", org.jooq.impl.SQLDataType.INTERVALDAYTOSECOND, T_DATES);

	/**
	 * No further instances allowed
	 */
	private TDates() {
		super("T_DATES", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
