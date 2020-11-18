package Banco2;

public class ContaEmpresarial extends Conta 
{
	
	private double emprestimo;
	private double limite; 
	
	public ContaEmpresarial(int numeroConta, String cpf_cnpj){
		super(numeroConta, cpf_cnpj);
			
	}
				
	//----------------------------------------------------------//
	
	public double getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
						 
	//-----------------------------------------------------------//
	
	public void gerarEmprestimo(double valorEmprestimo) {
		if (getSaldo() >= 0 ) {
			this.limite = 1000.0;
		}
		if (valorEmprestimo <= limite) {
			super.credito(valorEmprestimo);
			limite -= valorEmprestimo;
		}
	}
}


