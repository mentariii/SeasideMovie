package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_romance extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_love, cv_blacklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_romance);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_romance.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_love = findViewById(R.id.cv_love);
        cv_love.setOnClickListener(view -> {
            Intent Gocv_love = new Intent(tagar_romance.this, detail_hardlove.class);
            startActivity(Gocv_love);
        });
        cv_blacklist = findViewById(R.id.cv_blacklist);
        cv_blacklist.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_romance.this, detail_blacklist.class);
            startActivity(Goiv_back);
        });
    }
}