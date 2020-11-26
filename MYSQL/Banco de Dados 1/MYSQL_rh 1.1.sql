create database rh_funcionarios; 
use rh_funcionarios;
create table funcionarios
 (
	idPessoa int primary key auto_increment,
    nome varchar (55),
    cargo varchar (55),
    genero char, 
    cpf varchar (12), 
    salario decimal (6,2) 
);

insert into funcionarios values 
(default,'Alex', 'Administração','M','111.111.111-11','2000.00'),
(default,'Cristina', 'Juridico','F','222.222.222-22','2500.00'),
(default,'Santana', 'Engenharia','M','333.333.333-33','2800.00'),
(default,'Angel', 'Vendas','M','444.444.444-44','1500.00');

select *from funcionarios;

drop table funcionarios;
 
select * from funcionarios where salario > 2000.00;
select * from funcionarios where salario < 2000.00;
select * from funcionarios where salario >= 2000.00;

UPDATE funcionarios SET salario = '2000,00' where nome = 'Angel';
select*from funcionarios;


