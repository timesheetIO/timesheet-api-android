package com.rauscha.apps.timesheet.api.contract.columns;

public interface ProjectsColumns {
	/** UUID of this project. */
    String PROJECT_ID = "project_uuid";
    /** Title describing this project. */
    String PROJECT_TITLE = "project_title";
    /** Description of this project. */
    String PROJECT_DESCRIPTION = "project_description";
    /** Employer of this project. */
    String PROJECT_EMPLOYER = "project_employer";
    /** Salary of this project per hour. */
    String PROJECT_SALARY = "project_salary";
    /** Status of this project. */
    String PROJECT_STATUS = "project_status";
    /** Location of this project (office). */
    String PROJECT_OFFICE = "project_office";
    /** Automatic tracking enabled. */
    String PROJECT_AUTO_TRACKING = "project_auto_tracking";
    /** Network for tracking. */
    String PROJECT_AUTO_NETWORK = "project_auto_network";
}