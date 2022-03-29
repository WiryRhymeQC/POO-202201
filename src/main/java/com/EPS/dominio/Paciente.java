package com.EPS.dominio;

public class Paciente {
    private long cedula;
    private String nombre;


    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
    //Contructores

    public Paciente(long cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;

    }
}
