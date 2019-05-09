package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mybutton;
    Button myexitbutton;
    TextView mytext;
    RadioButton malecheck;
    RadioButton femalecheck;
    EditText nametext;
    EditText emailtext;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext = findViewById(R.id.nametext);
        emailtext = findViewById(R.id.emailtext);
        mytext = findViewById(R.id.mytext);
        malecheck = findViewById(R.id.malecheck);
        malecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(malecheck.isChecked()){
                    gender = "Male";
                }
            }
        });
        femalecheck = findViewById(R.id.femalecheck);
        femalecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(femalecheck.isChecked()){
                    gender = "Female";
                }
            }
        });
        mybutton = findViewById(R.id.mybutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                mytext.setText("Name:" + nametext.getText().toString() + "\n" + "Email:" + emailtext.getText().toString() + "\n" + gender);
            }
        });
        myexitbutton = findViewById(R.id.myexitbutton);
        myexitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
