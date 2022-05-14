package com.samsung.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateIntervalFormat;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int IDs[] = {
            R.id.button0,
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.buttonpl,
            R.id.buttonpm,
            R.id.buttonAC,
            R.id.buttonk,
            R.id.buttonhav,
            R.id.buttont,
            R.id.buttonb,
            R.id.buttonx,
            R.id.buttonmin,
    };
    TextView texts[] = new TextView[IDs.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.textView);
        for (int i = 0; i < IDs.length; i++) {
                texts[i] = findViewById(IDs[i]);
                
        }
    }
}