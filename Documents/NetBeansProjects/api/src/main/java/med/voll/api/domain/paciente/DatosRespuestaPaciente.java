/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package med.voll.api.domain.paciente;

/**
 *
 * @author JAIME DIAZ
 */
public record DatosRespuestaPaciente(Long id, String Nombre, String documento, String email) {

    public DatosRespuestaPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getDocumento(), paciente.getEmail());
    }
}
