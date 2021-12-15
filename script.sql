create database if not exists dbprojects;

use dbprojects;

create table if not exists T_Employe (
    id_emp int AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(30),
    prenom VARCHAR(30)
);

create table if not exists T_project (
    id_proj int AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(30),
    duree int
); 

create table if not exists emp_proj (
    id_proj int,
    id_emp int,
    constraint pk_emp_proj PRIMARY key (id_proj, id_emp),
    constraint fk_emp FOREIGN key (id_emp) REFERENCES T_Employe(id_emp),
    constraint fk_proj FOREIGN key (id_proj) REFERENCES T_Projet(id_proj)
);

insert into T_Employe values (null,"emp1","khalil");
insert into T_Employe values (null,"emp2","klklk");
insert into T_Employe values (null,"emp3","hjhjh");
insert into T_Employe values (null,"emp4","hjhjhj");
insert into T_Employe values (null,"emp5","khajkjkjk");

insert into T_project values(null,"Projet CAP1",35);
insert into T_project values(null,"Projet CAP2",334);
insert into T_project values(null,"Projet CAP3",55);
insert into T_project values(null,"Projet CAP4",66);

