package com.example.wirdakurnia.jobsheet3recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataSet);
        rvView.setAdapter(adapter);

    }

    private void initDataset(){

        dataSet.add("EXO - Tempo");
        dataSet.add("Chanyeol - Stay With Me");
        dataSet.add("Jazz - Teman Bahagia");
        dataSet.add("Haddad Alwi - Ibu");
        dataSet.add("ADA Band - Ayah");
        dataSet.add("Arbani - Be My Love");
        dataSet.add("NCT 127 - Regular");
        dataSet.add("IKON - I'm Ok");
        dataSet.add("Twice - Yes Or Yes");
        dataSet.add("Taeyeon - Fine");

    }
}
