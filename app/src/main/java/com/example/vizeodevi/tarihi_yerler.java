package com.example.vizeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.app.Activity;

public class tarihi_yerler extends AppCompatActivity {

    public String[] bbg_tarihiyerlerlist = {"Altın Köşk","Anıtkabir","Ankara kalesi","Cumhuriyet Müzesi","Etnografya Müzesi","Hacı Bayram Veli Cami","Kocatepe Cami","Resim ve Heykel Müzesi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);

        ListView bbg_tarihilist = (ListView)findViewById(R.id.tarihiyerlerlistid);

        ArrayAdapter<String> bbg_adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1,bbg_tarihiyerlerlist);

        bbg_tarihilist.setAdapter(bbg_adapter);

        bbg_tarihilist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //altin kosk
                    startActivity(new Intent(tarihi_yerler.this,altin_kosk.class));
                } else if (position==1) {
                    //anitkabir
                    startActivity(new Intent(tarihi_yerler.this,anitkabir.class));
                }
                else if (position==2) {
                    //ankara kalesi
                    startActivity(new Intent(tarihi_yerler.this,ankara_kalesi.class));
                }
                else if (position==3) {
                    //cumhuriyet muzesi
                    startActivity(new Intent(tarihi_yerler.this,cumhuriyet_muzesi.class));
                }
                else if (position==4) {
                    //etnografya muzesi
                    startActivity(new Intent(tarihi_yerler.this,etnografya_muzesi.class));
                }
                else if (position==5) {
                    //haci bayram veli cami
                    startActivity(new Intent(tarihi_yerler.this,haci_bayram_muzesi.class));
                }
                else if (position==6) {
                    //kocatepe cami
                    startActivity(new Intent(tarihi_yerler.this,koca_tepe_cami.class));
                }
                else if (position==7) {
                    //resim ve heykel muzesi
                    startActivity(new Intent(tarihi_yerler.this,resim_ve_heykel_muzesi.class));
                }

            }
        });






    }
}