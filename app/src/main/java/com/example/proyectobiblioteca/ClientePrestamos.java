package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClientePrestamos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_prestamos);
    }

    public void salirClientePrestamos(View v){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

}