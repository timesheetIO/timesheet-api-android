package com.rauscha.apps.timesheet.api.contract.models;

import com.rauscha.apps.timesheet.api.contract.BaseContract;

import android.app.SearchManager;
import android.net.Uri;

public class SearchSuggest extends BaseContract {
    
	public static final Uri CONTENT_URI =
            BaseContract.BASE_CONTENT_URI.buildUpon().appendPath(BaseContract.PATH_SEARCH_SUGGEST).build();

    public static final String DEFAULT_SORT = SearchManager.SUGGEST_COLUMN_TEXT_1 + " COLLATE NOCASE ASC";
}