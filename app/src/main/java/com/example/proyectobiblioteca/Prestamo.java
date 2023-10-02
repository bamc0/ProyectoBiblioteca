package com.example.proyectobiblioteca;

public class Prestamo {
    private Libro libro;
    private Socio socio;
    private int fecha;
    private int estado; //0=Prestado 1=Devuelto 2=Perdido

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public int getFecha() {
        return fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Prestamo(Libro libro, Socio socio, int fecha, int estado) {
        this.libro = libro;
        this.socio = socio;
        this.fecha = fecha;
        this.estado = estado;
    }
}
