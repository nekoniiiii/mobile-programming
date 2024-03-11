package com.example.calculatearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btnCalculate, btnExit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        btnCalculate = findViewById(R.id.btnCalculate);
        btnExit = findViewById(R.id.btnExit);

        result = findViewById(R.id.result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 * num2;
                result.setText("Result: " + res);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                //finishAndRemoveTask();
            }
        });

    }
}