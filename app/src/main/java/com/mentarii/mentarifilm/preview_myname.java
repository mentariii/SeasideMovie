package com.mentarii.mentarifilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class preview_myname extends AppCompatActivity {

    ImageView iv_back;
    private ImageView ini_menu;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_myname);

        ini_menu = findViewById(R.id.ini_menu);
        ini_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(preview_myname.this, ini_menu);
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
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            Intent Goiv_back = new Intent(preview_myname.this, detail_myname.class);
            startActivity(Goiv_back);
        });
    }
}