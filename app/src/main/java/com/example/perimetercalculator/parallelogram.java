package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class parallelogram extends AppCompatActivity {

    ImageButton home;
    EditText a,b;
    TextView answers;
    Button calculate;
    Boolean checked = false;

    //validate
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);

        home = findViewById(R.id.home);
        answers = findViewById(R.id.answers);
        calculate = findViewById(R.id.cal);
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