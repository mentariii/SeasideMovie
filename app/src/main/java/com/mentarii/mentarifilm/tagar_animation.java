package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_animation extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_frozen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_animation);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_animation.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_frozen2 = findViewById(R.id.cv_frozen2);
        cv_frozen2.setOnClickListener(view -> {
            Intent Gocv_frozen2 = new Intent(tagar_animation.this, detail_frozen2.class);
            startActivity(Gocv_frozen2);
        });
    }
}