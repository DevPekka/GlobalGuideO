package com.devpekka.globalguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Austria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_austria);

        getSupportActionBar().setTitle("Austria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
