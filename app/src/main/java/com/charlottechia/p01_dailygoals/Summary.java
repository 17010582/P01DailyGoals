package com.charlottechia.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView tvSummary = findViewById(R.id.textView8);
        Intent i = getIntent();
        String[] summary = i.getStringArrayExtra("summary");
        tvSummary.setText(getResources().getString(R.string.tv) + " : " + summary[0] + "\n" +
                getResources().getString(R.string.tv3) + " : " + summary[1] + "\n" +
                getResources().getString(R.string.tv5) + " : " + summary[2] + "\nReflection: " + summary[3]);
    }
}
