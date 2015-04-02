package com.rauscha.apps.timesheet.api.utils;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.rauscha.apps.timesheet.api.constants.Actions;

public class IntentUtils {

    public static final String PACKAGE_NAME = "com.rauscha.apps.timesheet";

    public static void startTimer(Context context, Uri projectUri) {
        Intent timerIntent = new Intent(Actions.ACTION_TIMER);
        timerIntent.setPackage(PACKAGE_NAME);
        timerIntent.setData(projectUri);
        context.startService(timerIntent);
    }

    public static void stopTimer(Context context) {
        Intent timerIntent = new Intent(Actions.ACTION_TIMER);
        timerIntent.setPackage(PACKAGE_NAME);
        context.startService(timerIntent);
    }

}
