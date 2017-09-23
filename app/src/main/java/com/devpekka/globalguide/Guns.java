package com.devpekka.globalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Guns extends AppCompatActivity {
    String items[] = new String[] {"Pistol", "Heavy", "SMG", "RIFLES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guns);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Gun's");
        getSupportActionBar().setSubtitle("Pick the Gun's");

        ListView listView = (ListView) findViewById(R.id.gunsList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intenpolar = new Intent(Guns.this, Pistol.class);
                    startActivity(intenpolar);
                }
                if(position==1){
                    Toast.makeText(Guns.this, "Wow, you Click Heavy!", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(Guns.this, "Wow, you Click SMG!", Toast.LENGTH_SHORT).show();
                }
                if (position==3){
                    Toast.makeText(Guns.this, "Wow, you Click Rifles!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
