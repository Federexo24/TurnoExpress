package ar.salud.turnoexpress.principal;

import java.util.Scanner;
import ar.salud.turnoexpress.modelo.Paciente;
import ar.salud.turnoexpress.modelo.Medico;
import ar.salud.turnoexpress.modelo.Turno;
import ar.salud.turnoexpress.modelo.Especialidad;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----BIENVENIDO/A A TurnoExpress---");

        System.out.println("Por favor, ingrese su nombre y apellido:");
        String nombre = sc.nextLine();

        System.out.println("Por favor, ingrese su DNI:");
        String dni = sc.nextLine();

        Paciente paciente = new Paciente(nombre, dni);
        paciente.mostrarDatos();

        System.out.println("Especialidades disponibles:");
        Especialidad[] especialidades = Especialidad.values();
        for (int i = 0; i < especialidades.length; i++) {
            System.out.println("[" + i + "] " + especialidades[i]);
        }

        System.out.println("Seleccione una especialidad:");
        int opcion = sc.nextInt();

        Especialidad elegida = Especialidad.values()[opcion];
        Turno turno = new Turno(paciente, new Medico("Dr. García", elegida));
        turno.mostrarDatos();
    }
}