package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_fantasy extends AppCompatActivity {
    ImageView iv_back;
    CardView cv_harry, cv_frozen2, cv_wakanda, cv_alice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_fantasy);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_fantasy.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_harry = findViewById(R.id.cv_harry);
        cv_harry.setOnClickListener(view -> {
            Intent Gocv_harry = new Intent(tagar_fantasy.this, detailHarryPotter.class);
            startActivity(Gocv_harry);
        });
        cv_frozen2 = findViewById(R.id.cv_frozen2);
        cv_frozen2.setOnClickListener(view -> {
            Intent Gocv_frozen2 = new Intent(tagar_fantasy.this, detail_frozen2.class);
            startActivity(Gocv_frozen2);
        });
        cv_wakanda = findViewById(R.id.cv_wakanda);
        cv_wakanda.setOnClickListener(view -> {
            Intent Gocv_wakanda = new Intent(tagar_fantasy.this, detail_wakanda.class);
            startActivity(Gocv_wakanda);
        });
        cv_alice = findViewById(R.id.cv_alice);
        cv_alice.setOnClickListener(view -> {
            Intent Gocv_alice = new Intent(tagar_fantasy.this, detail_alice.class);
            startActivity(Gocv_alice);
        });
    }
}