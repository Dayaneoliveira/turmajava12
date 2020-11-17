package Entidade;

public class CONTA 
{
		//atributos
		private String cpf;
		private double saldo;
		private int numero; 
		
		//construtor 
		public CONTA (String cpf, int numero) 
		{
			this.cpf=cpf;
			this.numero=numero;
		}
		
		//ENCAPSULAMENTO TOTAL - GETTER E SETTERS
		public String getCpf() 
		{
			return cpf;
		}

		public void setCpf(String cpf)
		{
			this.cpf = cpf;
		}

		
		
		public int getNumero() 
		{
			return numero;
		}

		public void setNumero(int numero)
		{
			this.numero = numero;
		}
		
		//metodos - gerais 
		
		public void debitar (double valorDebito) 
		{
			this.saldo=this.saldo - valorDebito;
		}
		public void creditar(double valorCredito) 
		{
			this.saldo=this.saldo + valorCredito;
		}
}
