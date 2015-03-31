package com.rauscha.apps.timesheet.api.contract;

import android.net.Uri;

/**
 * @author Florian Rauscha
 * @since 11.06.13
 */
public abstract class TimesheetUris {

    public static final String AUTHORITY = "com.rauscha.apps.timesheet";

    public static final Uri BASE_URI = Uri.parse("content://" + AUTHORITY);


    public static final Uri PROJECTS = BASE_URI.buildUpon().appendPath(Tables.PROJECTS).build();
    public static final Uri TASKS = BASE_URI.buildUpon().appendPath(Tables.TASKS).build();
    public static final Uri TAGS = BASE_URI.buildUpon().appendPath(Tables.TAGS).build();
    public static final Uri BREAKS = BASE_URI.buildUpon().appendPath(Tables.BREAKS).build();
    public static final Uri EXPENSES = BASE_URI.buildUpon().appendPath(Tables.EXPENSES).build();
    public static final Uri NOTES = BASE_URI.buildUpon().appendPath(Tables.NOTES).build();
    public static final Uri RATES = BASE_URI.buildUpon().appendPath(Tables.RATES).build();
    public static final Uri TASK_TAGS = BASE_URI.buildUpon().appendPath(Tables.TASK_TAGS).build();
    public static final Uri AUTOMATIONS = BASE_URI.buildUpon().appendPath(Tables.AUTOMATIONS).build();

    public static String getId(Uri uri) {
        if(uri != null && uri.getPathSegments().size() > 1) {
            return uri.getPathSegments().get(1);
        } else {
            return uri.getLastPathSegment();
        }
    }

    public static Uri buildUri(Uri uri, String id) {
        return uri.buildUpon().appendPath(id).build();
    }

    public static Uri buildProjectUri(String id) {
        return buildUri(PROJECTS, id);
    }

    public static Uri buildProjectTasksUri(Uri uri) {
        return uri.buildUpon().appendPath(Tables.TASKS).build();
    }

    public static Uri buildTagUri(String id) {
        return buildUri(TAGS, id);
    }

    public static Uri buildAutoUri(String id) {
        return buildUri(AUTOMATIONS, id);
    }

    public static Uri buildTaskUri(String id) {
        return buildUri(TASKS, id);
    }

    public static Uri buildTaskBreaksUri(Uri uri) {
        return uri.buildUpon().appendPath(Tables.BREAKS).build();
    }

    public static Uri buildTaskExpensesUri(Uri uri) {
        return uri.buildUpon().appendPath(Tables.EXPENSES).build();
    }

    public static Uri buildTaskNotesUri(Uri uri) {
        return uri.buildUpon().appendPath(Tables.NOTES).build();
    }

    public static Uri buildBreakUri(String id) {
        return buildUri(BREAKS, id);
    }

    public static Uri buildExpenseUri(String id) {
        return buildUri(EXPENSES, id);
    }

    public static Uri buildNoteUri(String id) {
        return buildUri(NOTES, id);
    }

    public static Uri buildRateUri(String id) {
        return buildUri(RATES, id);
    }

    public static Uri buildTaskTagUri(String id) {
        return buildUri(TASK_TAGS, id);
    }

}
