package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class tagar_action extends AppCompatActivity {

    ImageView iv_back;
    CardView cv_myname, cv_blacklist, cv_perfect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagar_action);
        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(tagar_action.this, MainActivity.class);
            startActivity(Goiv_back);
        });

        cv_myname = findViewById(R.id.cv_myname);
        cv_myname.setOnClickListener(view -> {
            Intent Gocv_myname = new Intent(tagar_action.this, detail_myname.class);
            startActivity(Gocv_myname);
        });
        cv_blacklist = findViewById(R.id.cv_blacklist);
        cv_blacklist.setOnClickListener(view -> {
            Intent Gocv_blacklist = new Intent(tagar_action.this, detail_blacklist.class);
            startActivity(Gocv_blacklist);
        });
        cv_perfect = findViewById(R.id.cv_perfect);
        cv_perfect.setOnClickListener(view -> {
            Intent Gocv_perfect = new Intent(tagar_action.this, detail_perfect.class);
            startActivity(Gocv_perfect);
        });
    }
}