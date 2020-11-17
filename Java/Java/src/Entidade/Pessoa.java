package Entidade;

public class Pessoa
{
	
	//atributos da classe
	public String nome;
	public char genero;
	public int anoNascimento;
	public String sobrenome;
	public int idade;
	
	//construtor//METODO
	public Pessoa() //construtor padrão
	{
		
	}
	public Pessoa(String nome) //UM ATRIBUTO
	{
		this.nome = nome;
	}
	public Pessoa(String nome, String sobrenome)//DOIS ATRIBUTOS 
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	//METODOS 
	public void idade()
	{
		
		System.out.println(2020-this.anoNascimento);
		
	}
	
	public void idade(int anoAtual) {
		
		this.idade = anoAtual - this.anoNascimento;
		
	}
	
	public int pegaidade(int anoAtual) {
		
		this.idade = anoAtual - this.anoNascimento;
		
		return this.idade;
	}
	
	
	public String seuGenero() {
		String nomeGenero="";
		
		if (this.genero=='M') {
			nomeGenero = "MASCULINO";
		}
		else if (this.genero=='F') {
			nomeGenero = "FEMININO";
		}
		else if (this.genero=='O') {
			nomeGenero = "OUTROS";
		}
			
		return nomeGenero;
	}
	
}