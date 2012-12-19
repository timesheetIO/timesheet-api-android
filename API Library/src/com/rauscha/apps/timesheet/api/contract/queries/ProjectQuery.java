package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Projects;

public interface ProjectQuery {

	String[] PROJECTION = {
			Projects._ID,
			Projects.PROJECT_ID,
			Projects.PROJECT_TITLE,
			Projects.PROJECT_EMPLOYER,
			Projects.PROJECT_STATUS,
			Projects.PROJECT_AUTO_TRACKING,
			Projects.PROJECT_DESCRIPTION,
			Projects.PROJECT_SALARY,
			Projects.PROJECT_OFFICE,
			Projects.PROJECT_AUTO_NETWORK,
			Projects.TOTAL_TIME,
			Projects.TOTAL_SALARY
	};

	int _ID = 0;
	int PROJECT_ID = 1;
	int PROJECT_TITLE = 2;
	int PROJECT_EMPLOYER = 3;
	int PROJECT_STATUS = 4;
	int PROJECT_TRACKING = 5;
	int PROJECT_DESCRIPTION = 6;
	int PROJECT_SALARY = 7;
	int PROJECT_OFFICE = 8;
	int PROJECT_NETWORK = 9;
	int TOTAL_TIME = 10;
	int TOTAL_SALARY = 11;

}
