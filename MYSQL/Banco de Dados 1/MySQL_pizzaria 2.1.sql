create database db_pizzaria_legal ;
use db_pizzaria_legal ;

create table tb_categoria
(
	id_categoria int not null auto_increment primary key, 
    tipo_pizza varchar (55)
);

create table tb_pizza
(
	id_pizza int not null auto_increment primary key, 
    sabor_pizza varchar (55), 
    tamanho enum ('P', 'M', 'G'),
    borda boolean, 
    preco double (4,2), 
    id_categoria int, 
    constraint tb_pizza foreign key (id_categoria) references tb_categoria (id_categoria));
    
    insert into tb_categoria values 
    (1, "Salgada"),
    (2, "Doce"),
    (3, "Frita"),
    (4, "Mista"),
    (5, "Vegana");
    select * from tb_categoria;
    
    insert into tb_pizza values 
	(default, "Mussarela", 'G', true, 30.00, 1),
    (default, "Brigadeiro", 'M', false, 35.00, 2),
    (default, "Atum", 'G', true, 46.00, 1),
    (default, "Calabresa", 'G', true, 30.00, 1),
    (default, "Lombo", 'G', true, 50.00, 1),
    (default, "Portuguesa", 'M', false, 45.00, 1),
    (default, "Peperonni", 'G', true, 50.00, 1),
    (default, "Rucula", 'G', true, 40.00, 5);
    
    select*from tb_categoria;
    select*from tb_pizza;
    
    select*from  tb_pizza
    where preco > 45.00;
    
   select*from  tb_pizza
   inner join tb_categoria where tb_pizza.id_pizza=tb_categoria.id_categoria;
   
