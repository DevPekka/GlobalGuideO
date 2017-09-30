package com.devpekka.globalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Maps extends AppCompatActivity {
    String items[] = new String[] {"Austria", "Aztec", "Agency", "Shipped"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Maps");
        getSupportActionBar().setSubtitle("Choose a Maps you want");

        ListView listView = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent austria = new Intent(Maps.this, Austria.class);
                    startActivity(austria);
                }
                if(position==1){
                    Intent aztec = new Intent(Maps.this,aztec.class);
                    startActivity(aztec);
                }
                if(position==2){
                    Intent agency = new Intent(Maps.this,Agency.class);
                    startActivity(agency);
                }
                if(position==3){
                    Intent shipped = new Intent(Maps.this,Shipped.class);
                    startActivity(shipped);
                }
            }
        });
    }
}
