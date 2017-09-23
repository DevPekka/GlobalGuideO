package com.devpekka.globalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class aztec extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aztec);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Aztec");
        getSupportActionBar().setIcon(R.mipmap.t_launcher);

        configureCall();

    }
    public void configureCall(){
        Button btn = (Button) findViewById(R.id.callout1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aztec.this, AztecCallout.class));
            }
        });
    }
}
