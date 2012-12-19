package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.ProjectsColumns;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;

/**
 * Projects can have multiple {@link Tasks} and {@link Files}
 */
public class Projects extends BaseContract implements ProjectsColumns, BaseColumns, SyncColumns {

	public static final Uri CONTENT_URI =
			BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_PROJECTS)
					.build();

	public static final String CONTENT_TYPE =
			"vnd.android.cursor.dir/vnd.timesheet.project";
	public static final String CONTENT_ITEM_TYPE =
			"vnd.android.cursor.item/vnd.timesheet.project";

	/** Count of {@link Tasks} for project. */
	public static final String TASKS_COUNT = "tasks_count";

	/** Count of {@link Files} for project. */
	public static final String FILES_COUNT = "files_count";

	/** Sum of salary from all {@link Tasks} for project. */
	public static final String TOTAL_SALARY = "total_salary";

	/** Sum of time from all {@link Tasks} for project. */
	public static final String TOTAL_TIME = "total_time";

	/** Sum of break time from all {@link Tasks} for project. */
	public static final String TOTAL_BREAK_TIME = "total_break_time";

	/** Sum of expenses from all {@link Tasks} for project. */
	public static final String TOTAL_EXPENSES = "total_expenses";

	public static final String SORT_BY_TIME = Projects.PROJECT_STATUS + " ASC, " + TOTAL_TIME
			+ " DESC";
	public static final String SORT_BY_TITLE = "UPPER(" + Projects.PROJECT_TITLE + ") ASC";
	public static final String SORT_BY_CLIENT = "UPPER(" + Projects.PROJECT_EMPLOYER + ") ASC";
	public static final String SORT_BY_ID = Projects._ID + " ASC";

	/** Default "ORDER BY" clause. */
	public static final String DEFAULT_SORT = SORT_BY_TIME;

	/** Build {@link Uri} for requested {@link #PROJECT_ID}. */
	public static Uri buildUri(String projectId) {
		return CONTENT_URI.buildUpon().appendPath(projectId).build();
	}

	/**
	 * Build {@link Uri} that references any {@link Tasks} associated with the
	 * requested {@link #PROJECT_ID}.
	 */
	public static Uri buildTasksUri(String projectId) {
		return CONTENT_URI.buildUpon().appendPath(projectId).appendPath(BaseContract.PATH_TASKS)
				.build();
	}

	/**
	 * Build {@link Uri} that references any {@link Files} associated with the
	 * requested {@link #PROJECT_ID}.
	 */
	public static Uri buildFilesUri(String projectId) {
		return CONTENT_URI.buildUpon().appendPath(projectId).appendPath(BaseContract.PATH_FILES)
				.build();
	}

	/** Read {@link #PROJECT_ID} from {@link Projects} {@link Uri}. */
	public static String getId(Uri uri) {
		return uri.getPathSegments().get(1);
	}

}