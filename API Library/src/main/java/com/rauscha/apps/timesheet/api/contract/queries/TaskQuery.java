package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;
import com.rauscha.apps.timesheet.api.contract.columns.RateColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface TaskQuery {

	String[] PROJECTION = {
			TaskColumns._ID,
            TaskColumns.ID,
            TaskColumns.PROJECT_ID,
            TaskColumns.DESCRIPTION,
            TaskColumns.LOCATION,
            TaskColumns.LOCATION_END,
            TaskColumns.START_DATE_TIME,
            TaskColumns.END_DATE_TIME,
            TaskColumns.PAID,
            TaskColumns.FEELING,
            TaskColumns.TYPE,
            TaskColumns.PHONE_NUMBER,
            TaskColumns.DISTANCE,
            TaskColumns.DURATION,
            TaskColumns.NUMBER,
            TaskColumns.TAGS,
            TaskColumns.BILLABLE,
            TaskColumns.BREAKS,
            TaskColumns.EXPENSES,
            TaskColumns.EXPENSES_PAID,
            TaskColumns.RATE_ID,
            TaskColumns.SALARY_TOTAL,
            TaskColumns.SALARY_BREAKS,
            TaskColumns.UPDATED,
            ProjectColumns.TITLE,
            ProjectColumns.EMPLOYER,
            ProjectColumns.SALARY,
            RateColumns.TITLE,
            RateColumns.FACTOR,
            RateColumns.EXTRA,
            RateColumns.ENABLED
	};

	int _ID = 0;
	int ID = 1;
	int PROJECT_ID = 2;
	int DESCRIPTION = 3;
	int LOCATION = 4;
    int DESTINATION = 5;
	int START_DATE = 6;
	int END_DATE = 7;
	int PAID = 8;
    int FEELING = 9;
    int TYPE = 10;
    int PHONE = 11;
    int DISTANCE = 12;
    int DURATION = 13;
    int NUMBER = 14;
    int TAGS = 15;
    int BILLABLE = 16;
    int BREAKS = 17;
    int EXPENSES = 18;
    int EXPENSES_PAID = 19;
    int RATE_ID = 20;
    int SALARY_TOTAL = 21;
    int SALARY_BREAKS = 22;
    int UPDATED = 23;
    int PROJECT_TITLE = 24;
    int PROJECT_EMPLOYER = 25;
    int PROJECT_SALARY = 26;
    int RATE_TITLE = 27;
    int RATE_FACTOR = 28;
    int RATE_EXTRA = 29;
    int RATE_ENABLED = 30;

}
