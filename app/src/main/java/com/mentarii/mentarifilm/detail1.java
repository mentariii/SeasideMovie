package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;

public class detail1 extends AppCompatActivity {

    ButtonBarLayout button_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        button_view = findViewById(R.id.button_view);

        button_view.setOnClickListener(view -> {

            Intent Gobutton_view = new Intent(detail1.this, jumlahEpisode.class);
            startActivity(Gobutton_view);
        });

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }


    }
}