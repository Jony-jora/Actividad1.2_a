package com.example.actividad12intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewDatos;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewDatos = findViewById(R.id.textViewDatos);

        Intent intent = getIntent();
        if (intent != null) {
            String nombre = intent.getStringExtra("nombre");
            String contraseña = intent.getStringExtra("contraseña");

            if ("Jony".equals(nombre) && "abc".equals(contraseña)) {
                String mensaje = "Bienvenido/a " + nombre;
                textViewDatos.setText(mensaje);
            }else{
                textViewDatos.setText("Nombre o contraseña incorrectos");
            }
        }
    }
}