package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_client);
    }

    public void salirCliente(View v){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }

    public void verPrestamos(View v){
        Intent sig = new Intent(this, ClientePrestamos.class);
        startActivity(sig);
    }

    public void verDatos(View v){
        Intent sig = new Intent(this, verDatos.class);
        startActivity(sig);
    }
    public void verAjustes(View v){
        Intent sig = new Intent(this, ClienteAjustes.class);
        startActivity(sig);
    }
    public void verContacto(View v){
        Intent sig = new Intent(this, ContactoConFuncionario.class);
        startActivity(sig);
    }

}