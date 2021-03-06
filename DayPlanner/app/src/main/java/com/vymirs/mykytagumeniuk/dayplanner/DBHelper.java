package com.vymirs.mykytagumeniuk.dayplanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nikita on 12/14/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "db.sqlite";
    public static final String TASKS_TABLE = "TASKSTABLE";
    public static final String NAME_OF_TASK = "NAME_OF_TASK";
    public static final String DATE_OF_TASK = "DATE_OF_TASK";
    public static final String DESCRIPTION_OF_TASK = "DESCRIPTION_OF_TASK";
    public static final String STATUS_OF_TASK = "STATUS_OF_TASK";
    public static final String STATUS_COMPLETED = "Completed";
    public static final String STATUS_IN_PROGRESS = "In_progress";
    public static final String STATUS_UNCOMPLETED = "Uncompleted";
    public static final String ID = "ID";
    public static final String TIME_OF_TASK = "TIME_OF_TASK" ;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TASKS_TABLE + " (" + ID +
                " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME_OF_TASK + " TEXT, "
                + DATE_OF_TASK + " TEXT, " + TIME_OF_TASK + " TEXT, " + DESCRIPTION_OF_TASK + " TEXT, " + STATUS_OF_TASK + " TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
