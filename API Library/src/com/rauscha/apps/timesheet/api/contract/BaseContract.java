package com.rauscha.apps.timesheet.api.contract;

import android.net.Uri;


/**
 * Contract class for interacting with {@link TimesheetProvider}. Unless
 * otherwise noted, all time-based fields are milliseconds since epoch and can
 * be compared against {@link System#currentTimeMillis()}.
 */
public class BaseContract {
	
	/**
     * Special value for {@link SyncColumns#UPDATED} indicating that an entry
     * has never been updated, or doesn't exist yet.
     */
    public static final long UPDATED_NEVER = -2;

    /**
     * Special value for {@link SyncColumns#UPDATED} indicating that the last
     * update time is unknown, usually when inserted from a local file source.
     */
    public static final long UPDATED_UNKNOWN = -1;

    public static final String CONTENT_AUTHORITY = "com.rauscha.apps.timesheet";
    
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    
    public static final String PATH_PROJECTS = "projects";
    public static final String PATH_TASKS = "tasks";
    public static final String PATH_NOTES = "notes";
    public static final String PATH_BREAKS = "breaks";
    public static final String PATH_EXPENSES = "expenses";
    public static final String PATH_FILES = "files";
    public static final String PATH_TAGS = "tags";
    public static final String PATH_TAG_STATS = "tag_stats";
    public static final String PATH_TAG_STATS_PROJECT = "byprojects";
    public static final String PATH_TASK_TAG = "tasktags";
    public static final String PATH_BETWEEN = "between";
    public static final String PATH_SEARCH = "search";
    public static final String PATH_SEARCH_SUGGEST = "search_suggest_query";
    
    public BaseContract() {
    }
}
