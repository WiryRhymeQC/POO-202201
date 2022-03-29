package com.EPS.dominio;

import java.util.List;

public class EPS {

    public byte CAPACIDAD=100;
    private String nombre;
    public List<Paciente>pacientes;
    public List<Enfermedad>enfermedades;







    public void afiliarPaciente(long cedula, String nombre){

        Paciente agregarPaciente = new Paciente( cedula, nombre);

        this.pacientes.add(agregarPaciente);







    }
    public void sacarPaciente(long cedula){

        if(pacientes != null){
            this.pacientes.remove(nombre);
            System.out.println("paciente eliminado");

        }
        else{
            System.out.println("paciente no ha sido eliminado");
        }


    }
    public void buscarPaciente(long cedula){
        Paciente Buscar = this.pacientes.stream().findFirst().get(nombre);




    }

    public void buscarPacientePorEnfermedad(String enfermedad){

        Enfermedad buscarporenfermedad = this.enfermedades.stream().filter();



    }
    public  void obtenerPacientesSinEnfermedad(){
        Enfermedad sinEnfermedad = this.enfermedades


    }
    public void ordenarPacientesPorNombre(){

        Paciente ordenar = this.pacientes.stream().sorted(nombre);
    }
}
