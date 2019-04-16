package com.charlottechia.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = findViewById(R.id.radioGroup);
                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                int q1 = rg.getCheckedRadioButtonId();
                int q2 = rg2.getCheckedRadioButtonId();
                int q3 = rg3.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(q1);
                RadioButton rb2 = findViewById(q2);
                RadioButton rb3 = findViewById(q3);
                String ans = rb1.getText().toString();
                String ans2 = rb2.getText().toString();
                String ans3 = rb3.getText().toString();
                
                EditText etRef = findViewById(R.id.editText);
                String[] summary = {ans, ans2, ans3, etRef.getText().toString()};
                Intent i = new Intent(MainActivity.this, Summary.class);
                i.putExtra("summary", summary);
                startActivity(i);
            }
        });
    }
}
