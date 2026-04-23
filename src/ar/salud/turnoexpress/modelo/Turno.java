package ar.salud.turnoexpress.modelo;

public class Turno {

    private Paciente paciente;
    private Medico medico;

    public Turno (Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void mostrarDatos() {
        System.out.println("Turno confirmado");
        System.out.println("Paciente:     " + paciente.getNombre());
        System.out.println("Médico:       " + medico.getNombre());
        System.out.println("Especialidad: " + medico.getEspecialidad());
    }

}