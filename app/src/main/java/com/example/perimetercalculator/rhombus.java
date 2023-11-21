package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class rhombus extends AppCompatActivity {

    ImageButton home;

    TextView ans;
    EditText a;

    Button sub;

    Boolean checked=false;

    private boolean validate(){

        if(a.length()==0){
            a.setError("Field is empty");
            return false;
        }

        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        home = findViewById(R.id.home);
        sub = findViewById(R.id.cal);
        ans = findViewById(R.id.answer);
        a = findViewById(R.id.a);


        //Navigate to home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        //calculate
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checked = validate();
                if(checked){

                    float an = Float.valueOf(a.getText().toString());
                    if(an>0){

                        an = 4*an;

                        ans.setText("Answer is "+an);


                    }
                    else{

                        ans.setText("Enter valid inputs");
                    }
                }



            }
        });
    }
}