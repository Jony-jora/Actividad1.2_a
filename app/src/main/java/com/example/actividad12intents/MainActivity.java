package com.example.actividad12intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre, editTextContraseña;
    Button btnEnviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextContraseña = findViewById(R.id.editTextContraseña);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                String contraseña = editTextContraseña.getText().toString();

                if ("Jony".equals(nombre) && "abc".equals(contraseña)) {
                    enviarDatos(nombre, contraseña);
                } else {
                    Toast.makeText(MainActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void enviarDatos(String nombre, String contraseña) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("contraseña", contraseña);
        startActivity(intent);
    }




}