package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;
import com.rauscha.apps.timesheet.api.contract.columns.RateColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface TaskListQuery {

	String[] PROJECTION = {
			TaskColumns._ID,
            TaskColumns.ID,
            TaskColumns.PROJECT_ID,
            TaskColumns.DESCRIPTION,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME,
            TaskColumns.PAID,
            TaskColumns.TYPE,
            TaskColumns.PHONE_NUMBER,
            TaskColumns.DISTANCE,
            TaskColumns.DURATION,
            TaskColumns.BILLABLE,
            TaskColumns.TAGS,
            TaskColumns.BREAKS,
            ProjectColumns.TITLE,
            ProjectColumns.COLOR,
            RateColumns.TITLE,
            RateColumns.FACTOR,
            RateColumns.EXTRA,
            RateColumns.ENABLED,
            TaskColumns.SALARY_TOTAL,
            TaskColumns.SALARY_BREAKS
	};

	int _ID = 0;
	int ID = 1;
	int PROJECT_ID = 2;
	int DESCRIPTION = 3;
	int START_DATE = 4;
	int END_DATE = 5;
	int PAID = 6;
    int TYPE = 7;
    int PHONE = 8;
    int DISTANCE = 9;
    int DURATION = 10;
    int BILLABLE = 11;
    int TAGS = 12;
    int BREAKS = 13;
    int PROJECT_TITLE = 14;
    int PROJECT_COLOR = 15;
    int RATE_TITLE = 16;
    int RATE_FACTOR = 17;
    int RATE_EXTRA = 18;
    int RATE_ENABLED = 19;
    int SALARY_TOTAL = 20;
    int SALARY_BREAKS = 21;

}
