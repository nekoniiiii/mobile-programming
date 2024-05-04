package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1, number2;
    // Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        result = (TextView)findViewById(R.id.result);
    }

    public void operasi (View v){
        float num1, num2, res = 0;
        //Button bt;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        if(v.getId() == R.id.btnAdd){
            res = num1 + num2;
        }
        else if (v.getId() == R.id.btnSubtract){
            res = num1 - num2;
        }
        else if (v.getId() == R.id.btnMultiply){
            res = num1 * num2;
        }
        else if (v.getId() == R.id.btnDivide){
            res = num1 / num2;
        }
        //bt = (Button) findViewById(v.getId());
        result.setText("Result: " + res);
        //result.setText(num1 + " " + bt.getText() + " " + num2 + " = " + res);

    }
}