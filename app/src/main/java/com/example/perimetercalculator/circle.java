package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class circle extends AppCompatActivity {

    ImageButton home;
    TextView ans;
    EditText rad;
    Button sub;

    Boolean check = false;


    //Validate Inputs
    private Boolean validate(){

        if(rad.length()==0){
            rad.setError("Field is empty");
            return false;

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        ans = findViewById(R.id.answer);
        rad = findViewById(R.id.radius);
        home = findViewById(R.id.home);
        sub = findViewById(R.id.cal);

        //navigate to homepage
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });




        //calculate values
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                check = validate();
                if(check){
                    float r = Float.valueOf(rad.getText().toString());


                    if(r>0 ){
                        float a = (2*r*22)/7;

                        ans.setText("Answer is "+a);
                    }
                    else{
                        ans.setText("Enter valid inputs");
                    }

                }


            }
        });






    }
}