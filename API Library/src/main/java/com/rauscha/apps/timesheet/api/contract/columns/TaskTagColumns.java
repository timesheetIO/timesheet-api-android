package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface TaskTagColumns extends DataColumns {
    /** Task UUID. */
    String TASK_ID = "tt_task_uuid";
	/** Tag UUID. */
    String TAG_ID = "tt_tag_uuid";
}