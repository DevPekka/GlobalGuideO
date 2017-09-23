package com.devpekka.globalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView) findViewById(R.id.creator);
        initData();
        listView.setAdapter(listAdapter);

        configureMapBtn();
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Creator");

        List<String> aztecCreator = new ArrayList<>();
        aztecCreator.add("Chris Auty");
        aztecCreator.add("Valve Corporation");
        aztecCreator.add("Hidden Path Entertainment");

        listHash.put(listDataHeader.get(0), aztecCreator);

    }

    public void configureMapBtn(){
        Button btnGun = (Button) findViewById(R.id.button1);
        btnGun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Maps.class));
            }
        });
        Button mapBtn = (Button) findViewById(R.id.button2);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Guns.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
