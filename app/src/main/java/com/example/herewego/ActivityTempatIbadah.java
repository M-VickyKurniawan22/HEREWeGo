package com.example.herewego;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityTempatIbadah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_ibadah4);
    }
    public static Intent getActIntent(Activity act3) {
        return new Intent(act3, ActivityHotel.class);
    }
}