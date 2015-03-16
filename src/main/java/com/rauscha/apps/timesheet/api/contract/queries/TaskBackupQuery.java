package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskColumns;

public interface TaskBackupQuery {

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
            TaskColumns.BILLABLE,
            TaskColumns.RATE_ID,
            TaskColumns.USER,
            TaskColumns.DELETED,
            TaskColumns.UPDATED
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
    int BILLABLE = 13;
    int RATE_ID = 14;
    int USER = 15;
    int DELETED = 16;
    int UPDATED = 17;

}
