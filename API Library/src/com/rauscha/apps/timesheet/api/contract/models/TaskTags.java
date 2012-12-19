package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TaskTagColumns;

/**
 * Many to Many Table for {@link Tasks} and {@link Tags}
 */
public class TaskTags extends BaseContract implements TaskTagColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_TASK_TAG).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.tasktag";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.tasktag";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = "tasktag." + TaskTagColumns.TASK_ID + " ASC";

}