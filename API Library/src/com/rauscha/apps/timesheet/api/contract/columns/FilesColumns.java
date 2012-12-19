package com.rauscha.apps.timesheet.api.contract.columns;

public interface FilesColumns {
	/** file UUID. */
    String FILE_ID = "file_uuid";
    /** Path to this file. */
    String FILE_PATH = "file_path";
    /** File type. */
    String FILE_TYPE = "file_type";
    /** Time for tasks range */
    String FILE_START_DATE = "file_start_date";
    /** Time for tasks range */
    String FILE_END_DATE = "file_end_date";
    /** Time when this file was created. */
    String FILE_CREATED = "file_created";
}