package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteActionProvider;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "AAAAAAAAAAAAAAAA");
        Log.d(TAG, "ASDASDASDASDSDDD");
        Log.i(TAG, "ASDASDASDASDSDSD");
        Log.w(TAG, "ASDASDSDSDSDSDSD");
        Log.e(TAG, "HSDUHSDUHSDUHUHUH");

        Button button =         (Button) findViewById(R.id.buttonMain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "This button is clicked");
            }
        });

        //02/18/23
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button is Clicked: ");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
