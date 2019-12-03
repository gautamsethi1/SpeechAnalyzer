package com.example.speechanalyzer.ui.previousresults;

import android.content.Intent;
import com.example.speechanalyzer.PreviousResults;
import android.view.View;

public class TestClick implements android.view.View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        Intent resultsIntent = new Intent(v.getContext(), PreviousResults.class);

        // Start the new activity.
        v.getContext().startActivity(resultsIntent);
    }
}
