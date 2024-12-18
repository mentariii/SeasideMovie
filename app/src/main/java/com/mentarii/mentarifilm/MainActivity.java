package com.mentarii.mentarifilm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton tombol_cari;
    ImageView iv_thegifted;
    CardView tag_horror;
    CardView tag_animation;
    CardView tag_fantasy;
    CardView tag_romance;
    CardView tag_thiller;
    CardView tag_mystery;
    CardView tag_comedy;
    CardView tag_action;
    ImageView iv_insidious;
    ImageView iv_myname;
    ImageView iv_frozen2;
    ImageView iv_blacklist;
    ImageView iv_heri;
    ImageView iv_alice;
    ImageView iv_perfect;
    ImageView iv_hardlove;
    ImageView iv_wakanda;
    CardView cv_myname;
    CardView cv_stranger;
    CardView cv_wakanda;
    CardView cv_blacklist;
    CardView cv_frozen2;
    TextView tv_more, dec2, dec1;
    CircleImageView profile;
    private ImageView ini_menu;
    private Toast toast;
    private CardView premium_cus;
    private ImageView popup;
    ImageView iv_close, iv_close2, list;
    CardView cv_start;
    LinearLayout heri1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //popup premium
        View alerrtCustomDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.premium_cus, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setView(alerrtCustomDialog);
        iv_close = (ImageView) alerrtCustomDialog.findViewById(R.id.iv_close);
        cv_start = (CardView) alerrtCustomDialog.findViewById(R.id.cv_start);
        final AlertDialog dialog = alertDialog.create();
        findViewById(R.id.btn_prem).setOnClickListener(new View.OnClickListener() {
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
            }
        });
        cv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                Toast.makeText(MainActivity.this, "free trial started", Toast.LENGTH_SHORT).show();
            }
        });
        //popup device
        View alerrtdevice = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup_device, null);
        AlertDialog.Builder alerrtpopdevice = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setView(alerrtdevice);
        iv_close = (ImageView) alerrtdevice.findViewById(R.id.iv_close);


        final AlertDialog dialog1 = alertDialog.create();
        findViewById(R.id.device).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog1.show();
            }
        });

        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.cancel();
            }
        });

        View alerrtlist = LayoutInflater.from(MainActivity.this).inflate(R.layout.list, null);
        AlertDialog.Builder alerrpoptlist = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setView(alerrtlist);
        heri1 = (LinearLayout) alerrtlist.findViewById(R.id.heri1);


        final AlertDialog dialog2 = alertDialog.create();
        findViewById(R.id.list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.show();
            }
        });

        heri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.cancel();
            }
        });





        //ke activity search
        tombol_cari = findViewById(R.id.tombol_cari);
        tombol_cari.setOnClickListener(view -> {
            Intent Gotombol_cari = new Intent(MainActivity.this, search.class);
            startActivity(Gotombol_cari);
        });
        //ke detail
        iv_thegifted = findViewById(R.id.iv_thegifted);
        iv_thegifted.setOnClickListener(view -> {
            Intent Goiv_thegifted = new Intent(MainActivity.this, TheGiftedd_detail.class);
            startActivity(Goiv_thegifted);
        });
        profile = findViewById(R.id.profile);
        profile.setOnClickListener(view -> {
            Intent Goprofile = new Intent(MainActivity.this, profile.class);
            startActivity(Goprofile);
        });
        tag_horror = findViewById(R.id.tag_horror);
        tag_horror.setOnClickListener(view -> {
            Intent Gotag_horror = new Intent(MainActivity.this, tagar_horror.class);
            startActivity(Gotag_horror);
        });
        tag_animation = findViewById(R.id.tag_animation);
        tag_animation.setOnClickListener(view -> {
            Intent Gotag_animation = new Intent(MainActivity.this, tagar_animation.class);
            startActivity(Gotag_animation);
        });
        tag_fantasy = findViewById(R.id.tag_fantasy);
        tag_fantasy.setOnClickListener(view -> {
            Intent Gotag_fantasy = new Intent(MainActivity.this, tagar_fantasy.class);
            startActivity(Gotag_fantasy);
        });
        tag_romance = findViewById(R.id.tag_romance);
        tag_romance.setOnClickListener(view -> {
            Intent Gotag_romance = new Intent(MainActivity.this, tagar_romance.class);
            startActivity(Gotag_romance);
        });
        tag_thiller = findViewById(R.id.tag_thiller);
        tag_thiller.setOnClickListener(view -> {
            Intent Gotag_thiller = new Intent(MainActivity.this, tagar_thiller.class);
            startActivity(Gotag_thiller);
        });
        tag_mystery = findViewById(R.id.tag_mystery);
        tag_mystery.setOnClickListener(view -> {
            Intent Gotag_mystery = new Intent(MainActivity.this, tagar_mystery.class);
            startActivity(Gotag_mystery);
        });
        tag_comedy = findViewById(R.id.tag_comedy);
        tag_comedy.setOnClickListener(view -> {
            Intent Gotag_comedy = new Intent(MainActivity.this, tagar_comedy.class);
            startActivity(Gotag_comedy);
        });
        tag_action = findViewById(R.id.tag_action);
        tag_action.setOnClickListener(view -> {
            Intent Gotag_action = new Intent(MainActivity.this, tagar_action.class);
            startActivity(Gotag_action);
        });
        iv_insidious = findViewById(R.id.iv_insidious);
        iv_insidious.setOnClickListener(view -> {
            Intent Goiv_insidious = new Intent(MainActivity.this, detail_insidious.class);
            startActivity(Goiv_insidious);
        });
        iv_myname = findViewById(R.id.iv_myname);
        iv_myname.setOnClickListener(view -> {
            Intent Goiv_myname = new Intent(MainActivity.this, detail_myname.class);
            startActivity(Goiv_myname);
        });
        iv_frozen2 = findViewById(R.id.iv_frozen2);
        iv_frozen2.setOnClickListener(view -> {
            Intent Goiv_frozen2 = new Intent(MainActivity.this, detail_frozen2.class);
            startActivity(Goiv_frozen2);
        });
        iv_blacklist = findViewById(R.id.iv_blacklist);
        iv_blacklist.setOnClickListener(view -> {
            Intent Goiv_blacklist = new Intent(MainActivity.this, detail_blacklist.class);
            startActivity(Goiv_blacklist);
        });
        iv_heri = findViewById(R.id.iv_heri);
        iv_heri.setOnClickListener(view -> {
            Intent Goiv_heri = new Intent(MainActivity.this, detailHarryPotter.class);
            startActivity(Goiv_heri);
        });
        iv_alice = findViewById(R.id.iv_alice);
        iv_alice.setOnClickListener(view -> {
            Intent Goiv_alice = new Intent(MainActivity.this, detail_alice.class);
            startActivity(Goiv_alice);
        });
        iv_perfect = findViewById(R.id.iv_perfect);
        iv_perfect.setOnClickListener(view -> {
            Intent Goiv_perfect = new Intent(MainActivity.this, detail_perfect.class);
            startActivity(Goiv_perfect);
        });
        iv_hardlove = findViewById(R.id.iv_hardlove);
        iv_hardlove.setOnClickListener(view -> {
            Intent Goiv_hardlove = new Intent(MainActivity.this, detail_hardlove.class);
            startActivity(Goiv_hardlove);
        });
        iv_wakanda = findViewById(R.id.iv_wakanda);
        iv_wakanda.setOnClickListener(view -> {
            Intent Goiv_wakanda = new Intent(MainActivity.this, detail_wakanda.class);
            startActivity(Goiv_wakanda);
        });
        cv_myname = findViewById(R.id.cv_myname);
        cv_myname.setOnClickListener(view -> {
            Intent Gocv_myname = new Intent(MainActivity.this, DetaillMoonInTheDay.class);
            startActivity(Gocv_myname);
        });
        cv_stranger = findViewById(R.id.cv_stranger);
        cv_stranger.setOnClickListener(view -> {
            Intent Gocv_stranger = new Intent(MainActivity.this, DetailMoving.class);
            startActivity(Gocv_stranger);
        });
        cv_wakanda = findViewById(R.id.cv_wakanda);
        cv_wakanda.setOnClickListener(view -> {
            Intent Gocv_wakanda = new Intent(MainActivity.this, DetailMyDemon.class);
            startActivity(Gocv_wakanda);
        });
        cv_blacklist = findViewById(R.id.cv_blacklist);
        cv_blacklist.setOnClickListener(view -> {
            Intent Gocv_blacklist = new Intent(MainActivity.this, DetailRevenant.class);
            startActivity(Gocv_blacklist);
        });
        cv_frozen2 = findViewById(R.id.cv_frozen2);
        cv_frozen2.setOnClickListener(view -> {
            Intent Gocv_frozen2 = new Intent(MainActivity.this, DetailVigilante.class);
            startActivity(Gocv_frozen2);
        });
        tv_more = findViewById(R.id.tv_more);
        tv_more.setOnClickListener(view -> {
            Intent Gotv_more = new Intent(MainActivity.this, detailHarryPotter.class);
            startActivity(Gotv_more);
        });
        dec2 = findViewById(R.id.dec2);
        dec2.setOnClickListener(view -> {
            Intent Godec2 = new Intent(MainActivity.this, detailHarryPotter.class);
            startActivity(Godec2);
        });
        dec1 = findViewById(R.id.dec1);
        dec1.setOnClickListener(view -> {
            Intent Godec1 = new Intent(MainActivity.this, detailHarryPotter.class);
            startActivity(Godec1);
        });

        if (getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        //menu
        ini_menu = findViewById(R.id.ini_menu);
        ini_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, ini_menu);
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

    }
//EXIT
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Hey, are u sure?")
                .setPositiveButton("yeah, why?", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("wait more", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .show();
    }
}