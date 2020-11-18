package Banco2;

import java.time.LocalDateTime;
public class Conta {
	
	//ATRIBUTOS ---------------------------------------------------------
	
	private LocalDateTime dataTransacao = LocalDateTime.now(); 
	private int tipoConta;
	private String cpf_cnpj;
	private double saldo;
	private int numeroConta;
	
	//FIM DOS ATRIBUTOS -------------------------------------------------
	
	//CONSTRUCTORS ------------------------------------------------------
	public Conta(int numeroConta, String cpf_cnpj) {
		this.numeroConta = numeroConta;
		this.cpf_cnpj = cpf_cnpj;	
	}
	//FIM CONSTRUCTORS -------------------------------------------------
	
	//GETTERS e SETTERS ------------------------------------------------
	public LocalDateTime getRelogio() { //RETORNA DATA E HORA, PARA SER UTILIZADO NA FATURA.
		return dataTransacao;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//FIM DOS GETTERS E SETTERS -----------------------------------------
	
	//METODOS ----------------------------------------------------------
	
	public void tipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
			
	}
	
	public void debito( double debito) {
		this.saldo -= debito;
		
	}
	public void credito (double credito)
	{
		this.saldo += credito;
	}
	
	//FIM METODOS
}