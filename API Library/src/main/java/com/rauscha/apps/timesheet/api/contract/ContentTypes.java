package com.rauscha.apps.timesheet.api.contract;

/**
 * @author Florian Rauscha
 * @since 11.06.13
 */
public interface ContentTypes {


    public static final String PROJECT = "vnd.android.cursor.item/vnd.timesheet.project";
    public static final String PROJECTS = "vnd.android.cursor.dir/vnd.timesheet.project";

    public static final String TASK = "vnd.android.cursor.item/vnd.timesheet.task";
    public static final String TASKS = "vnd.android.cursor.dir/vnd.timesheet.task";

    public static final String TAG = "vnd.android.cursor.item/vnd.timesheet.tag";
    public static final String TAGS = "vnd.android.cursor.dir/vnd.timesheet.tag";

    public static final String BREAK = "vnd.android.cursor.item/vnd.timesheet.break";
    public static final String BREAKS = "vnd.android.cursor.dir/vnd.timesheet.break";

    public static final String EXPENSE = "vnd.android.cursor.item/vnd.timesheet.expense";
    public static final String EXPENSES = "vnd.android.cursor.dir/vnd.timesheet.expense";

    public static final String NOTE = "vnd.android.cursor.item/vnd.timesheet.note";
    public static final String NOTES = "vnd.android.cursor.dir/vnd.timesheet.note";

    public static final String RATE = "vnd.android.cursor.item/vnd.timesheet.rate";
    public static final String RATES = "vnd.android.cursor.dir/vnd.timesheet.rate";

    public static final String TASK_TAG = "vnd.android.cursor.item/vnd.timesheet.tasktag";
    public static final String TASK_TAGS = "vnd.android.cursor.dir/vnd.timesheet.tasktag";

    public static final String AUTOMATION = "vnd.android.cursor.item/vnd.timesheet.automation";
    public static final String AUTOMATIONS = "vnd.android.cursor.dir/vnd.timesheet.automation";

}
