package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// toda tabela chama entendida,  para chamar uma tabela coloca @entity

@Entity //isso tabela 
public class Colaboradores 
{
	// ATRIBUTOS QUE SIGNIFICA COLUNAS
	@Id // isso identificador 
	@GeneratedValue (strategy = GenerationType.IDENTITY) // vc vai aumentar sozinho e vai dar uma identidade(IDENTITY)
	private int id;
	@Column
	private String nome;
	@Column
	private boolean fumante;
	
	//GETTERTS E SETTERS EXPOR OS DADOS 
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public boolean isFumante() 
	{
		return fumante;
	}
	public void setFumante(boolean fumante) 
	{
		this.fumante = fumante;
	} 
	
	
	
	
}

