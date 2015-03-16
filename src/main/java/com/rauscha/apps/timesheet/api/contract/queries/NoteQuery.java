package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.NoteColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;


public interface NoteQuery {
    String[] PROJECTION = {
            NoteColumns._ID,
            NoteColumns.ID,
            NoteColumns.DATE_TIME,
            NoteColumns.TEXT,
            NoteColumns.URI,
            NoteColumns.DRIVE_ID,
            NoteColumns.TASK_ID,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME,
    };

    int _ID = 0;
    int ID = 1;
    int DATE_TIME = 2;
    int TEXT = 3;
    int URI = 4;
    int DRIVE_ID = 5;
    int TASK_ID = 6;
    int TASK_START_DATE = 7;
    int TASK_END_DATE = 8;
}