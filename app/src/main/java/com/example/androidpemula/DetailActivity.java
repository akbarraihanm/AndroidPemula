package com.example.androidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static String infoPres = "a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        infoPres = intent.getStringExtra(MainActivity.EXTRA_INFO);
        String lahirPres = intent.getStringExtra(MainActivity.EXTRA_LAHIR);
        String wafatPres = intent.getStringExtra(MainActivity.EXTRA_WAFAT);
        String tinggiPres = intent.getStringExtra(MainActivity.EXTRA_TINGGI);
    }
}
