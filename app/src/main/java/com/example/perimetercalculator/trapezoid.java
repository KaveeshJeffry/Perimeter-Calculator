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

public class trapezoid extends AppCompatActivity {

    ImageButton home;

    TextView ans;
    EditText a,b,c,d;

    Button sub;

    Boolean checked = false;

    //Validate fields
    private boolean validate(){

        if(a.length()==0){
            a.setError("Field is empty");
            return false;
        }
        if(b.length()==0){
            b.setError("Field is empty");
            return false;
        }
        if(c.length()==0){
            c.setError("Field is empty");
            return false;
        }
        if(d.length()==0){
            d.setError("Field is empty");
            return false;
        }


        return true;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        home = findViewById(R.id.home);
        sub = findViewById(R.id.cal);
        ans = findViewById(R.id.answer);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);



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
                    float bn = Float.valueOf(b.getText().toString());
                    float cn = Float.valueOf(c.getText().toString());
                    float dn = Float.valueOf(d.getText().toString());

                    if(an>0 && bn>0 && cn>0 && dn>0){

                        float en = an+bn+cn+dn;
                        ans.setText("Answer is "+en);

                    }
                    else{

                        ans.setText("Enter valid inputs");
                    }

                }





            }
        });
    }
}