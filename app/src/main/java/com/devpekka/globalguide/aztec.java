package com.devpekka.globalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class aztec extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aztec);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Aztec");
        getSupportActionBar().setIcon(R.mipmap.t_launcher);

        //Creator ListView
        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        //Costum ListView
        listView = (ExpandableListView)findViewById(R.id.costum);
        initData2();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        configureCall();

    }

    private void initData2() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Costum");

        List<String> creator = new ArrayList<>();
        creator.add("CT : Seal Team 6");
        creator.add("T  : Phoenix Connection");

        listHash.put(listDataHeader.get(0), creator);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Creator");

        List<String> creator = new ArrayList<>();
        creator.add("Chris Auty");
        creator.add("Valve Corporation");
        creator.add("Hidden Path Entertainment");

        listHash.put(listDataHeader.get(0), creator);
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
