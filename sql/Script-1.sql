use Courses;
drop table if exists teachers;
create table teachers (
  id int primary key auto_increment,
  name varchar(255) NOT NULL
);
drop table if exists courses;
create table courses (
  id int primary key auto_increment,
  active boolean DEFAULT TRUE,
  idTeacher int NOT NULL,
  title varchar(255) NOT NULL,
  hours int NOT NULL,
  level varchar(255) NOT NULL
);

insert into teachers values (1, 'Roberto Canales');
insert into teachers values (2, 'Ruben Aguilera');


insert into courses values (1, true, 1,'TDD', 5, 'Básico');
insert into courses values (2, true, 2,'Angular 1', 15, 'Avanzado');
insert into courses values (3, true, 2,'Angular 2', 50, 'Intermedio');
insert into courses values (4, true, 1,'Soy el 4', 25, 'Intermedio');
insert into courses values (5, false, 2,'Angular 2', 50, 'Intermedio');
insert into courses values (6, true, 2,'Soy el 6', 25, 'Intermedio');
insert into courses values (7, true, 2,'Angular 2', 4, 'Intermedio');
insert into courses values (8, true, 2,'Angular 2', 14, 'Intermedio');
insert into courses values (9, true, 2,'Angular 2', 17, 'Intermedio');
insert into courses values (10, true, 2,'Angular 2', 19, 'Intermedio');
insert into courses values (11, true, 2,'Angular 2', 2, 'Intermedio');
insert into courses values (12, true, 2,'Angular 2', 35, 'Intermedio');
insert into courses values (13, true, 2,'Angular 2', 50, 'Intermedio');