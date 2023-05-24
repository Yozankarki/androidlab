package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Selfdetailoutput extends AppCompatActivity {
    TextView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selfdetailoutput);
        view=findViewById(R.id.view);

        Intent i=getIntent();
        String name=i.getStringExtra("n");
        String address=i.getStringExtra("a");
        String gender=i.getStringExtra("g");
        String h=i.getStringExtra("h");
        String program=i.getStringExtra("p");

        view.setText("Name="+name+"\n"+"Address="+address+"\n"+"Gender="+gender+"\n"+"Hobbies="+h+"\n"+"Program="+program);

    }
}