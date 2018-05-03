package com.talaat_nwegaa.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        ImageView egypt = (ImageView) findViewById(R.id.egypt);

        // Set a click listener on that View
        egypt.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
              Intent intent=new Intent(Intent.ACTION_VIEW);
              intent.setData(Uri.parse("https://wikitravel.org/en/Egypt"));
              if(intent.resolveActivity(getPackageManager())!=null){
                  startActivity(intent);
              }
            }
        });

        // Find the View that shows the numbers category
        ImageView ancient = (ImageView) findViewById(R.id.ancient_Egypt);

        // Set a click listener on that View
        ancient.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ancientIntent = new Intent(MainActivity.this, AncientTourism.class);

                // Start the new activity
                startActivity(ancientIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView islamic = (ImageView) findViewById(R.id.islamic_egypt);

        // Set a click listener on that View
        islamic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent islamicIntent = new Intent(MainActivity.this, IslamicTourism.class);

                // Start the new activity
                startActivity(islamicIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView modern = (ImageView) findViewById(R.id.modern_egypt);

        // Set a click listener on that View
        modern.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent modernIntent = new Intent(MainActivity.this, ModernTourism.class);

                // Start the new activity
                startActivity(modernIntent);
            }
        });


    }
}
