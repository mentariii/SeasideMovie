package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailMyDemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_my_demon);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }
}