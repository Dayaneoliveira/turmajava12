package Listadefuncoes;

public class Lista2exercicio1
{
	//atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor 
	public Lista2exercicio1 () //padrao 
	{
		
	}
	public Lista2exercicio1 (String nome, String endereco, String telefone) //sobrecarga
	{
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone; 
			
	}
	//encapsulamento - Geter e Setters
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getEndereco() 
	{
		return endereco;
	}
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getTelefone() 
	{
		return telefone;
	}
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
}
