package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultback extends AppCompatActivity {
    TextView view1;
    Button btn;
   int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultback);
        view1=findViewById(R.id.textView2);
        btn=findViewById(R.id.button);

        Intent i=getIntent();
        num1=i.getIntExtra("num1",0);
        num2=i.getIntExtra("num2",0);

        view1.setText("Numbers"+"\n"+num1+"\n"+num2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int add=num1+num2;

                Intent intent=new Intent(Resultback.this,Result.class);
                intent.putExtra("add",add);
                setResult(1,intent);
                finish();
            }
        });
    }
}