/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import med.voll.api.domain.medico.Especialidad;

/**
 *
 * @author JAIME DIAZ
 */
public record DatosAgendarConsulta(Long id, @NotNull Long paciente, Long medico, @NotNull @Future LocalDateTime fecha, Especialidad especialidad) {

}
