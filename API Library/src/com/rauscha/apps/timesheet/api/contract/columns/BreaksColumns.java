package com.rauscha.apps.timesheet.api.contract.columns;

public interface BreaksColumns {
	/** Break UUID. */
    String BREAK_ID = "break_uuid";
    /** Description of this break. */
    String BREAK_DESCRIPTION = "break_description";
    /** Time when this break started. */
    String BREAK_START = "break_start";
    /** Time when this break ended. */
    String BREAK_END = "break_end";
}