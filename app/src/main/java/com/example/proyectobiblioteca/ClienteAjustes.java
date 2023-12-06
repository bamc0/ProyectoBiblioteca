package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ClienteAjustes extends AppCompatActivity {

    private CheckBox cb1dias;
    private CheckBox cb3dias;
    private CheckBox cb7dias;
    private EditText nuevaContrasenna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_ajustes);

        cb1dias = (CheckBox) findViewById(R.id.cb1dias);
        cb3dias = (CheckBox) findViewById(R.id.cb3dias);
        cb7dias = (CheckBox) findViewById(R.id.cb7dias);
        nuevaContrasenna = (EditText) findViewById(R.id.nuevaContrasenna);
    }

    public void salirClienteAjustes(View v){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

    public void cambiarNotifs(View v){
        //Cambiar próximamente para que funcione con las notificaciones

            String texto = "Se enviarán notificaciones: ";
            if (cb1dias.isChecked())
                texto += "1 dia antes, ";
            if (cb3dias.isChecked())
                texto += "3 días antes, ";
            if (cb7dias.isChecked())
                texto += "7 días antes, ";
            texto += "y todos los días después de la fecha límite";
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();

    }

    public void cambiarContrasenna(View v){
        if (nuevaContrasenna.getText().length() > 0)
        Toast.makeText(this, "La contraseña se cambiará a " + nuevaContrasenna.getText().toString() , Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "La contraseña no puede estar vacía", Toast.LENGTH_SHORT).show();
    }

}