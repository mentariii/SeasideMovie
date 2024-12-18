package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_horror extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_insidious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_horror);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_horror.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_insidious = findViewById(R.id.cv_insidious);
        cv_insidious.setOnClickListener(view -> {
            Intent Gocv_insidious = new Intent(tagar_horror.this, detail_insidious.class);
            startActivity(Gocv_insidious);
        });
    }
}