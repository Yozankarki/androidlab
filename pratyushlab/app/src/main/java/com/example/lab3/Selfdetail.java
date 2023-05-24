package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Selfdetail extends AppCompatActivity {
    EditText edit1,edit2,edit3,edit4,edit5;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selfdetail);
        edit1=findViewById(R.id.name);
        edit2=findViewById(R.id.address);
        edit3=findViewById(R.id.Gender);
        edit4=findViewById(R.id.hobbies);
        edit5=findViewById(R.id.program);
        btn=findViewById(R.id.display);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edit1.getText().toString();
                String address=edit2.getText().toString();
                String gender=edit3.getText().toString();
                String hobbies=edit4.getText().toString();
                String program=edit5.getText().toString();

                Intent i=new Intent(Selfdetail.this,Selfdetailoutput.class);
                i.putExtra("n", name);
                i.putExtra("a",address);
                i.putExtra("g",gender);
                i.putExtra("h",hobbies);
                i.putExtra("p",program);
                startActivity(i);
            }
        });
    }
}