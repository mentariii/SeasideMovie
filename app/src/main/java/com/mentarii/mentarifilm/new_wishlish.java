package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class new_wishlish extends AppCompatActivity {

    CardView btn_browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_wishlish);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        btn_browse = findViewById(R.id.btn_browse);
        btn_browse.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(new_wishlish.this, search.class);
            startActivity(Goiv_back);
        });
    }
}