create database ecommerce; 
use ecommerce;

create table cadastro_produtos 
(
	id int primary key auto_increment not null,
    produto varchar (255),
    tamanho enum ('P', 'M', 'G'),
    preco double (6,2),
    pagamento int 
);
insert into cadastro_produtos values
(DEFAULT,'Moletom', 'P', '530.00', default),
(DEFAULT,'Camisa', 'M', '680.00', default),
(DEFAULT,'Blusa', 'P', '750.00', default),
(DEFAULT,'Calcinha', 'G', '500.00', default),
(DEFAULT,'Cueca', 'P', '450.00', default),
(DEFAULT,'Meias', 'M', '200.00', default),
(DEFAULT,'Calça', 'G', '600.00', default),
(DEFAULT,'Camisa Basica', 'P', '300.00', default);


select*from cadastro_produtos;
truncate cadastro_produtos;
select * from cadastro_produtos where preco > 500.00;
select * from cadastro_produtos where preco < 500.00;

UPDATE cadastro_produtos SET preco = '750.00' where produto = 'Moletom';

select * from cadastro_produtos;


