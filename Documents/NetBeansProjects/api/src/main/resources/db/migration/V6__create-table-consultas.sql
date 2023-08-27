/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  JAIME DIAZ
 * Created: 25/08/2023
 */
CREATE TABLE consultas(
    
    id bigint not null auto_increment,
    medico bigint not null,
    paciente bigint not null,
    fecha datetime not null,

    primary key(id),
    constraint fk_consultas_medico foreign key(medico) references medicos(id),
    constraint fk_consultas_paciente foreign key(paciente) references pacientes(id)
);

