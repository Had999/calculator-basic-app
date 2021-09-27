package com.example.android.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textViewN1 , textViewN2 , textViewDisplay;
    String x , y;
    int sum , min , mul;
    double div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewN1 = findViewById(R.id.editTextNumber);
        textViewN2 = findViewById(R.id.editTextNumber2);
        textViewDisplay = findViewById(R.id.resultID);
    }


    public void bSum(View view) {
        sum = Integer.parseInt(takeX()) + Integer.parseInt(takeY());
        textViewDisplay.setText(String.valueOf(sum));
    }


    public void bMinus(View view) {
        min = Integer.parseInt(takeX()) - Integer.parseInt(takeY());
        textViewDisplay.setText(String.valueOf(min));
    }

    public void bDiv(View view) {
        div = Double.parseDouble(takeX()) / Double.parseDouble(takeY());
        textViewDisplay.setText(String.valueOf(div));
    }

    public void bMul(View view) {
        mul = Integer.parseInt(takeX()) * Integer.parseInt(takeY());
        textViewDisplay.setText(String.valueOf(mul));
    }

    public void clear(View view) {
        textViewDisplay.setText("");
    }

    public String takeX(){
        x = textViewN1.getText().toString();
        if (x.equalsIgnoreCase("")){
            x = "0";
        }
        return x;
    }
    public String takeY(){
        y = textViewN2.getText().toString();
        if (y.equalsIgnoreCase("")){
            y = "0";
        }
        return y;
    }

}