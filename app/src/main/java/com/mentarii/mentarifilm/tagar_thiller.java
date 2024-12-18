package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_thiller extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_gifted, cv_myname, cv_insidious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_thiller);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_thiller.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_gifted = findViewById(R.id.cv_gifted);
        cv_gifted.setOnClickListener(view -> {
            Intent Gocv_gifted = new Intent(tagar_thiller.this, TheGiftedd_detail.class);
            startActivity(Gocv_gifted);
        });
        cv_myname = findViewById(R.id.cv_myname);
        cv_myname.setOnClickListener(view -> {
            Intent Gocv_myname = new Intent(tagar_thiller.this, detail_myname.class);
            startActivity(Gocv_myname);
        });
        cv_insidious = findViewById(R.id.cv_insidious);
        cv_insidious.setOnClickListener(view -> {
            Intent Gocv_insidious = new Intent(tagar_thiller.this, detail_insidious.class);
            startActivity(Gocv_insidious);
        });
    }
}