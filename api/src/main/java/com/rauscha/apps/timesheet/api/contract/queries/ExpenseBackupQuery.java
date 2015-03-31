package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ExpenseColumns;

public interface ExpenseBackupQuery {
    String[] PROJECTION = {
            ExpenseColumns._ID,
            ExpenseColumns.ID,
            ExpenseColumns.AMOUNT,
            ExpenseColumns.DATE_TIME,
            ExpenseColumns.DESCRIPTION,
            ExpenseColumns.REFUNDED,
            ExpenseColumns.TASK_ID,
            ExpenseColumns.USER,
            ExpenseColumns.DELETED,
            ExpenseColumns.UPDATED
    };

    int _ID = 0;
    int ID = 1;
    int AMOUNT = 2;
    int DATE_TIME = 3;
    int DESCRIPTION = 4;
    int REFUNDED = 5;
    int TASK_ID = 6;
    int USER = 7;
    int DELETED = 8;
    int UPDATED = 9;
}