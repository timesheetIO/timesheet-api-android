package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.BreaksColumns;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;

/**
 * Breaks are tracked non working hours for specific {@link Tasks}
 */
public class Breaks extends BaseContract implements BreaksColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_BREAKS).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.break";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.break";

    /** Task of this break. */
	public static final String TASK_ID = "task_id";
   
	 /** Calculated duration field. */
    public static final String DURATION = "duration";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = PATH_BREAKS + "." + BREAK_START + " ASC, "
            + PATH_BREAKS + "." + BREAK_END + " ASC";
    
    /** Build {@link Uri} for requested {@link #BREAK_ID}. */
    public static Uri buildUri(String breakId) {
        return CONTENT_URI.buildUpon().appendPath(breakId).build();
    }

    /** Read {@link #BREAK_ID} from {@link Breaks} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }


}