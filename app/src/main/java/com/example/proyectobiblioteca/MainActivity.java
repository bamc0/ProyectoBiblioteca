package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void cambiarAFuncionario(View v){
        Intent sig = new Intent(this, LoginAdmin.class);
        startActivity(sig);
    }

    public void IntentarEntrar(View v){
        if (true/*To do: Validación de ID y Contraseña*/){
            irAMenu();
        }else
            Toast.makeText(MainActivity.this, "ID o Contraseña inválido", Toast.LENGTH_SHORT).show();
    }

    public void irAMenu(){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

}