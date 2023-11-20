package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputIdC;
    private EditText inputPassC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPassC = (EditText) findViewById(R.id.inputPassC);
        inputIdC = (EditText) findViewById(R.id.inputIdC);
    }


    public void cambiarAFuncionario(View v){
        Intent sig = new Intent(this, LoginAdmin.class);
        startActivity(sig);
    }



    public void IntentarEntrar(View v){
        //Mejorar Chequeo de contraseña
        if (inputPassC.getText().toString().equals("a")){
            irAMenu();
        }else
            Toast.makeText(MainActivity.this, "ID o Contraseña inválido", Toast.LENGTH_SHORT).show();
    }

    public void irAMenu(){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }


}