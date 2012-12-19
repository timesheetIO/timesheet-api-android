package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TagsColumns;

/**
 * Tags are specific categories for {@link Tasks}
 */
public class Tags extends BaseContract implements TagsColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_TAGS).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.tag";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.tag";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = PATH_TAGS + "." + TagsColumns.TAG_NAME + " ASC";
    
    /** Build {@link Uri} for requested {@link #TAG_ID}. */
    public static Uri buildUri(String tagId) {
        return CONTENT_URI.buildUpon().appendPath(tagId).build();
    }

    /** Read {@link #TAG_ID} from {@link Tags} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }
    
    public static Uri buildTagStatsUri() {
        return BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_TAG_STATS).build();
    }
    
    public static Uri buildTagStatsProjectsUri() {
        return BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_TAG_STATS).appendPath(BaseContract.PATH_TAG_STATS_PROJECT).build();
    }

}