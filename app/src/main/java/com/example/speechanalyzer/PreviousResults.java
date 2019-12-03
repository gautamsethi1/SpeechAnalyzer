package com.example.speechanalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.speechanalyzer.ui.previousresults.PreviousResultsFragment;

public class PreviousResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previous_results_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PreviousResultsFragment.newInstance())
                    .commitNow();
        }
    }
}
