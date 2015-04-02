Timesheet API
=========

Timesheet API for Android™

**See http://timesheet.io for more information.**

![Timesheet][3]

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
Timesheet uses the [ContentProvider][2]. Just use one of the provided Data Queries to retrieve the data: 
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

## Developed By

* Florian Rauscha


## License

    Copyright 2012 Florian Rauscha

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[2]: http://developer.android.com/guide/topics/providers/content-provider-basics.html
[3]: http://timesheet.io/app/img/tabletSmall.png
[4]: https://github.com/timesheetIO/Android-API/blob/master/api/src/main/java/com/rauscha/apps/timesheet/api/utils/IntentUtils.java
[5]: https://github.com/timesheetIO/Android-API/blob/master/api/src/main/java/com/rauscha/apps/timesheet/api/constants/Actions.java
