/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.consulta.AgendaDeConsultaService;
import med.voll.api.domain.consulta.DatosAgendarConsulta;
import med.voll.api.domain.consulta.DatosDetalleConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JAIME DIAZ
 */
@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private AgendaDeConsultaService servicio;
    
    @PostMapping
    @Transactional
    public ResponseEntity agendarConsulta(@RequestBody @Valid DatosAgendarConsulta datosAgendarConsulta){
        servicio.agendar(datosAgendarConsulta);
        return ResponseEntity.ok(new DatosDetalleConsulta(null, null, null, null));
    }
}
