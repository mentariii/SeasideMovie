package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class rev_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_setting);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }
}