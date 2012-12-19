package com.rauscha.apps.timesheet.api.contract.columns;

public interface TasksColumns {
	/** UUID of this task. */
    String TASK_ID = "task_uuid";
    /** Description of this task. */
    String TASK_DESCRIPTION = "task_description";
    /** Time when this task started. */
    String TASK_START = "task_start";
    /** Time when this task ended. */
    String TASK_END = "task_end";
    /** Location of this task. */
    String TASK_LOCATION = "task_location";
    /** Feelings when this task ended. */
    String TASK_FEELING = "task_feeling";
    /** Status of task. */
    String TASK_PAID = "task_paid";
}