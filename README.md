# NavHeaderIssue
Demonstration of the issue with accessing views in the headerLayout with version 23.1.0 of the support library

Views are null in onCreate and onResume, but at a later time they can be accessed as demonstrated by pressing the "CHECK" button in the toolbar.

This is a regression from version 23.0.1.
