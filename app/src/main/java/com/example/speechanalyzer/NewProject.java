package com.example.speechanalyzer;

import android.media.MediaRecorder;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class NewProject extends AppCompatActivity implements View.OnClickListener {
    Button buttonNew;
    Button startButton;
    Button stopButton;
    String location;
    MediaRecorder recorder = new MediaRecorder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        buttonNew = findViewById(R.id.MLButton);
        startButton = findViewById(R.id.button2);
        stopButton = findViewById(R.id.button3);
        buttonNew.setOnClickListener(new TestClickThree());

        startButton.setOnClickListener(this);

        stopButton.setOnClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                recorder.start();
                break;
            case R.id.button3:
                recorder.stop();
                break;
        }

    }
}
