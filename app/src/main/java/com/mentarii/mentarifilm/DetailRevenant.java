package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailRevenant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_revenant);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }
}