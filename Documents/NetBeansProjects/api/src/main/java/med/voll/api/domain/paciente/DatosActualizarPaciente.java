/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package med.voll.api.domain.paciente;

import lombok.NonNull;
import med.voll.api.domain.direccion.DatosDireccion;

/**
 *
 * @author JAIME DIAZ
 */
public record DatosActualizarPaciente(@NonNull Long id, String nombre, String documento, DatosDireccion direccion) {
    
}
