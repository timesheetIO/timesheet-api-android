package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.RateColumns;
import com.rauscha.apps.timesheet.api.contract.columns.TagColumns;

/**
 * @author Florian Rauscha
 * @since 06.07.13
 */
public interface RateBackupQuery {

    String[] PROJECTION = {
            RateColumns._ID,
            RateColumns.ID,
            RateColumns.TITLE,
            RateColumns.FACTOR,
            RateColumns.EXTRA,
            RateColumns.ENABLED,
            RateColumns.USER,
            RateColumns.DELETED,
            RateColumns.UPDATED
    };

    int _ID = 0;
    int ID = 1;
    int TITLE = 2;
    int FACTOR = 3;
    int EXTRA = 4;
    int ENABLED = 5;
    int USER = 6;
    int DELETED = 7;
    int UPDATED = 8;

}
