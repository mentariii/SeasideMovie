package com.mentarii.mentarifilm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class profile extends AppCompatActivity {

    Spinner bahasa;
    ImageView iv_setting;
    CardView cv_start, btn_browse;
    TextView tv_wishlist, tv_donglot, tv_recent, angka_wl, angka_dl, angka_rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //popup comingsoon


        //spinner
        bahasa = findViewById(R.id.bahasa);
        String[] value = {"ENG", "IND"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.spinner_des, arrayList);
        bahasa.setAdapter(arrayAdapter);;

        //hide act bar
        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        //move activity
        iv_setting = findViewById(R.id.iv_setting);
        iv_setting.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(profile.this, rev_setting.class);
            startActivity(Goiv_back);
        });

        angka_dl = findViewById(R.id.angka_dl);
        angka_dl.setOnClickListener(view -> {
            Intent Goangka_dl = new Intent(profile.this, donglot.class);
            startActivity(Goangka_dl);
        });

        angka_rc = findViewById(R.id.angka_rc);
        angka_rc.setOnClickListener(view -> {
            Intent Gorc = new Intent(profile.this, recent.class);
            startActivity(Gorc);
        });

        angka_wl = findViewById(R.id.angka_wl);
        angka_wl.setOnClickListener(view -> {
            Intent Goangka_wl = new Intent(profile.this, new_wishlish.class);
            startActivity(Goangka_wl);
        });



        tv_donglot = findViewById(R.id.tv_donglot);
        tv_donglot.setOnClickListener(view -> {
            Intent Godonglot = new Intent(profile.this, donglot.class);
            startActivity(Godonglot);
        });

        tv_wishlist = findViewById(R.id.tv_wishlist);
        tv_wishlist.setOnClickListener(view -> {
            Intent Gotv_wishlist = new Intent(profile.this, new_wishlish.class);
            startActivity(Gotv_wishlist);
        });

        tv_recent = findViewById(R.id.tv_recent);
        tv_recent.setOnClickListener(view -> {
            Intent Gotv_recent = new Intent(profile.this, recent.class);
            startActivity(Gotv_recent);
        });
    }
}