package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;

public interface ProjectBackupQuery {

	String[] PROJECTION = {
			ProjectColumns._ID,
            ProjectColumns.ID,
            ProjectColumns.TITLE,
            ProjectColumns.EMPLOYER,
            ProjectColumns.STATUS,
            ProjectColumns.DESCRIPTION,
            ProjectColumns.SALARY,
            ProjectColumns.OFFICE,
            ProjectColumns.COLOR,
            ProjectColumns.ORDER,
            ProjectColumns.USER,
            ProjectColumns.DELETED,
            ProjectColumns.UPDATED
	};

	int _ID = 0;
	int ID = 1;
	int TITLE = 2;
	int EMPLOYER = 3;
	int STATUS = 4;
	int DESCRIPTION = 5;
	int SALARY = 6;
	int OFFICE = 7;
    int COLOR = 8;
    int ORDER= 9;
    int USER = 10;
    int DELETED = 11;
    int UPDATED = 12;

}
