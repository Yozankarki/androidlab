package com.example.lab3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    EditText edit1,edit2;
    TextView view;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        edit1=findViewById(R.id.num1);
        edit2=findViewById(R.id.num2);
        view=findViewById(R.id.textView);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1= Integer.valueOf(edit1.getText().toString());
                Integer num2=Integer.valueOf(edit2.getText().toString());

                Intent i=new Intent(Result.this,Resultback.class);
                i.putExtra("num1",num1);
                i.putExtra("num2",num2);
                startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==1){

                int result=data.getIntExtra("add",0);
                view.setText("Result="+result);

        }
    }
}