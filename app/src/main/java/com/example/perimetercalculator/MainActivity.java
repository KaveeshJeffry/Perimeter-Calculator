package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton square,parallelogram,rectangle,rhombus,trapezoid,triangle,circle,seti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //square page
        square = findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.square.class );

                startActivity(intent);
            }
        });

        seti = findViewById(R.id.about);
        seti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), settings.class);

                startActivity(intent);
            }
        });


        //parallelogram page
        parallelogram = findViewById(R.id.parallelogram);
        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.parallelogram.class );

                startActivity(intent);
            }
        });

        //rectangle page
        rectangle = findViewById(R.id.rectangle);
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.rectangle.class );

                startActivity(intent);
            }
        });

        //rhombus page
        rhombus = findViewById(R.id.rhombus);
        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.rhombus.class );

                startActivity(intent);
            }
        });

        //trapezoid page
        trapezoid = findViewById(R.id.trapezoid);
        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.trapezoid.class );

                startActivity(intent);
            }
        });

        //triangle page
        triangle = findViewById(R.id.triangle);
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.triangle.class );

                startActivity(intent);
            }
        });

        //circle page
        circle = findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getApplicationContext(), com.example.perimetercalculator.circle.class );

                startActivity(intent);
            }
        });
    }
}