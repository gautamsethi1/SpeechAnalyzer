package com.example.speechanalyzer;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataInput extends AppCompatActivity {
    Button btnm;
    private SQLiteDatabase dB;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        final DBHelper db = new DBHelper(this);
        text = (EditText)findViewById(R.id.textInput);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                btnm = findViewById(R.id.dbButton);
                btnm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String FillWord = text.getText().toString();
                        db.insert(FillWord,dB);
                    }
                });
            }
        });

    }

}
