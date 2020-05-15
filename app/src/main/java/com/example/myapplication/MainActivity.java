package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView fgo1;
    private TextView respuesta;

    private String [] respuestaArray ={"Arturia Pendragon", "Jeanne D. Arc Alter", "Cuhulain", "Iskandar", "Gilgamesh", "Miyamoto Musashi",
            "Jeanne D. Arc", "Angra Manju", "Skadi", "Amakusa Shirou", "Semiramis", "Jack El Destripador",
            "Arturia Alter", "NO ERES APTO", "Nikola Tesla", "Okita Souji Alter",
            "Hassan Sabbah", "Kama", "Gudako", "Emiya"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fgo1= findViewById(R.id.bottom);
        respuesta = findViewById(R.id.respuesta);
        fgo1.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Analizando tu Mana", Toast.LENGTH_SHORT).show();
    }
        @Override
    public void onClick(View v){
        // creacion de metodo de respuesta aleatorio
        switch (v.getId()) {
            case R.id.bottom:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);
                break;
        }
    }
}
