package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface TaskTitleQuery {

	String[] PROJECTION = {
			TaskColumns._ID,
            TaskColumns.ID,
            TaskColumns.PROJECT_ID,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME,
            TaskColumns.NUMBER,
            ProjectColumns.TITLE
	};

	int _ID = 0;
	int ID = 1;
	int PROJECT_ID = 2;
	int START_DATE = 3;
	int END_DATE = 4;
    int NUMBER = 5;
    int PROJECT_TITLE = 6;

}
