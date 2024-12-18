package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class jumlahEpisode extends AppCompatActivity {

    TextView tv_gteps1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah_episode);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        tv_gteps1 = findViewById(R.id.tv_gteps1);
        tv_gteps1.setOnClickListener(view -> {
            Intent Gotv_gteps1 = new Intent(jumlahEpisode.this, detailGifted1.class);
            startActivity(Gotv_gteps1);
        });

    }
}