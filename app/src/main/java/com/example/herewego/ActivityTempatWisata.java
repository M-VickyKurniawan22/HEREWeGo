package com.example.herewego;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityTempatWisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_wisata2);
    }
    public static Intent getActIntent(Activity act2) {
        return new Intent(act2, ActivityHotel.class);
    }
}