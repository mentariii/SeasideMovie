package com.mentarii.mentarifilm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class detail_blacklist extends AppCompatActivity {

    CardView btn_view2, cv_add, iv_close, cv_start;
    ImageView iv_back;
    private ImageView ini_menu;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_blacklist);

        View alerrtCustomDialog = LayoutInflater.from(detail_blacklist.this).inflate(R.layout.wishlist, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(detail_blacklist.this);
        alertDialog.setView(alerrtCustomDialog);
        iv_close = (CardView) alerrtCustomDialog.findViewById(R.id.iv_close);
        cv_start = (CardView) alerrtCustomDialog.findViewById(R.id.cv_start);
        final AlertDialog dialog = alertDialog.create();
        findViewById(R.id.cv_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                Toast.makeText(detail_blacklist.this, "Canceled", Toast.LENGTH_SHORT).show();
            }
        });
        cv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                Toast.makeText(detail_blacklist.this, "Added", Toast.LENGTH_SHORT).show();
            }
        });


        ImageView share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String body = "Masukkan text";
                String sub = "Share Film";
                intent.putExtra(Intent.EXTRA_SUBJECT, body);
                intent.putExtra(Intent.EXTRA_TEXT, sub);
                startActivity(Intent.createChooser(intent, "Sharing Option"));

            }});

        ini_menu = findViewById(R.id.ini_menu);
        ini_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(detail_blacklist.this, ini_menu);
                popupMenu.getMenuInflater().inflate(R.menu.daftar_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.menu_download:
                                toast = Toast.makeText(getBaseContext(), "Downloaded",Toast.LENGTH_SHORT);
                                toast.show();
                                break;

                            case R.id.menu_report:
                                toast = Toast.makeText(getBaseContext(), "Success Reported!",Toast.LENGTH_SHORT);
                                toast.show();
                                break;
                            case R.id.menu_wish:
                                toast = Toast.makeText(getBaseContext(), "Added to wislist",Toast.LENGTH_SHORT);
                                toast.show();
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        btn_view2 = findViewById(R.id.btn_view2);
        btn_view2.setOnClickListener(view -> {
            Intent Gotv_more = new Intent(detail_blacklist.this, preview_blacklist.class);
            startActivity(Gotv_more);
        });
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(detail_blacklist.this, MainActivity.class);
            startActivity(Goiv_back);
        });


    }
}