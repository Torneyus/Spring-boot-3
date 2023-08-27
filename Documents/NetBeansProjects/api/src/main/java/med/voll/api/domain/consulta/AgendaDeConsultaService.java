/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package med.voll.api.domain.consulta;

import med.voll.api.domain.infra.errores.ValidacionDeIntegridad;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAIME DIAZ
 */
@Service
public class AgendaDeConsultaService {
       
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    
    public void agendar(DatosAgendarConsulta datos){
        if(pacienteRepository.findById(datos.paciente()).isPresent()){
            throw new ValidacionDeIntegridad("El id del paciente no fue encontrado");
        }
        if(datos.medico()!= null && medicoRepository.existsById(datos.medico())){
            throw new ValidacionDeIntegridad("El id del medico no fue encontrado");
        }
        var paciente = pacienteRepository.findById(datos.paciente()).get();
        var medico = escogerMedico(datos);
        var consulta = new Consulta(null, medico, paciente, datos.fecha());
        consultaRepository.save(consulta);
    }
    
    private Medico escogerMedico(DatosAgendarConsulta datos){
        if(datos.medico()!=null){
            return medicoRepository.getReferenceById(datos.medico());
        }
        if(datos.especialidad()==null){
            throw new ValidacionDeIntegridad("Debe especificar una especialidad para el medico");
        }
        return medicoRepository.SeleccionamedicoConEspecialidadEnFecha(datos.especialidad(), datos.fecha());
    }
}
