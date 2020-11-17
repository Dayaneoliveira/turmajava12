package Entidade;

public class ALUNO 
{
	//atributos 
	
	private int matricula;
	private String nome;
	private int anoNascimento;
	public char genero;
	private boolean ativo; 
	
	//construtor padrão - ele é vazio
	public ALUNO() 
	{
		
	}
	//construtor sobrecarga
	public ALUNO(int matricula, String nome)
	{
		
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//ins
	public int getMatricula()
	{
		return matricula;
	}
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	
	public int getAnoNascimento()
	{
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento)
	{
		this.anoNascimento = anoNascimento;
	}
	
	
	public char getGenero(char genero) 
	{		
		return genero;		
	}
	public void setGenero(char genero)
	{
		this.genero = genero;
	}
	
	//metodos que serão gerados.
	// informar metodos 
	
	public String obterGenero (char genero) 
	{	
		String texto = "";
		
		if (this.genero=='M') 
		{
			texto="Bem vindo Aluno";
		}
		else if (this.genero=='F') 
		{
			texto="Bem vinda Aluna";
		}
		else 
		{
			texto="Bem vindxs Alune";
		}
		return texto;
	}
	public int idade() // padrao não tem valor do atributo
	{
		
		return 2020-this.anoNascimento;
	}
	public int idade(int anoAtual) //sobrecarga tem o valor do atributo
	{
		
		return anoAtual- this.anoNascimento;
	}
	public void situacao() //metodos informados 
	{
		this.ativo = true;
	}
	public void situacao (char status) 
	{
		if (status == 'A') 
		{
			this.ativo=true;
		}
		else 
		{
			this.ativo=false;
		}
	}
	public char[] getgenero() {
		// TODO Auto-generated method stub
		return null;
	}
}
