/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

/**
 *
 * @author JAIME DIAZ
 */
public record DatosDetalleConsulta(Long id, Long paciente, Long medico, LocalDateTime fecha) {

}
