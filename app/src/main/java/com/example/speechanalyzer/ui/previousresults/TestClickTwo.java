package com.example.speechanalyzer.ui.previousresults;

import android.content.Intent;

import com.example.speechanalyzer.NewProject;
import android.view.View;

public class TestClickTwo implements android.view.View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        Intent resultsIntent = new Intent(v.getContext(), NewProject.class);

        // Start the new activity.
        v.getContext().startActivity(resultsIntent);
    }
}
