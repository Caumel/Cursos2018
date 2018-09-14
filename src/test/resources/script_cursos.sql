drop schema if exists Course;

create schema Course;

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
  level int NOT NULL
);

insert into teachers values (1, 'Roberto Canales');
insert into teachers values (2, 'Ruben Aguilera');


insert into courses values (1, true, 1,'TDD', 5, 1);
insert into courses values (2, true, 2,'Angular 1', 5, 1);
insert into courses values (3, true, 2,'Angular 2', 5, 1);