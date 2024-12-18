package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class new_tagdrama extends AppCompatActivity {

    CardView cv_perfect, cv_love;
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tagdrama);

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(new_tagdrama.this, MainActivity.class);
            startActivity(Goiv_back);
        });
        cv_perfect = findViewById(R.id.cv_perfect);
        cv_perfect.setOnClickListener(view -> {
            Intent Gocv_perfect = new Intent(new_tagdrama.this, detail_perfect.class);
            startActivity(Gocv_perfect);
        });
        cv_love = findViewById(R.id.cv_love);
        cv_love.setOnClickListener(view -> {
            Intent Gocv_love = new Intent(new_tagdrama.this, detail_hardlove.class);
            startActivity(Gocv_love);
        });
    }
}