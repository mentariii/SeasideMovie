package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class recent extends AppCompatActivity {

    CardView tag_horror;
    CardView tag_animation;
    CardView tag_fantasy;
    CardView tag_romance;
    CardView tag_thiller;
    CardView tag_mystery;
    CardView tag_comedy;
    CardView tag_action;
    CardView cv_frozen2, cv_blacklist, cv_harry, cv_wakanda, cv_myname, cv_gifted,cv_love,cv_perfect, cv_alice, cv_insidious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        cv_harry = findViewById(R.id.cv_harry);
        cv_harry.setOnClickListener(view -> {
            Intent Gocv_harry = new Intent(recent.this, detailHarryPotter.class);
            startActivity(Gocv_harry);
        });
        cv_frozen2 = findViewById(R.id.cv_frozen2);
        cv_frozen2.setOnClickListener(view -> {
            Intent Gocv_frozen2 = new Intent(recent.this, detail_frozen2.class);
            startActivity(Gocv_frozen2);
        });
        cv_wakanda = findViewById(R.id.cv_wakanda);
        cv_wakanda.setOnClickListener(view -> {
            Intent Gocv_wakanda = new Intent(recent.this, detail_wakanda.class);
            startActivity(Gocv_wakanda);
        });
        cv_alice = findViewById(R.id.cv_alice);
        cv_alice.setOnClickListener(view -> {
            Intent Gocv_alice = new Intent(recent.this, detail_alice.class);
            startActivity(Gocv_alice);
        });

        cv_gifted = findViewById(R.id.cv_gifted);
        cv_gifted.setOnClickListener(view -> {
            Intent Gocv_gifted = new Intent(recent.this, TheGiftedd_detail.class);
            startActivity(Gocv_gifted);
        });
        cv_myname = findViewById(R.id.cv_myname);
        cv_myname.setOnClickListener(view -> {
            Intent Gocv_myname = new Intent(recent.this, detail_myname.class);
            startActivity(Gocv_myname);
        });
        cv_insidious = findViewById(R.id.cv_insidious);
        cv_insidious.setOnClickListener(view -> {
            Intent Gocv_insidious = new Intent(recent.this, detail_insidious.class);
            startActivity(Gocv_insidious);
        });

        cv_blacklist = findViewById(R.id.cv_blacklist);
        cv_blacklist.setOnClickListener(view -> {
            Intent Gocv_blacklist = new Intent(recent.this, detail_blacklist.class);
            startActivity(Gocv_blacklist);
        });

        tag_horror = findViewById(R.id.tag_horror);
        tag_horror.setOnClickListener(view -> {
            Intent Gotag_horror = new Intent(recent.this, tagar_horror.class);
            startActivity(Gotag_horror);
        });
        tag_animation = findViewById(R.id.tag_animation);
        tag_animation.setOnClickListener(view -> {
            Intent Gotag_animation = new Intent(recent.this, tagar_animation.class);
            startActivity(Gotag_animation);
        });
        tag_fantasy = findViewById(R.id.tag_fantasy);
        tag_fantasy.setOnClickListener(view -> {
            Intent Gotag_fantasy = new Intent(recent.this, tagar_fantasy.class);
            startActivity(Gotag_fantasy);
        });
        tag_romance = findViewById(R.id.tag_romance);
        tag_romance.setOnClickListener(view -> {
            Intent Gotag_romance = new Intent(recent.this, tagar_romance.class);
            startActivity(Gotag_romance);
        });
        tag_thiller = findViewById(R.id.tag_thiller);
        tag_thiller.setOnClickListener(view -> {
            Intent Gotag_thiller = new Intent(recent.this, tagar_thiller.class);
            startActivity(Gotag_thiller);
        });
        tag_mystery = findViewById(R.id.tag_mystery);
        tag_mystery.setOnClickListener(view -> {
            Intent Gotag_mystery = new Intent(recent.this, tagar_mystery.class);
            startActivity(Gotag_mystery);
        });
        tag_comedy = findViewById(R.id.tag_comedy);
        tag_comedy.setOnClickListener(view -> {
            Intent Gotag_comedy = new Intent(recent.this, tagar_comedy.class);
            startActivity(Gotag_comedy);
        });
        tag_action = findViewById(R.id.tag_action);
        tag_action.setOnClickListener(view -> {
            Intent Gotag_action = new Intent(recent.this, tagar_action.class);
            startActivity(Gotag_action);
        });
        cv_perfect = findViewById(R.id.cv_perfect);
        cv_perfect.setOnClickListener(view -> {
            Intent Gocv_perfect = new Intent(recent.this, detail_perfect.class);
            startActivity(Gocv_perfect);
        });
        cv_love = findViewById(R.id.cv_love);
        cv_love.setOnClickListener(view -> {
            Intent Gocv_love = new Intent(recent.this, detail_hardlove.class);
            startActivity(Gocv_love);
        });
    }
}