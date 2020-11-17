package classes;

public class conta 
{
	private int numero;
	private String cpf_cnpj;
	private double saldo;
	
	// para mexer no private precisa de metodos.
	//construtor - sempre tem que estar na classe 
	//primeiro trabalho classe depois programa
	
	//public conta() //contrutor padrao --
	//{
		
	//}
	
	public conta (int numero) //construtor sobrecarga
	{
		this.numero=numero;
	}
	public conta (int numero, String cpf_cnpj) //construtor sobrecarga
	{
		this.numero=numero;
		this.cpf_cnpj=cpf_cnpj;
	}
	
	//encapsulamento, proteção.
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public double getSaldo()//puxa a informação do set e mostra no GET
	{
		return saldo;
	}
	
	//public void setSaldo(double saldo) // set vc pode alterar , muitas das vezes no saldo é so tirar ele 
	//{
		//this.saldo = saldo;
	//}
	public void debitar(double debito) 
	{
		this.saldo= this.saldo-debito;
	}
	public void creditar (double credito) 
	{
		this.saldo= this.saldo-credito;
	}
	
}
