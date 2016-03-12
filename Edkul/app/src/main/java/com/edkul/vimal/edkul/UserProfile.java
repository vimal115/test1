package com.edkul.vimal.edkul;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        ImageView img1 = (ImageView) findViewById(R.id.rectimage1);
        img1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Subscribe_Course.class);
                startActivity(intentMain);
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.rectimage2);
        img2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Manage_test.class);
                startActivity(intentMain);
            }
        });
        ImageView img3 = (ImageView) findViewById(R.id.rectimage3);
        img3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Scheduler.class);
                startActivity(intentMain);
            }
        });
        ImageView img4 = (ImageView) findViewById(R.id.rectimage4);
        img4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Library.class);
                startActivity(intentMain);
            }
        });
        ImageView img5 = (ImageView) findViewById(R.id.rectimage5);
        img5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Marketing.class);
                startActivity(intentMain);
            }
        });
        ImageView img6 = (ImageView) findViewById(R.id.rectimage6);
        img6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent(UserProfile.this,
                        Updates.class);
                startActivity(intentMain);
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
