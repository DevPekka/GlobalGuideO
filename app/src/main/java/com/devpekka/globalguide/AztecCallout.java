package com.devpekka.globalguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AztecCallout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aztec_callout);

        getSupportActionBar().setTitle("AZTEC CALL-OUT");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
