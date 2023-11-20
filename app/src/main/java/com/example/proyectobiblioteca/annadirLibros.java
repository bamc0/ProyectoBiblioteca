package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.UUID;

public class annadirLibros extends AppCompatActivity {

    private EditText inputTituloInsert;
    private EditText inputAutorInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annadir_libros);

        inputTituloInsert = (EditText) findViewById(R.id.inputTituloInsert);
        inputAutorInsert = (EditText) findViewById(R.id.inputAutorInsert);
    }

    public void terminarLibros(View c){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }

    public void ingresarLibros(View c){
        if (inputTituloInsert.getText().length()==0 || inputAutorInsert.getText().length()==0){
            Toast.makeText(annadirLibros.this, "Título y autor son campos requeridos", Toast.LENGTH_SHORT).show();
        } else {
            Libro l = new Libro();
            l.setTitulo(inputTituloInsert.getText().toString());
            l.setAutor(inputAutorInsert.getText().toString());
            l.setImagen(R.drawable.placeholderportada);
            l.setUuid(UUID.randomUUID().toString());
            Database.insertLibro(getApplicationContext(),l);
        }
    }

}