package Listadefuncoes;

public class avi�o
{
	//atributos - S�O OS COMPONENTES DO OBJETO,OU SEJA OQ ELE CONT�M. 
	
	public String modelo;
	public String fabricante;
	public String peso;
	public int quantidadeAssentos; 
	public String tipoMotor;
	public boolean voando;
	public int velocidade; //quando for private getter and setters 
	
	//construtor - Funcionamento do programa, usa o mesmo nome da classe por isso public "AVIAO" - Pode usar todos os atributos ou at� mesmo um. 
	
	public avi�o(String modelo) 
	{
		
		this.modelo = modelo;
		
	} 
	//sobrecarga - Conforme a necessidade, 
	public avi�o(String fabricante, String peso, int quantidadeAssentos, String tipoMotor) 
	{
		this.fabricante = fabricante;
		this.peso = peso;
		this.quantidadeAssentos = quantidadeAssentos;
		this.tipoMotor = tipoMotor;
	}
	//sobrecarga - construtor padr�o
	public avi�o() 
	{
		
	}
	//metodos - void sem retorno, /// void nao precisa usar RETURN, mas se usar sring ou int precisa no final um return
	public void decolar () 
	{
		this.voando= true;
	}
	public void pouso() 
	{
		this.voando=false;
	}
	public void aumentarvelocidade() 
	{
		//soma 1km por hora, exemplo velocidade+1 ou velocidade 10, depedende do que deseja.
		this.velocidade=this.velocidade + 1;
	}
	public void dimunuirvelocidade() 
	{
		this.velocidade=this.velocidade - 1; 
	}
	
	//encapsulutamento 
	public int getVelocidade() // puxa a informa��o, ele tras da classe -- Ele so pega o valor 
	{
		return velocidade;
	}
	public void setVelocidade(int velocidade) // altera a velocidade - se deletar esse set pois a pessoa nao consegue alterar 
	{
		this.velocidade = velocidade;
	}
	
}
