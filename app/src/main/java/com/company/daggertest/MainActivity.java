package com.company.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.piri_annotation.NewIntent;

@NewIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}