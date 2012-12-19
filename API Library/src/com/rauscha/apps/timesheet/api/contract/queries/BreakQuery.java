package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Breaks;

public interface BreakQuery {
	String[] PROJECTION = {
				Breaks._ID,
				Breaks.BREAK_ID,
				Breaks.BREAK_START,
				Breaks.BREAK_END,
				Breaks.BREAK_DESCRIPTION,
				Breaks.TASK_ID
		};

	int _ID = 0;
	int BREAK_ID = 1;
	int BREAK_START = 2;
	int BREAK_END = 3;
	int BREAK_DESCRIPTION = 4;
	int TASK_ID = 5;
}