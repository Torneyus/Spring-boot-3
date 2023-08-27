/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  JAIME DIAZ
 * Created: 25/08/2023
 */
CREATE TABLE pacientes(
    
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    telefono varchar(20) not null,
    email varchar(100) not null unique,
    documento varchar(100) not null unique,
    calle varchar(100) not null,
    distrito varchar(100) not null,
    ciudad varchar(100),
    numero varchar(20),
    complemento varchar(100) not null,
    activo tinyint not null,

    primary key(id)
);
