package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleInterest extends AppCompatActivity {

    EditText edit1,edit2,edit3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleinterest);
        edit1=findViewById(R.id.editTextTextPersonName);
        edit2=findViewById(R.id.editTextTextPersonName2);
        edit3=findViewById(R.id.editTextTextPersonName3);
        btn=findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double principle= Double.parseDouble(edit1.getText().toString());
                Double rate=Double.parseDouble(edit2.getText().toString());
                Double time=Double.parseDouble(edit3.getText().toString());

                Intent i=new Intent(SimpleInterest.this,SimpleInterestOutput.class);
                i.putExtra("p",principle);
                i.putExtra("R",rate);
                i.putExtra("T",time);
                startActivity(i);
            }
        });
    }
}