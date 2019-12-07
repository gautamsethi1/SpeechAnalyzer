package com.example.speechanalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speechanalyzer.ui.previousresults.PreviousResultsFragment;

import java.util.ArrayList;

public class PreviousResults extends AppCompatActivity {
    public static final String IDENFTIFIER = "PreviousResultsActivity";
    //DBHelper myDataBaseHelper;
    ListView mylistView;
    //SQLiteDatabase database = myDataBaseHelper.getReadableDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previous_results_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PreviousResultsFragment.newInstance())
                    .commitNow();
        }
        DBHelper myDataBaseHelper = new DBHelper(this);

        SQLiteDatabase database = myDataBaseHelper.getReadableDatabase();

        Cursor d = database.rawQuery("SELECT FILLERWORDS FROM RESULTS", new String[]{});

        if (d!=null)
        {
            d.moveToFirst();
        }
        StringBuilder bob = new StringBuilder();

        do {
            String str = d.getString(0);
            bob.append("FILLERWORDS:"+str);
        }
        while(d.moveToNext());

        TextView vText = (TextView) findViewById(R.id.textView);
        
        vText.setText(bob.toString());
    }
}
