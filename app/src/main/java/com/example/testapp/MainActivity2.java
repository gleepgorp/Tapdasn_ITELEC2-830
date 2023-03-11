package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button FragmentA, FragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //get button reference
        FragmentA = (Button) findViewById(R.id.FragmentA);
        FragmentB = (Button) findViewById(R.id.FragmentB);

        FragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentA());
            }
        });

        FragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentB());
            }
        });
    }

    public void loadFragment(Fragment fragment){
        //create FragmentManager
        FragmentManager fm = getFragmentManager();

        //create fragmentTransaction to begin the transaction and replace fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        //replace the frameLayout with new Fragment
        fragmentTransaction.replace(R.id.constraintLayout, fragment);
        fragmentTransaction.commit();

    }
}