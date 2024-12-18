package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_comedy extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_perfect, cv_love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_comedy);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_comedy.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_perfect = findViewById(R.id.cv_perfect);
        cv_perfect.setOnClickListener(view -> {
            Intent Gocv_perfect = new Intent(tagar_comedy.this, detail_perfect.class);
            startActivity(Gocv_perfect);
        });
        cv_love = findViewById(R.id.cv_love);
        cv_love.setOnClickListener(view -> {
            Intent Gocv_love = new Intent(tagar_comedy.this, detail_hardlove.class);
            startActivity(Gocv_love);
        });
    }
}