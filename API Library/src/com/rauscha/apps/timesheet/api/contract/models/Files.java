package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.FilesColumns;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;

/**
 * Files are exported time sheets which belongs to {@link Projects}
 */
public class Files extends BaseContract implements FilesColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_FILES).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.file";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.file";

    /** Project of this file. */
    public static final String PROJECT_ID = "project_id";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = FilesColumns.FILE_CREATED + " DESC";

    /** Build {@link Uri} for requested {@link #FILE_ID}. */
    public static Uri buildUri(String fileId) {
        return CONTENT_URI.buildUpon().appendPath(fileId).build();
    }

    /** Read {@link #FILE_ID} from {@link Files} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }

}