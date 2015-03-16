package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface ProjectColumns extends DataColumns {
    /** Title describing this project. */
    String TITLE = "project_title";
    /** Description of this project. */
    String DESCRIPTION = "project_description";
    /** Employer of this project. */
    String EMPLOYER = "project_employer";
    /** Salary of this project per hour. */
    String SALARY = "project_salary";
    /** Status of this project. */
    String STATUS = "project_status";
    /** Location of this project (office). */
    String OFFICE = "project_office";
    /** Color of this project. */
    String COLOR = "project_color";
    /** Order of this project. */
    String ORDER = "project_order";

    /** Total Task Count. */
    String TASKS_COUNT = "project_tasks_count";

    /** Total Duration. */
    String DURATION_TOTAL = "project_duration_total";
    /** Total break time. */
    String DURATION_BREAKS = "project_duration_breaks";

    /** Total salary. */
    String SALARY_TOTAL = "project_salary_total";
    /** Total break salary. */
    String SALARY_BREAKS = "project_salary_breaks";

    /** Total break time. */
    String EXPENSES_TOTAL = "project_expenses_total";
    /** Total break time. */
    String EXPENSES_PAID = "project_expenses_paid";
    /** Total mileage. */
    String MILEAGE = "project_mileage";
}