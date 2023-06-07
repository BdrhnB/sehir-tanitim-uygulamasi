package com.example.vizeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ankara_yoresel_yemekleri extends AppCompatActivity {


    public String[] bbg_yemeklermenu = {"Ankara Tava","Beypazarı Güveci","Uruş Kapama","Öllüğün Körü"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankara_yoresel_yemekleri);

        ListView bbg_yemeklerlist = (ListView)findViewById(R.id.yemeklerlistid);

        ArrayAdapter<String> bbg_yemekleradapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1, bbg_yemeklermenu);

        bbg_yemeklerlist.setAdapter(bbg_yemekleradapter);

        bbg_yemeklerlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //ankara tava
                    startActivity(new Intent(ankara_yoresel_yemekleri.this,ankara_tava.class));
                } else if (position==1) {
                    //Beypazari guveci
                    startActivity(new Intent(ankara_yoresel_yemekleri.this,beypazari_guveci.class));
                }
                else if (position==2) {
                    //urus kapama
                    startActivity(new Intent(ankara_yoresel_yemekleri.this,urus_kapama.class));
                }
                else if (position==3) {
                    //ollugun koru
                    startActivity(new Intent(ankara_yoresel_yemekleri.this,ollugun_koru.class));
                }
            }
        });


    }
}