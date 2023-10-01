/*package com.example.proyectobiblioteca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class ClientePrestamos extends AppCompatActivity {

    private RecyclerView librosPrestados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_prestamos);

        librosPrestados = (RecyclerView) findViewById(R.id.librosPrestados);
        itemAdapter = new ItemAdapter(this);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter.setData(getData());
        librosPrestados.setAdapter(itemAdapter);
        librosPrestados.setLayoutManager(linearLayoutManager);
    }

    public void salirClientePrestamos(View v){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

    private List<Prestamo> getData(){

    }

}*/