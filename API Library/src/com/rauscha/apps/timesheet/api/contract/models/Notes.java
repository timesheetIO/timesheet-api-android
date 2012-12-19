package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.NotesColumns;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;

/**
 * Notes are additional descriptions which belongs to {@link Tasks}
 */
public class Notes extends BaseContract implements NotesColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_NOTES).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.note";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.note";

    /** Task of this note. */
    public static final String TASK_ID = "task_id";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = NotesColumns.NOTE_DATE + " DESC";
    
    /** Build {@link Uri} for requested {@link #NOTE_ID}. */
    public static Uri buildUri(String noteId) {
        return CONTENT_URI.buildUpon().appendPath(noteId).build();
    }

    /** Read {@link #NOTE_ID} from {@link Notes} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }

}