package Entidade;
//extender a herança,
public class ContaPoupanca extends CONTA
{
	private int aniversarioConta;

	public ContaPoupanca(String cpf, int numero) 
	{
		
		super(cpf, numero);
		// TODO Auto-generated constructor stub
		this.aniversarioConta=aniversarioConta;
	}

	public int getAniversarioConta() {
		return aniversarioConta;
	}

	public void setAniversarioConta(int aniversarioConta) {
		this.aniversarioConta = aniversarioConta;
	}
	
	
	
}

