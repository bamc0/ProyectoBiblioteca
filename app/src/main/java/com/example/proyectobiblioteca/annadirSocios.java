package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class annadirSocios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annadir_socios);
    }

    public void terminarSocios(View c){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }
}