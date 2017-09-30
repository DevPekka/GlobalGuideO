package com.devpekka.globalguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Austria extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_austria);

        listView = (ExpandableListView)findViewById(R.id.creator);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        //Costum ListView
        listView = (ExpandableListView)findViewById(R.id.costum2);
        initData2();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        getSupportActionBar().setTitle("Austria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initData2() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Costum");

        List<String> creator = new ArrayList<>();
        creator.add("CT : GSG-9");
        creator.add("T   : Phoenix Connection");

        listHash.put(listDataHeader.get(0), creator);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Creator");

        List<String> creator = new ArrayList<>();
        creator.add("Radix");

        listHash.put(listDataHeader.get(0), creator);
    }
}
