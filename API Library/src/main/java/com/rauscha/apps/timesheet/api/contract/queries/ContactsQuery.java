package com.rauscha.apps.timesheet.api.contract.queries;

import android.provider.ContactsContract;

/**
 * @author Florian Rauscha
 * @since 27.06.13
 */
public interface ContactsQuery {

    String[] PROJECTION_PEOPLE = new String[] {
            ContactsContract.Contacts._ID,
            ContactsContract.Contacts.DISPLAY_NAME };

    int _ID = 0;
    int NAME = 1;

    String[] PROJECTION_PHONE = new String[] {
            ContactsContract.CommonDataKinds.Phone._ID,
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
            ContactsContract.CommonDataKinds.Phone.NUMBER };

    int NUMBER = 2;
}
