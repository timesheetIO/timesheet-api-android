package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Expenses;

public interface ExpenseQuery {
	String[] PROJECTION = {
				Expenses._ID,
				Expenses.EXPENSE_ID,
				Expenses.EXPENSE_AMOUNT,
				Expenses.EXPENSE_DATE,
				Expenses.EXPENSE_DESCRIPTION,
				Expenses.TASK_ID
		};

	int _ID = 0;
	int EXPENSE_ID = 1;
	int EXPENSE_AMOUNT = 2;
	int EXPENSE_DATE = 3;
	int EXPENSE_DESCRIPTION = 4;
	int TASK_ID = 5;
}