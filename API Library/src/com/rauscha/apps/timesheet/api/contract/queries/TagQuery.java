package com.rauscha.apps.timesheet.api.contract.queries;

import com.rauscha.apps.timesheet.api.contract.models.Tags;

public interface TagQuery {

	String[] PROJECTION = {
			Tags._ID,
			Tags.TAG_ID,
			Tags.TAG_NAME,
			Tags.TAG_COLOR,
			Tags.USER,
			Tags.DELETED,
			Tags.UPDATED
		};

	int _ID = 0;
	int TAG_ID = 1;
	int TAG_NAME = 2;
	int TAG_COLOR = 3;
	int USER = 4;
	int DELETED = 5;
	int UPDATED = 6;

}