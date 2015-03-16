package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface BreakColumns extends DataColumns {
    /** UUID of task. */
    String TASK_ID = "break_task_id";
    /** Description of this break. */
    String DESCRIPTION = "break_description";
    /** Date when this break started. */
    String START_DATE_TIME = "break_start_date_time";
    /** Date when this break ended. */
    String END_DATE_TIME = "break_end_date_time";

    /** Duration of this break. */
    String DURATION = "break_duration";
}