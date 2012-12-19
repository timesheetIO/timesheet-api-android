package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TasksColumns;

/**
 * Tasks are tracked working hours for specific {@link Projects}
 */
public class Tasks extends BaseContract implements TasksColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_TASKS).build();

    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.timesheet.task";
    
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.timesheet.task";

    public static final String PROJECT_ID = "project_id";
    
    public static final String DURATION = "duration";
    
    public static final String SALARY = "salary";
    
    public static final String REL_SALARY = "rel_salary";
    
    public static final String REL_DURATION = "rel_duration";
    
    public static final String BREAK_COUNT = "break_count";
    
    public static final String BREAK_TIME = "break_time";
    
    public static final String EXPENSES_TOTAL = "expenses_total";
    
    public static final String NUM = "project_number";
    
    public static final String SEARCH_SNIPPET = "search_snippet";
    
    
    public static final String SORT_BY_DATE_DESC = TasksColumns.TASK_START + " DESC, "
            + TasksColumns.TASK_END + " DESC";
    
    /** Export "ORDER BY" clause. */
    public static final String SORT_BY_DATE_ASC = TasksColumns.TASK_START + " ASC, "
            + TasksColumns.TASK_END + " ASC";
    
    /** Num "ORDER BY" clause. */
    public static final String SORT_BY_NUMBER = Tasks.NUM + " ASC, "
            + TasksColumns.TASK_START + " DESC";
    
    /** DateTime "ORDER BY" clause. */
    public static final String SORT_BY_DATE_DESC_TIME_ASC = " (" + TasksColumns.TASK_START + "/86400000) DESC, ((" + TasksColumns.TASK_START + "/3600000)%24) ASC,"
            + TasksColumns.TASK_END + " ASC";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = SORT_BY_DATE_DESC;
    
    /**
     * Build {@link Uri} that references any {@link Tasks} that occur
     * between the requested time boundaries.
     */
    public static Uri buildTasksBetweenDatesUri(long startTime, long endTime) {
        return CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_BETWEEN).appendPath(
                String.valueOf(startTime)).appendPath(String.valueOf(endTime)).build();
    }
    
    public static Uri buildSearchUri(String query) {
        return CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_SEARCH).appendPath(query).build();
    }

    public static boolean isSearchUri(Uri uri) {
        return BaseContract.PATH_SEARCH.equals(uri.getPathSegments().get(1));
    }
    
    /**
     * Build {@link Uri} that references any {@link Notes} associated
     * with the requested {@link #TASK_ID}.
     */
    public static Uri buildNotesUri(String taskId) {
        return CONTENT_URI.buildUpon().appendPath(taskId).appendPath(BaseContract.PATH_NOTES).build();
    }
    
    /**
     * Build {@link Uri} that references any {@link Breaks} associated
     * with the requested {@link #TASK_ID}.
     */
    public static Uri buildBreaksUri(String taskId) {
        return CONTENT_URI.buildUpon().appendPath(taskId).appendPath(BaseContract.PATH_BREAKS).build();
    }
    
    /**
     * Build {@link Uri} that references any {@link Expenses} associated
     * with the requested {@link #TASK_ID}.
     */
    public static Uri buildExpensesUri(String taskId) {
        return CONTENT_URI.buildUpon().appendPath(taskId).appendPath(BaseContract.PATH_EXPENSES).build();
    }
    
    /**
     * Build {@link Uri} that references any {@link Tags} associated
     * with the requested {@link #TASK_ID}.
     */
    public static Uri buildTagsUri(String taskId) {
        return CONTENT_URI.buildUpon().appendPath(taskId).appendPath(BaseContract.PATH_TASK_TAG).build();
    }
    
    /** Build {@link Uri} for requested {@link #TASK_ID}. */
    public static Uri buildUri(String taskId) {
        return CONTENT_URI.buildUpon().appendPath(taskId).build();
    }

    /** Read {@link #TASK_ID} from {@link Tasks} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }
    
    public static String getSearchQuery(Uri uri) {
        return uri.getPathSegments().get(2);
    }

}