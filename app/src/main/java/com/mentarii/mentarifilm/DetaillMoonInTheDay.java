package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetaillMoonInTheDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill_moon_in_the_day);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }
}