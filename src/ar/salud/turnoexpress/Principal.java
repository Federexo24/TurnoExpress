package ar.salud.turnoexpress;

import ar.salud.turnoexpress.modelo.Paciente;
import ar.salud.turnoexpress.servicio.PacienteServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Principal {

    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }

    @Bean
    public CommandLineRunner demo(PacienteServicio servicio) {
        return args -> {

            // Creamos y guardamos dos pacientes
            Paciente p1 = new Paciente("Federico Adamo", "46013531");
            Paciente p2 = new Paciente("María López", "38291045");

            servicio.guardar(p1);
            servicio.guardar(p2);

            System.out.println("=== Pacientes guardados en la base de datos ===");

            // Traemos todos los pacientes de la base de datos
            servicio.listarTodos().forEach(p -> {
                System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | DNI: " + p.getDni());
            });
        };
    }
}