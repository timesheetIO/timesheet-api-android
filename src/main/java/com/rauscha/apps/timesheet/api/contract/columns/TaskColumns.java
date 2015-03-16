package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface TaskColumns extends DataColumns {
    /** UUID of project. */
    String PROJECT_ID = "task_project_id";
    /** Type (Task / Call / Mileage). */
    String TYPE = "task_type";
    /** Description of this task. */
    String DESCRIPTION = "task_description";
    /** Start date time. */
    String START_DATE_TIME = "task_start_date_time";
    /** End date time. */
    String END_DATE_TIME = "task_end_date_time";
    /** Start Location of this task. */
    String LOCATION = "task_location";
    /** End Location of this task. */
    String LOCATION_END = "task_end_location";
    /** Feelings when this task ended. */
    String FEELING = "task_feeling";
    /** Task billable. */
    String BILLABLE = "task_billable";
    /** Status of task. */
    String PAID = "task_paid";
    /** Phone Number. */
    String PHONE_NUMBER = "task_phone_number";
    /** Distance between origin and destination. */
    String DISTANCE = "task_distance";
    /** Billing rate. */
    String RATE_ID = "task_rate_id";

    /** Duration. */
    String DURATION = "task_duration";
    /** total break time. */
    String BREAKS = "task_breaks";
    /** total salary. */
    String SALARY_TOTAL = "task_salary_total";
    /** salary for breaks. */
    String SALARY_BREAKS = "task_salary_breaks";
    /** Task Project Number. */
    String NUMBER = "task_number";
    /** Tag Names and colors. */
    String TAGS = "task_tags";
    /** Total expenses. */
    String EXPENSES = "task_expenses";
    /** paid expenses. */
    String EXPENSES_PAID = "task_expenses_paid";

}