package com.rauscha.apps.timesheet.api.constants;

/**
 * @author Florian Rauscha
 * @since 25.12.13
 */
public interface Actions {

    /**
     * Specific {@link android.content.Intent#setAction(String)} used when starting and stopping
     * the timer.
     */
    public static final String ACTION_TIMER = "com.rauscha.apps.timesheet.TIMER";

    /**
     * Specific {@link android.content.Intent#setAction(String)} used when starting a new break.
     */
    public static final String ACTION_PAUSE = "com.rauscha.apps.timesheet.PAUSE";

    /**
     * Specific {@link android.content.Intent#setAction(String)} used when a new task was
     * inserted.
     */
    public static final String ACTION_NEW_TASK = "com.rauscha.apps.timesheet.NEW_TASK";

    /**
     * Specific {@link android.content.Intent#setAction(String)} used when starting a new
     * automated pause tracking with defined settings.
     */
    public static final String ACTION_PAUSE_AUTO = "com.rauscha.apps.timesheet.PAUSE_AUTO";

    /**
     * Specific {@link android.content.Intent#setAction(String)} used when a backup
     * was initiated.
     */
    public static final String ACTION_BACKUP = "com.rauscha.apps.timesheet.BACKUP";

}
