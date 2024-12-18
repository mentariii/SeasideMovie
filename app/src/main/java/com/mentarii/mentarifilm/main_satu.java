package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;

public class main_satu extends AppCompatActivity {

    ButtonBarLayout button_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_satu);

        button_view = findViewById(R.id.button_view);

        button_view.setOnClickListener(view -> {

            Intent Gobutton_view = new Intent(main_satu.this, jumlahEpisode.class);
            startActivity(Gobutton_view);
        });


    }
}