package com.devpekka.globalguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Pistol extends AppCompatActivity {
    String items[] = new String[] {"P2000", "USP-S", "DUAL BERRETAS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistol);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Pistol's");
        getSupportActionBar().setSubtitle("Pick the Pistol's");

        ListView listView = (ListView) findViewById(R.id.pistolView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Toast.makeText(Pistol.this, "Wow, you Click P2000!", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(Pistol.this, "Wow, you Click USP-S!", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(Pistol.this, "Wow, you Click DUAL BERRETAS!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
