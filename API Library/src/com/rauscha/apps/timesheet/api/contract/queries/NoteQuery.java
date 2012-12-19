package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Notes;

/** {@link Notes} query parameters. */
public interface NoteQuery {
	String[] PROJECTION = {
				Notes._ID,
				Notes.NOTE_ID,
				Notes.NOTE_DATE,
				Notes.NOTE_TEXT,
				Notes.NOTE_URI,
				Notes.TASK_ID
		};

	int _ID = 0;
	int NOTE_ID = 1;
	int NOTE_DATE = 2;
	int NOTE_TEXT = 3;
	int NOTE_URI = 4;
	int TASK_ID = 5;
}