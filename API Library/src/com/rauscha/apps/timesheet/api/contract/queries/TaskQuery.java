package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Projects;
import com.rauscha.apps.timesheet.api.contract.models.Tasks;

public interface TaskQuery {

    String[] PROJECTION = {
    		Tasks._ID,
    		Tasks.TASK_ID,
            Tasks.TASK_START,
            Tasks.TASK_END,
            Tasks.REL_DURATION,
            Tasks.BREAK_TIME,
			Tasks.EXPENSES_TOTAL,
			Tasks.NUM,
			Tasks.TASK_DESCRIPTION,
			Tasks.TASK_FEELING,
			Tasks.TASK_LOCATION,
			Tasks.DURATION,
			Tasks.SALARY,
			Tasks.REL_SALARY,
			Tasks.TASK_PAID,
			Projects.PROJECT_ID,
            Projects.PROJECT_TITLE,
            Projects.PROJECT_SALARY,
            Projects.PROJECT_EMPLOYER
    };
    
    int _ID = 0;
    int TASK_ID = 1;
    int TASK_START = 2;
    int TASK_END = 3;
    int TASK_REL_DURATION = 4;
    int TASK_BREAK_TIME = 5;
	int TASK_EXPENSES = 6;
	int TASK_NUMBER = 7;
	int TASK_DESCRIPTION = 8;
	int TASK_FEELING = 9;
	int TASK_LOCATION = 10;
	int TASK_DURATION = 11;
	int TASK_SALARY = 12;
	int TASK_REL_SALARY = 13;
	int TASK_PAID = 14;
	int PROJECT_ID = 15;
    int PROJECT_TITLE = 16;
    int PROJECT_SALARY = 17;
    int PROJECT_EMPLOYER = 18;

}