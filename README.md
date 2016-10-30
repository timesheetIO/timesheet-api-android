![Logo][1] Timesheet API
========================

Timesheet API is an Android library project which allows you to access the Timesheet `ContentProvider`.

**See https://timesheet.io for more information.**

![Timesheet][2]

## Getting Started

### Gradle Dependency
Add the API library to your `build.gradle` dependencies.
```gradle
dependencies {
    compile 'com.rauscha.apps.timesheet:api:2.1.0'
}
```

### Permissions
You have to set two permissions to read from and write to the Timesheet Content Provider. Add the following permissions to your `AndroidManifest.xml`:
```xml
<uses-permission android:name="com.rauscha.apps.timesheet.permission.READ_DATA" />
<uses-permission android:name="com.rauscha.apps.timesheet.permission.WRITE_DATA" />
```

### Data Queries
Timesheet uses the [ContentProvider][3]. Just use one of the provided Data Queries to retrieve the data: 
```java
mProjectCursor = getContentResolver().query(
    TimesheetUris.PROJECTS,             // The content URI of projects
    ProjectQuery.PROJECTION,            // The columns to return for each row
    null                                // Selection criteria
    null,                               // Selection criteria
    null);                              // Sort criteria
```    

### Actions
Use [IntentUtils][4] to start and stop the Timer. The API provides even more [Actions][5].
```java
if(mProjectCursor.moveToFirst()) {
    // Start Timer
    String projectId = mProjectCursor.getString(ProjectQuery.ID);
	Uri projectUri = TimesheetUris.buildProjectUri(projectId);
	IntentUtils.startTimer(this, projectUri);
}
``` 

## Download Timesheet

[![App Icon][6]][7]

You can get Timesheet at the Playstore: [Timesheet - Time Tracker][7].


## License

    Copyright 2016 Florian Rauscha

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: art/icon_24.png
[2]: https://timesheet.io/img/tabletSmall.png
[3]: http://developer.android.com/guide/topics/providers/content-provider-basics.html
[4]: https://github.com/timesheetIO/Android-API/blob/master/api/src/main/java/com/rauscha/apps/timesheet/api/utils/IntentUtils.java
[5]: https://github.com/timesheetIO/Android-API/blob/master/api/src/main/java/com/rauscha/apps/timesheet/api/constants/Actions.java
[6]: http://developer.android.com/images/brand/en_app_rgb_wo_60.png
[7]: https://play.google.com/store/apps/details?id=com.rauscha.apps.timesheet