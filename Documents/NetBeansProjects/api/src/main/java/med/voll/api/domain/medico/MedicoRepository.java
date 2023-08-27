/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package med.voll.api.domain.medico;

import java.time.LocalDateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAIME DIAZ
 */
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{

    public Page<Medico> findByActivoTrue(Pageable paginacion);

    @Query("""
           select m from Medico m
           where m.activo = 1 and
           m.especialidad =: especialidad and
           m.id not in(
            select c.medico.id from Consulta c
            c.fecha =: fecha
           )
           order by rand()
           limit 1
           """)
    public Medico SeleccionamedicoConEspecialidadEnFecha(Especialidad especialidad, LocalDateTime fecha);
    
}
