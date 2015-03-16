package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.TagColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskTagColumns;

/**
 * @author Florian Rauscha
 * @since 06.07.13
 */
public interface TaskTagQuery {

    String[] PROJECTION = {
            TaskTagColumns._ID,
            TaskTagColumns.ID,
            TaskTagColumns.TASK_ID,
            TaskTagColumns.TAG_ID,
            TagColumns.NAME
    };

    int _ID = 0;
    int ID = 1;
    int TASK_ID = 2;
    int TAG_ID = 3;
    int NAME = 4;

}
