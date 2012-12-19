package com.rauscha.apps.timesheet.api.contract.models;

import android.net.Uri;
import android.provider.BaseColumns;

import com.rauscha.apps.timesheet.api.contract.BaseContract;
import com.rauscha.apps.timesheet.api.contract.columns.ExpensesColumns;
import com.rauscha.apps.timesheet.api.contract.columns.SyncColumns;

/**
 * Expenses are tracked for {@link Tasks}
 */
public class Expenses extends BaseContract implements ExpensesColumns, BaseColumns, SyncColumns {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_EXPENSES).build();

    public static final String CONTENT_TYPE =
            "vnd.android.cursor.dir/vnd.timesheet.expense";
    public static final String CONTENT_ITEM_TYPE =
            "vnd.android.cursor.item/vnd.timesheet.expense";

    /** Task of this expense. */
    public static final String TASK_ID = "task_id";
    
    /** Default "ORDER BY" clause. */
    public static final String DEFAULT_SORT = PATH_EXPENSES + "." + EXPENSE_DATE + " DESC";
    
    /** Build {@link Uri} for requested {@link #EXPENSE_ID}. */
    public static Uri buildUri(String expenseId) {
        return CONTENT_URI.buildUpon().appendPath(expenseId).build();
    }

    /** Read {@link #EXPENSE_ID} from {@link Expenses} {@link Uri}. */
    public static String getId(Uri uri) {
        return uri.getPathSegments().get(1);
    }

}