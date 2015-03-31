package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.TaskTagColumns;

/**
 * @author Florian Rauscha
 * @since 06.07.13
 */
public interface TaskTagBackupQuery {

    String[] PROJECTION = {
            TaskTagColumns._ID,
            TaskTagColumns.ID,
            TaskTagColumns.TASK_ID,
            TaskTagColumns.TAG_ID,
            TaskTagColumns.USER,
            TaskTagColumns.DELETED,
            TaskTagColumns.UPDATED
    };

    int _ID = 0;
    int ID = 1;
    int TASK_ID = 2;
    int TAG_ID = 3;
    int USER = 4;
    int DELETED = 5;
    int UPDATED = 6;

}
