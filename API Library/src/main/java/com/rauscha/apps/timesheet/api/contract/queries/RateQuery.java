package com.rauscha.apps.timesheet.api.contract.queries;


import com.rauscha.apps.timesheet.api.contract.columns.RateColumns;

/**
 * @author Florian Rauscha
 * @since 06.07.13
 */
public interface RateQuery {

    String[] PROJECTION = {
            RateColumns._ID,
            RateColumns.ID,
            RateColumns.TITLE,
            RateColumns.FACTOR,
            RateColumns.EXTRA,
            RateColumns.ENABLED
    };

    int _ID = 0;
    int ID = 1;
    int TITLE = 2;
    int FACTOR = 3;
    int EXTRA = 4;
    int ENABLED = 5;

}
