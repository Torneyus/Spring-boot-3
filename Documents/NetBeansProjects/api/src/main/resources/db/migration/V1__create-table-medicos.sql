CREATE TABLE medicos(
    
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null unique,
    documento varchar(100) not null unique,
    especialidad varchar(100) not null,
    calle varchar(100) not null,
    distrito varchar(100) not null,
    ciudad varchar(100),
    numero varchar(20),
    complemento varchar(100) not null,

    primary key(id)
);