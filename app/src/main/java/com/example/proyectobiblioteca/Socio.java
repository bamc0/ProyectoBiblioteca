package com.example.proyectobiblioteca;

public class Socio {
    private String rut;
    private String nombre;

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Socio(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }
}
