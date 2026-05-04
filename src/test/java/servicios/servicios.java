package servicios;

import ar.salud.turnoexpress.excepciones.DatosInvalidosException;
import ar.salud.turnoexpress.excepciones.PacienteNoEncontradoException;
import ar.salud.turnoexpress.modelo.Paciente;
import ar.salud.turnoexpress.repositorio.PacienteRepository;
import ar.salud.turnoexpress.servicio.PacienteServicio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PacienteServicioTest {

    @Mock
    private PacienteRepository repositorio;

    @InjectMocks
    private PacienteServicio servicio;

    @Test
    void guardar_conDatosValidos_deberiaGuardarPaciente() {
        Paciente paciente = new Paciente("Federico Adamo", "46013531");
        when(repositorio.save(paciente)).thenReturn(paciente);

        Paciente resultado = servicio.guardar(paciente);

        assertNotNull(resultado);
        assertEquals("Federico Adamo", resultado.getNombre());
        verify(repositorio, times(1)).save(paciente);
    }

    @Test
    void guardar_conNombreVacio_deberiaLanzarExcepcion() {
        Paciente paciente = new Paciente("", "46013531");

        assertThrows(DatosInvalidosException.class, () -> servicio.guardar(paciente));
        verify(repositorio, never()).save(any());
    }

    @Test
    void guardar_conDniVacio_deberiaLanzarExcepcion() {
        Paciente paciente = new Paciente("Federico Adamo", "");

        assertThrows(DatosInvalidosException.class, () -> servicio.guardar(paciente));
        verify(repositorio, never()).save(any());
    }

    @Test
    void buscarPorId_conIdInexistente_deberiaLanzarExcepcion() {
        when(repositorio.findById(99L)).thenReturn(Optional.empty());

        assertThrows(PacienteNoEncontradoException.class, () -> servicio.buscarPorId(99L));
    }

    @Test
    void buscarPorId_conIdExistente_deberiaRetornarPaciente() {
        Paciente paciente = new Paciente("Federico Adamo", "46013531");
        when(repositorio.findById(1L)).thenReturn(Optional.of(paciente));

        Paciente resultado = servicio.buscarPorId(1L);

        assertNotNull(resultado);
        assertEquals("Federico Adamo", resultado.getNombre());
    }
}