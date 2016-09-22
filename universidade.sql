
create database universidade;
  use universidade;

create table pessoas (
    cpf varchar(11) primary key,
    nome varchar(255) not null,
    sexo enum ('M','F')

  );

create table alunos (
 pessoas_cpf varchar(11) primary key,
 ra varchar(25) unique not null, 
 foreign key(pessoas_cpf) references pessoas(cpf)
 );
 
 create table professores (
 pessoa_cpf varchar(11) primary key,
 matricula char(4)  not null unique, 
 salario decimal(10,2)  not null, 
 foreign key(pessoa_cpf) references pessoas(cpf) 
 );
 
 create table disciplina ( 
   codigo varchar(20) primary key not null,
   nome varchar(255) unique not null, 
   ch_total varchar(10) not null 
 );
 
create table periodo (
  disciplina_code varchar(20) primary key,
  data_inicial varchar(40) not null, 
  data_final varchar(40) not null,
  descricao varchar(255) not null, 
  foreign key(disciplina_code) references disciplina(codigo)
);

create table prerequisito (
  pre_requisito_id varchar(20) primary key,
  disciplina_id varchar(20) unique not null, 
  foreign key(disciplina_id) references disciplina(codigo)
);





 INSERT INTO pessoas (cpf, nome, sexo) values ('12312312377', 'Rodrigo Almeida', 'M');
 insert INTO pessoas (cpf, nome, sexo) values  ('77777777777', 'Raira Carvalho', 'F');
 INSERT INTO pessoas (cpf, nome, sexo) values ('22222222222', 'Vinícius Santos','M');
 INSERT INTO pessoas (cpf, nome, sexo) values  ('77777777778','Alisson dos Anjos','M');
 insert into pessoas (cpf, nome, sexo) values ('88888888888','Nainde Lago', 'F');
 insert into pessoas (cpf, nome, sexo) values ('99999999999', 'Louyze Freire','F' );
 insert into pessoas (cpf, nome, sexo) values ('40030217707', 'Karen Lemos', 'F');
 insert into pessoas (cpf, nome, sexo) values ('25013570190', 'Paulo Henrique Sousa', 'M');
 insert into pessoas (cpf, nome, sexo) values ('02229602055', 'Guilherme Rezende', 'M');
 insert into pessoas (cpf, nome, sexo) values  ('10275461459', 'Kauan Matheus', 'M');
 insert into pessoas (cpf, nome, sexo) values ('83144284181','João Almeida','M');
 insert into pessoas (cpf, nome, sexo) values ('18830823155','Pedro Pinheiro','M');
 insert into pessoas (cpf, nome, sexo) values ('22966307587','Robério de souza','M');
 insert into pessoas (cpf, nome, sexo) values ('40777484617','Márcia Ferrraz','F');
 insert into pessoas (cpf, nome, sexo) values ('04485421961','Bianca Barros','F');
 insert into pessoas (cpf, nome, sexo) values ('71904717403','Jaiane Lopes','F');
 insert into pessoas (cpf, nome, sexo) values ('39587966724','Diogo Nogueira','M');
 insert into pessoas (cpf, nome, sexo) values ('42630106128','Gabriel Marques','M');

   insert into alunos (pessoas_cpf, ra) values ('77777777777', '134567098');
   insert into alunos (pessoas_cpf, ra) values ('22222222222', '001002345');
   insert into alunos (pessoas_cpf, ra) values ('77777777778', '009374596');
   insert into alunos (pessoas_cpf, ra) values ('88888888888', '145923056');
   insert into alunos (pessoas_cpf, ra) values('99999999999', '000056709');
   insert into alunos (pessoas_cpf, ra) values ('40030217707', '111384098');
   insert into alunos (pessoas_cpf, ra) values ('25013570190', '574829345');
   insert into alunos (pessoas_cpf, ra) values ('02229602055', '007374523');
   insert into alunos (pessoas_cpf, ra) values ('12312312377', '008349234');
   insert into alunos (pessoas_cpf, ra) values ('10275461459', '222348590');

   insert into professores (pessoa_cpf, matricula, salario) values ('83144284181','1111','2200');
   insert into professores (pessoa_cpf, matricula, salario) values  ('18830823155','2222','1500');
   insert into professores (pessoa_cpf, matricula, salario) values  ('22966307587','3333','1300');
   insert into professores (pessoa_cpf, matricula, salario) values  ('40777484617','4444','4500');
   insert into professores (pessoa_cpf, matricula, salario) values  ('04485421961','5555','4000');
   insert into professores (pessoa_cpf, matricula, salario) values  ('71904717403','6626','2000');
   insert into professores (pessoa_cpf, matricula, salario) values ('39587966724','7777','8000');
   insert into professores (pessoa_cpf, matricula, salario) values  ('42630106128','9888','1900');

insert into disciplina  (codigo, nome, ch_total) values ('1','Algoritmos e programação de computadores 1','60');
insert into disciplina (codigo, nome, ch_total) values  ('2','Química geral e experimental','60');
insert into disciplina (codigo, nome, ch_total) values ('3','Lógica aplicada a computação','60');
insert into disciplina (codigo, nome, ch_total) values ('4','Desenho técnico por computador','30');
insert into disciplina (codigo, nome, ch_total) values  ('5','Português Instrumental','60');
insert into disciplina (codigo, nome, ch_total) values ('6','Cálculo 1','90');
insert into disciplina (codigo, nome, ch_total) values  ('7','Introdução à engenharia de computação','30');
insert into disciplina (codigo, nome, ch_total) values  ('8','Algoritmos e programação de computadores 2','60');
insert into disciplina (codigo, nome, ch_total) values ('9','Geometria analítica','60');
insert into disciplina (codigo, nome, ch_total) values ('10','Circuitos digitais','60');
insert into disciplina (codigo, nome, ch_total) values ('11','Física 1','60');
insert into disciplina (codigo, nome, ch_total) values ('12','Inglês instrumental','30');
insert into disciplina (codigo, nome, ch_total) values ('13','Cálculo 2', '60');

  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values ('1','20/02/2016','25/07/2016','Introdução a programação');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('2','20/02/2016','25/07/2016','Indotrução a química básica');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('3','20/02/2016','25/07/2016','Álgebra de boole, prolog');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values   ('4','20/02/2016','25/07/2016','Autocad, técnicas de desenho');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('5','20/02/2016','25/07/2016','Regras gramaticais do português básico, redação');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('6','20/02/2016','25/07/2016','Limites e derivadas');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('7','20/02/2016','25/07/2016','Introdução a engenharia de computação');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values ('8','12/08/2016','07/11/2016','c++ ');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('9','12/08/2016','07/11/2016','vetores');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('10','12/08/2016','07/11/2016','circuitos lógicos, tabela da verdade');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('11','12/08/2016','07/11/2016','Aplicações das leis de Newton');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('12','12/08/2016','07/11/2016','Verbo to-be');
  insert into periodo (disciplina_code, data_inicial, data_final, descricao ) values  ('13','12/08/2016','07/11/2016','Integrais');

  insert into prerequisito (pre_requisito_id , disciplina_id) values ('6','13');
  insert into prerequisito (pre_requisito_id , disciplina_id) values ('7','11');
  insert into prerequisito (pre_requisito_id , disciplina_id) values ('1','8');

  /*teste universidade - comandos usados, create table, insert into, create database */