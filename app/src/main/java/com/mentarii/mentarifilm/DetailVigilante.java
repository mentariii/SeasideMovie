package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailVigilante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vigilante);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }
}