package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface ExpenseColumns extends DataColumns {
    /** UUID of task. */
    String TASK_ID = "expense_task_id";
    /** Description of this expense. */
    String DESCRIPTION = "expense_description";
    /** Datetime. */
    String DATE_TIME = "expense_date_time";
    /** Amount. */
    String AMOUNT = "expense_amount";
    /** Amount refunded. */
    String REFUNDED = "expense_refunded";
}