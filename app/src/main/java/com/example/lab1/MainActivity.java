package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = "50";
        TextView t = (TextView) findViewById(R.id.counterOutput);
        t.setText(counter);
    }

    public void onClickIncrementButton(View V){
        TextView t = (TextView) findViewById(R.id.counterOutput);
        int intCounter = Integer.parseInt(counter);
        ++intCounter;
        counter = String.valueOf(intCounter);
        t.setText(counter);
    }

    public void onClickDecrementButton(View V){
        TextView t = (TextView) findViewById(R.id.counterOutput);
        int intCounter = Integer.parseInt(counter);
        --intCounter;
        counter = String.valueOf(intCounter);
        t.setText(counter);
    }
}