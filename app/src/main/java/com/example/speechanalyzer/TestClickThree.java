package com.example.speechanalyzer;

import android.content.Intent;

import com.example.speechanalyzer.DataInput;
import android.view.View;

public class TestClickThree implements android.view.View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        Intent resultsIntent = new Intent(v.getContext(), DataInput.class);

        // Start the new activity.
        v.getContext().startActivity(resultsIntent);
    }
}

