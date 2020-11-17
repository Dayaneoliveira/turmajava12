package Listadefuncoes;

public class exercicio1funcoescliente 
{
	//atributos
	//metodos 
		
	public String consumidor; 
	public int cpf; 
	public char compras;
	public String pagamento;
	public String sobrenomeConsumidor;
	
	public exercicio1funcoescliente(String consumidor, int cpf, char compras, String pagamento) 
	{
		
		this.consumidor = consumidor;
		this.cpf = cpf;
		this.compras = compras;
		this.pagamento = pagamento;
		this.sobrenomeConsumidor = sobrenomeConsumidor;
	}
	
	public exercicio1funcoescliente() //construtor padrão
	{
		
	}
	public exercicio1funcoescliente(String consumidor) //um atributo 
	{
		this.consumidor = consumidor;
	}
	public exercicio1funcoescliente(String consumidor, String sobrenome)//DOIS ATRIBUTOS 
	{
		this.consumidor = consumidor;
		this.sobrenomeConsumidor = sobrenomeConsumidor;
	}
	
}
