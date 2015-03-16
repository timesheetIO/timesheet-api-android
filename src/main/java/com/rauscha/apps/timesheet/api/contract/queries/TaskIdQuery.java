package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface TaskIdQuery {

	String[] PROJECTION = {
			TaskColumns._ID,
            TaskColumns.ID,
            TaskColumns.PROJECT_ID
	};

	int _ID = 0;
	int ID = 1;
	int PROJECT_ID = 2;

}
