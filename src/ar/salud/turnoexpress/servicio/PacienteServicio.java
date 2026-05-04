package ar.salud.turnoexpress.servicio;

import ar.salud.turnoexpress.excepciones.DatosInvalidosException;
import ar.salud.turnoexpress.excepciones.PacienteNoEncontradoException;
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
        if (paciente.getNombre() == null || paciente.getNombre().isBlank()) {
            throw new DatosInvalidosException("El nombre del paciente no puede estar vacío");
        }
        if (paciente.getDni() == null || paciente.getDni().isBlank()) {
            throw new DatosInvalidosException("El DNI del paciente no puede estar vacío");
        }
        return repositorio.save(paciente);
    }

    public List<Paciente> listarTodos() {
        return repositorio.findAll();
    }

    public Paciente buscarPorId(Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new PacienteNoEncontradoException(id));
    }
}