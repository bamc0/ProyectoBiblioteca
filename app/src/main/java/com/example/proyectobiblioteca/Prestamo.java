package com.example.proyectobiblioteca;

public class Prestamo {
    private Libro libro;
    private Socio socio;
    private String fecha;

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public String getFecha() {
        return fecha;
    }

    public Prestamo(Libro libro, Socio socio, String fecha) {
        this.libro = libro;
        this.socio = socio;
        this.fecha = fecha;
    }
}
