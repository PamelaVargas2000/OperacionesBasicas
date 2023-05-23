package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

    public void RegreasarMenu(View view) {
        this.finish();

    }

    public void sumar(View view) {
        EditText numero1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText numero2 = (EditText) findViewById(R.id.editTextNumber2);
        TextView total = findViewById(R.id.txtEResultado);


        double resultado = Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero2.getText().toString());
        total.setText(resultado + "");

    }
}