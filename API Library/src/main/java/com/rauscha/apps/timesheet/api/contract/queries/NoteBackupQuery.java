package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.NoteColumns;


public interface NoteBackupQuery {
    String[] PROJECTION = {
            NoteColumns._ID,
            NoteColumns.ID,
            NoteColumns.DATE_TIME,
            NoteColumns.TEXT,
            NoteColumns.URI,
            NoteColumns.DRIVE_ID,
            NoteColumns.TASK_ID,
            NoteColumns.USER,
            NoteColumns.DELETED,
            NoteColumns.UPDATED
    };

    int _ID = 0;
    int ID = 1;
    int DATE_TIME = 2;
    int TEXT = 3;
    int URI = 4;
    int DRIVE_ID = 5;
    int TASK_ID = 6;
    int USER = 7;
    int DELETED = 8;
    int UPDATED = 9;
}