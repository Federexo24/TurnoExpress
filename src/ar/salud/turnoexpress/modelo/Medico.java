package ar.salud.turnoexpress.modelo;

import ar.salud.turnoexpress.enums.Especialidad;

public class Medico {

    private String nombre;
    private Especialidad especialidad;

    public Medico(String nombre, Especialidad especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}