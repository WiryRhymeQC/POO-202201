package com.EPS.dominio;

public class Enfermedad {
    private String nombre;
    private int gravedad;

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    //Contructores

    public Enfermedad(String nombre){
        this.nombre=nombre;

    }
    public Enfermedad(int gravedad){
        this.gravedad=gravedad;

    }
}
