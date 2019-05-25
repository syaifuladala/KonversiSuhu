package com.example.toshiba.konversi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText tfcel, tfre, tffar, tfkel;
    Button masukkan, reset, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tfcel = (EditText) findViewById(R.id.tfcel);
        tfre = (EditText) findViewById(R.id.tfre);
        tffar = (EditText) findViewById(R.id.tffar);
        tfkel = (EditText) findViewById(R.id.tfkel);
        masukkan = (Button) findViewById(R.id.masukkan);
        reset = (Button) findViewById(R.id.reset);
        keluar = (Button) findViewById(R.id.keluar);
    }

    public void konversicelcius(View view){
        int celcius = Integer.parseInt(tfcel.getText().toString());
         double kelvin = celcius+273;
         double farenheit = (celcius*9/5)+32;
         double reamur = celcius*4/5;
         tfkel.setText(String.valueOf(kelvin));
         tffar.setText(String.valueOf(farenheit));
         tfre.setText(String.valueOf(reamur));
    }

    public void konversireamur(View view){
        int reamur = Integer.parseInt(tfre.getText().toString());
        double kelvin = (reamur*5/4)+273;
        double farenheit = (reamur*9/4)+32;
        double celcius = reamur*5/4;
        tfkel.setText(String.valueOf(kelvin));
        tffar.setText(String.valueOf(farenheit));
        tfre.setText(String.valueOf(reamur));
    }

    public void konversifarenheit(View view){
        int farenheit = Integer.parseInt(tffar.getText().toString());
        double kelvin = ((farenheit-32)*5/9)+273;
        double celcius = (farenheit-32)*5/9;
        double reamur = (farenheit-32)*4/9;
        tfkel.setText(String.valueOf(kelvin));
        tfcel.setText(String.valueOf(celcius));
        tfre.setText(String.valueOf(reamur));
    }

    public void konversikelvin(View view){
        int kelvin = Integer.parseInt(tfkel.getText().toString());
        double celcius = kelvin-273;
        double farenheit = (kelvin-273)*9/5+32;
        double reamur = (kelvin-273)*4/5;
        tfkel.setText(String.valueOf(kelvin));
        tffar.setText(String.valueOf(farenheit));
        tfre.setText(String.valueOf(reamur));
    }

    public void reset(View view){
        tfkel.setText(String.valueOf(null));
        tffar.setText(String.valueOf(null));
        tfre.setText(String.valueOf(null));

    }

    public void keluar(View view){
        finish();
    }

}
