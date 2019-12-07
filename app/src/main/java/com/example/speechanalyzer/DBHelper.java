package com.example.speechanalyzer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;

public class DBHelper extends SQLiteOpenHelper
{
public static final String dB_name = "PreviousResults.db";
public static final String tableName = "previous_results";
private SQLiteDatabase dB;

public DBHelper(Context context)
{
    super(context, dB_name, null,1);
}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table = "CREATE TABLE RESULTS(_id INTEGER PRIMARY KEY AUTOINCREMENT, FillerWords TEXT)";
        db.execSQL(table);
        insert("hello",db);
    }

    public void insert(String FillWord, SQLiteDatabase database)
    {
        ContentValues word = new ContentValues();
        word.put("FillerWords",FillWord);
        database.insert("RESULTS", null, word);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + tableName);
    }
}
