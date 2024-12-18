package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class search extends AppCompatActivity {

    CardView tag_thlr;
    CardView tag_fntsy;
    CardView tag_rmnce;
    CardView tag_hrr;
    CardView tag_mster;
    CardView tag_cmdy;
    CardView tag_advn;
    CardView tag_act;
    CardView tag_anm;
    CardView tag_drm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        tag_thlr = findViewById(R.id.tag_thlr);
        tag_thlr.setOnClickListener(view -> {
            Intent Gotag_thlr = new Intent(search.this, tagar_thiller.class);
            startActivity(Gotag_thlr);
        });

        tag_fntsy = findViewById(R.id.tag_fntsy);
        tag_fntsy.setOnClickListener(view -> {
            Intent Gotag_fntsy = new Intent(search.this, tagar_fantasy.class);
            startActivity(Gotag_fntsy);
        });

        tag_rmnce = findViewById(R.id.tag_rmnce);
        tag_rmnce.setOnClickListener(view -> {
            Intent Gotag_rmnce = new Intent(search.this, tagar_romance.class);
            startActivity(Gotag_rmnce);
        });

        tag_hrr = findViewById(R.id.tag_hrr);
        tag_hrr.setOnClickListener(view -> {
            Intent Gotag_hrr = new Intent(search.this, tagar_horror.class);
            startActivity(Gotag_hrr);
        });

        tag_mster = findViewById(R.id.tag_mster);
        tag_mster.setOnClickListener(view -> {
            Intent Gotag_mster = new Intent(search.this, tagar_mystery.class);
            startActivity(Gotag_mster);
        });

        tag_cmdy = findViewById(R.id.tag_cmdy);
        tag_cmdy.setOnClickListener(view -> {
            Intent Gotag_cmdy = new Intent(search.this, tagar_comedy.class);
            startActivity(Gotag_cmdy);
        });

        tag_act = findViewById(R.id.tag_act);
        tag_act.setOnClickListener(view -> {
            Intent Gotag_act = new Intent(search.this, tagar_action.class);
            startActivity(Gotag_act);
        });

        tag_advn = findViewById(R.id.tag_advn);
        tag_advn.setOnClickListener(view -> {
            Intent Gotag_advn = new Intent(search.this, tagar_adventure.class);
            startActivity(Gotag_advn);
        });
        tag_anm = findViewById(R.id.tag_anm);
        tag_anm.setOnClickListener(view -> {
            Intent Gotag_anm = new Intent(search.this, tagar_animation.class);
            startActivity(Gotag_anm);
        });

        tag_drm = findViewById(R.id.tag_drm);
        tag_drm.setOnClickListener(view -> {
            Intent Gotag_anm = new Intent(search.this, new_tagdrama.class);
            startActivity(Gotag_anm);
        });

    }
}