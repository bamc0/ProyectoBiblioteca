package com.example.proyectobiblioteca;

import androidx.annotation.NonNull;
import androidx.room.Entity;

public class Libro {
    private int imagen;
    private String titulo;
    private String autor;

    public int getImagen() {
        return imagen;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Libro(int imagen, String titulo, String autor){
        this.imagen = imagen;
        this.titulo=titulo;
        this.autor = autor;
    }
}
