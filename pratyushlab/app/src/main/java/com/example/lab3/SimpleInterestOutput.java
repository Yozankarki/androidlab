package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SimpleInterestOutput extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleinterestoutput);
        result=findViewById(R.id.textView);
        Intent i =getIntent();
        double p=i.getDoubleExtra("p",0.0);
        double R=i.getDoubleExtra("R",0.0);
        double T=i.getDoubleExtra("T",0.0);

        double si=(p*T*R)/100;
        double ci=p*(Math.pow((1+R/100),T)-1);

        result.setText(" Simple interest= "+ si + "\n" + " Compound interest= " + ci);


    }
}