package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;

public interface ProjectSpinnerQuery {

	String[] PROJECTION = {
			ProjectColumns._ID,
            ProjectColumns.ID,
            ProjectColumns.TITLE,
            ProjectColumns.EMPLOYER,
            ProjectColumns.ORDER
	};

	int _ID = 0;
	int ID = 1;
	int TITLE = 2;
	int EMPLOYER = 3;
    int ORDER = 4;

}
