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

}