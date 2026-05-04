package ar.salud.turnoexpress.excepciones;

public class PacienteNoEncontradoException extends RuntimeException {

    public PacienteNoEncontradoException(Long id) {
        super("No se encontró un paciente con el ID: " + id);
    }
}