package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;

public interface ProjectListQuery {

	String[] PROJECTION = {
			ProjectColumns._ID,
            ProjectColumns.ID,
            ProjectColumns.TITLE,
            ProjectColumns.EMPLOYER,
            ProjectColumns.ORDER,
            ProjectColumns.COLOR,
            ProjectColumns.DURATION_TOTAL,
            ProjectColumns.DURATION_BREAKS
	};

	int _ID = 0;
	int ID = 1;
	int TITLE = 2;
	int EMPLOYER = 3;
    int ORDER = 4;
    int COLOR = 5;
    int DURATION = 6;
    int BREAKS = 7;

}
