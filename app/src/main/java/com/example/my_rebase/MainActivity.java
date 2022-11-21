package com.example.my_rebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("feature2");
        System.out.println("feature3");

        System.out.println("Εδώ είναι οι νέες αλλαγές");
    }
}