package ar.salud.turnoexpress.principal;
import java.util.Scanner;
import ar.salud.turnoexpress.modelo.Paciente;
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----BIENVENIDO/A A TurnoExpress---");
        System.out.println("Por favor, ingrese su nombre y apellido:");
        String nombre = sc.nextLine();

        System.out.println("Por favor, ingrese su DNI:");
        String dni= sc.nextLine();

        Paciente paciente = new Paciente(nombre, dni);

        paciente.mostrarDatos();







    }
}
