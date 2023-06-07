package com.example.vizeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {


    public String[] bbg_menu = {"Ankara'nın Tarihçesi","Ankara'da Bulunan Tarihi Yerler","Ankara Yöresel Yemekleri","Ankara Tatlıları"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView bbg_list = (ListView)findViewById(R.id.menulistid);

        ArrayAdapter<String> bbg_adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1,bbg_menu);

        bbg_list.setAdapter(bbg_adapter);

        bbg_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //ankara tarihcesi
                    startActivity(new Intent(MainActivity.this,tarihce.class));
                } else if (position==1) {
                    //ankara'da bulunan tarihi yerler
                    startActivity(new Intent(MainActivity.this,tarihi_yerler.class));
                }
                else if (position==2) {
                    //ankara yoresel yemekleri
                    startActivity(new Intent(MainActivity.this,ankara_yoresel_yemekleri.class));
                }
                else if (position==3) {
                    //ankara yoresel tatlilari
                    startActivity(new Intent(MainActivity.this,ankara_yoresel_tatlilari.class));
                }
            }
        });
            
        }




}