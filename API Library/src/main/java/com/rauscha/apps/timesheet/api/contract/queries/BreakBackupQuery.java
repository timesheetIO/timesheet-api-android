package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.BreakColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface BreakBackupQuery {
    String[] PROJECTION = {
            BreakColumns._ID,
            BreakColumns.ID,
            BreakColumns.START_DATE_TIME,
            BreakColumns.END_DATE_TIME,
            BreakColumns.DESCRIPTION,
            BreakColumns.TASK_ID,
            BreakColumns.USER,
            BreakColumns.DELETED,
            BreakColumns.UPDATED
    };

    int _ID = 0;
    int ID = 1;
    int START_DATE = 2;
    int END_DATE = 3;
    int DESCRIPTION = 4;
    int TASK_ID = 5;
    int USER = 6;
    int DELETED = 7;
    int UPDATED = 8;
}