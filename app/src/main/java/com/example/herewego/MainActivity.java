package com.example.herewego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Deklarasi
    ImageView btnHotel,btnKuliner,btnTempatWisata,btnTempatIbadah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHotel = (ImageView)findViewById(R.id.imageHotel);
        btnKuliner = (ImageView)findViewById(R.id.imageKuliner);
        btnTempatWisata = (ImageView)findViewById(R.id.imageTempatWisata);
        btnTempatIbadah = (ImageView)findViewById(R.id.imageTempatIbadah);

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ActivityHotel.getActIntent(MainActivity.this));
            }
        });

        btnKuliner.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(ActivityKuliner.getActIntent(MainActivity.this));
            }
        });

        btnTempatWisata.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(ActivityTempatWisata.getActIntent(MainActivity.this));
            }
        });

        btnTempatIbadah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(ActivityTempatIbadah.getActIntent(MainActivity.this));
            }
        });

    }
}