package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface NoteColumns extends DataColumns {
    /** UUID of task. */
    String TASK_ID = "note_task_id";
    /** Note text. */
    String TEXT = "note_text";
    /** Creation time of note. */
    String DATE_TIME = "note_date_time";
    /** Note attachment. */
    String URI = "note_uri";
    /** Attachment drive id */
    String DRIVE_ID = "note_drive_id";
}