package com.rauscha.apps.timesheet.api.contract.columns;

import android.provider.BaseColumns;

/**
 * @author Florian Rauscha
 * @since 06.06.13
 */
public interface DataColumns extends BaseColumns {

    /** UUID of data. */
    String ID = "uuid";

    /** Sync columns. */
    String USER = "user";
    String DELETED = "deleted";
    String UPDATED = "updated";

}
