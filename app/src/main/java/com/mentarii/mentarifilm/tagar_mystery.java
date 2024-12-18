package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_mystery extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_blacklist, cv_gifted, cv_myname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_mystery);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_mystery.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_blacklist = findViewById(R.id.cv_blacklist);
        cv_blacklist.setOnClickListener(view -> {
            Intent Gocv_blacklist = new Intent(tagar_mystery.this, detail_blacklist.class);
            startActivity(Gocv_blacklist);
        });
        cv_gifted = findViewById(R.id.cv_gifted);
        cv_gifted.setOnClickListener(view -> {
            Intent Gocv_gifted = new Intent(tagar_mystery.this, TheGiftedd_detail.class);
            startActivity(Gocv_gifted);
        });
        cv_myname = findViewById(R.id.cv_myname);
        cv_myname.setOnClickListener(view -> {
            Intent Gocv_myname = new Intent(tagar_mystery.this, detail_myname.class);
            startActivity(Gocv_myname);
        });
    }
}