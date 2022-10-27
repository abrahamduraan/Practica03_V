# Practica03_V
Practica03, Desarrollo de Aplicaciones Web y Patrones

Deberá ejecutar el siguiente script en su MySql WorkBench, y asi realizar la creacion de la Base de Datos necesaria para el programa de Practica 03.

CREATE SCHEMA practica;
create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

CREATE TABLE practica.estado (
  id_estado INT NOT NULL AUTO_INCREMENT,
  nombre_Estado VARCHAR(25) NOT NULL,
  capital VARCHAR(25) NOT NULL,
  poblacion INT NOT NULL,
  costas INT NOT NULL,
  PRIMARY KEY (id_estado))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
