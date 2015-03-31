package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.TagColumns;

/**
 * @author Florian Rauscha
 * @since 06.07.13
 */
public interface TagQuery {

    String[] PROJECTION = {
            TagColumns._ID,
            TagColumns.ID,
            TagColumns.NAME,
            TagColumns.COLOR
    };

    int _ID = 0;
    int ID = 1;
    int NAME = 2;
    int COLOR = 3;

}
