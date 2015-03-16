package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.BreakColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface BreakQuery {
    String[] PROJECTION = {
            BreakColumns._ID,
            BreakColumns.ID,
            BreakColumns.START_DATE_TIME,
            BreakColumns.END_DATE_TIME,
            BreakColumns.DESCRIPTION,
            BreakColumns.TASK_ID,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME
    };

    int _ID = 0;
    int ID = 1;
    int START_DATE = 2;
    int END_DATE = 3;
    int DESCRIPTION = 4;
    int TASK_ID = 5;
    int TASK_START_DATE = 6;
    int TASK_END_DATE = 7;
}