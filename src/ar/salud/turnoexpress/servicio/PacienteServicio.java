package ar.salud.turnoexpress.servicio;

import ar.salud.turnoexpress.modelo.Paciente;
import ar.salud.turnoexpress.repositorio.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    private final PacienteRepository repositorio;


    public PacienteServicio(PacienteRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Paciente guardar(Paciente paciente) {
        return repositorio.save(paciente);
    }

    public List<Paciente> listarTodos() {
        return repositorio.findAll();
    }
}