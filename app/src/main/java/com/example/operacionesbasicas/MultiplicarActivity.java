package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar2);
    }
    public void RegreasarMenu(View view) {
        this.finish();

    }

    public void multiplicar(View view) {
        EditText numero1 = (EditText) findViewById(R.id.editMultNumber1);
        EditText numero2 = (EditText) findViewById(R.id.editMultNumber2);
        TextView total = findViewById(R.id.txtEResultado3);


        double resultado = Double.parseDouble(numero1.getText().toString()) * Double.parseDouble(numero2.getText().toString());
        total.setText(resultado + "");

    }
}