package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;

public interface ProjectQuery {

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
            ProjectColumns.DURATION_TOTAL,
            ProjectColumns.DURATION_BREAKS,
            ProjectColumns.SALARY_TOTAL,
            ProjectColumns.SALARY_BREAKS,
            ProjectColumns.EXPENSES_TOTAL,
            ProjectColumns.EXPENSES_PAID,
            ProjectColumns.MILEAGE
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
    int DURATION_TOTAL = 9;
    int DURATION_BREAKS = 10;
    int SALARY_TOTAL = 11;
    int SALARY_BREAKS = 12;
    int EXPENSES_TOTAL = 13;
    int EXPENSES_PAID = 14;
    int MILEAGE = 15;

}
