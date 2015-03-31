package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ExpenseColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface ExpenseQuery {
    String[] PROJECTION = {
            ExpenseColumns._ID,
            ExpenseColumns.ID,
            ExpenseColumns.AMOUNT,
            ExpenseColumns.DATE_TIME,
            ExpenseColumns.DESCRIPTION,
            ExpenseColumns.REFUNDED,
            ExpenseColumns.TASK_ID,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME,
    };

    int _ID = 0;
    int ID = 1;
    int AMOUNT = 2;
    int DATE_TIME = 3;
    int DESCRIPTION = 4;
    int REFUNDED = 5;
    int TASK_ID = 6;
    int TASK_START_DATE = 7;
    int TASK_END_DATE = 8;
}