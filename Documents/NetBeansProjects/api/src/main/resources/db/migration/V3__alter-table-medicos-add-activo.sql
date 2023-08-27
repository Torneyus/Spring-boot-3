/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  JAIME DIAZ
 * Created: 24/08/2023
 */

alter table medicos add activo tinyint;
update medicos set activo = 1;