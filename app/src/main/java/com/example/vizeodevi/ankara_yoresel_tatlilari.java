package com.example.vizeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ankara_yoresel_tatlilari extends AppCompatActivity {


    public String[] bbg_tatlimenu = {"Ankara Sarması"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankara_yoresel_tatlilari);

        ListView bbg_tatlilist = (ListView)findViewById(R.id.tatlilarlistid);

        ArrayAdapter<String> bbg_tatliadapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1,bbg_tatlimenu);

        bbg_tatlilist.setAdapter(bbg_tatliadapter);

        bbg_tatlilist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //ankara sarmasi
                    startActivity(new Intent(ankara_yoresel_tatlilari.this,ankara_sarmasi.class));
                }
            }
        });


    }
}