package com.example.proyectobiblioteca;

public class Socio {

    private String uuid;
    private String rut;
    private String nombre;
    private String password;

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Socio(String rut, String nombre, String password) {
        this.rut = rut;
        this.nombre = nombre;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public Socio() {
    }
}

