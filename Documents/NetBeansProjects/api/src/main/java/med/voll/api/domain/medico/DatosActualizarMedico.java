/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package med.voll.api.domain.medico;

import lombok.NonNull;
import med.voll.api.domain.direccion.DatosDireccion;

/**
 *
 * @author JAIME DIAZ
 */
public record DatosActualizarMedico(@NonNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
