package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class rectangle extends AppCompatActivity {


    ImageButton home;

    EditText a,b;
    TextView answers;
    Button calculate;

    Boolean checked = false;

    //Validate
    private boolean validate(){

        if(a.length()==0){
            a.setError("Field is empty");
            return false;
        }
        if(b.length()==0){
            b.setError("Field is empty");
            return false;
        }

        return true;
    }



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        home = findViewById(R.id.home);
        calculate = findViewById(R.id.cal);
        answers = findViewById(R.id.ans1);
        a= findViewById(R.id.para1);
        b= findViewById(R.id.para2);





        //Navigate to home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Calculate
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checked = validate();
                if(checked){

                    float an = Float.valueOf(a.getText().toString());
                    float bn = Float.valueOf(b.getText().toString());

                    if(an>0 && bn>0){

                        Float a = 2*(an+bn);

                        answers.setText("Answer is "+a);
                    }
                    else{

                        answers.setText("Enter valid inputs");
                    }
                }


            }
        });
    }


}