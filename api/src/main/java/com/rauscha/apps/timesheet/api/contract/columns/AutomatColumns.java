package com.rauscha.apps.timesheet.api.contract.columns;

/**
 * @author Florian Rauscha
 */
public interface AutomatColumns extends DataColumns {
    String PROJECT_ID = "automat_project_id";
    String ACTION = "automat_action";
    String TYPE = "automat_type";
    String STATUS = "automat_status";

    String SSID = "automat_ssid";

    String ADDRESS = "automat_address";
    String LONGITUDE = "automat_longitude";
    String LATITUDE = "automat_latitude";
    String RADIUS = "automat_radius";
}