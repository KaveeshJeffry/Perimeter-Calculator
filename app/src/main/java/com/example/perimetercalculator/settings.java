package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class settings extends AppCompatActivity {

    Button swit;

    ImageButton home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });



        swit = findViewById(R.id.swit);
        swit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mode = getTheme().getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
                if (Configuration.UI_MODE_NIGHT_YES == mode) {
                    AppCompatDelegate
                            .setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                } else {
                    AppCompatDelegate
                            .setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);


                }
            }


        });
    }
}




