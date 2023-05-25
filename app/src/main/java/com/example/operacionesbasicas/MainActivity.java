package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  irSuma(View view){
        Intent intent=new Intent(this,SumaActivity.class);
        view.getContext().startActivity(intent);
    }










    public void  irResta(View view){
        Intent intent=new Intent(this,RestaActivity.class);
        view.getContext().startActivity(intent);
    }
    public void  irMultiplicar(View view){
        Intent intent=new Intent(this,MultiplicarActivity.class);
        view.getContext().startActivity(intent);
    }
    public void  irDividir(View view){
        Intent intent=new Intent(this,DividirActivity.class);
        view.getContext().startActivity(intent);
    }
}