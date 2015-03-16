package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.columns.AutomatColumns;
import com.rauscha.apps.timesheet.api.contract.columns.ProjectColumns;

/**
 * @author Florian Rauscha
 */
public interface AutomationQuery {

    String[] PROJECTION = {
            AutomatColumns._ID,
            AutomatColumns.ID,
            AutomatColumns.PROJECT_ID,
            AutomatColumns.TYPE,
            AutomatColumns.ACTION,
            AutomatColumns.STATUS,
            AutomatColumns.SSID,
            AutomatColumns.ADDRESS,
            AutomatColumns.LATITUDE,
            AutomatColumns.LONGITUDE,
            AutomatColumns.RADIUS,
            ProjectColumns.TITLE,
            ProjectColumns.COLOR
    };

    int _ID = 0;
    int ID = 1;
    int PROJECT_ID = 2;
    int TYPE = 3;
    int ACTION = 4;
    int STATUS = 5;
    int SSID = 6;
    int ADDRESS = 7;
    int LATITUDE = 8;
    int LONGITUDE = 9;
    int RADIUS = 10;
    int PROJECT_NAME = 11;
    int PROJECT_COLOR = 12;

}
