package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.widget.Toast;

import java.util.ArrayList;


public class SumaActivity extends AppCompatActivity {

    EditText grabar;
    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        grabar = (EditText) findViewById(R.id.editTextNumber1);
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String strSpeech2Text = speech.get(0);
                    grabar.setText(strSpeech2Text);
                }
                break;
            default:
                break;
        }
    }
    public void onClickImgBtnHablar(View v) {
        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        // Configura el Lenguaje (Español-México)
        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-MX");
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Tú dispositivo no soporta el reconocimiento por voz",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
