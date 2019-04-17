create database batallafrescas;
use batallafrescas;

create table ganadores(
    id_ganador int auto_increment,
    nombre varchar(50),
    cantidad_bebida int,
    constraint pk_id_ganador primary key (id_ganador)
    );