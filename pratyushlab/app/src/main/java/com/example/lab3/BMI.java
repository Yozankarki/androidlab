package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    EditText edit1,edit2;
    TextView View;
    Button btn;
    String result,calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmicalculator);
        edit1=findViewById(R.id.weight);
        edit2=findViewById(R.id.height);
        View=findViewById(R.id.text);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String weight=edit1.getText().toString();
                String height=edit2.getText().toString();

                Float Weightvalue=Float.parseFloat(weight);
                Float Heightvalue=Float.parseFloat(height);

                Float bmi= Weightvalue/ (Heightvalue*Heightvalue);

                if (bmi<18.5){
                    result="under weight";
                } else if (bmi>18.5 && bmi<24.9) {
                    result="Healthy";
                } else if (bmi>25.0 && bmi<29.9) {
                    result="Overweight";
                } else if (bmi>30.0) {
                    result="obese";
                }
                calculation=bmi+"  :  "+result;
                View.setText(calculation);


            }
        });


    }
}