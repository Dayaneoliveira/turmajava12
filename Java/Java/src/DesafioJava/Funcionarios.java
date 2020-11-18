package DesafioJava;

public class Funcionarios
{
	private String codigo;
	protected double horas;
	protected double valorhora;
	
	public Funcionarios() 
	{
		
	}
	public Funcionarios(String codigo, double horas, double valorhora) 
	{
		super();
		this.codigo = codigo;
		this.horas = horas;
		this.valorhora = valorhora;
	}
	public String getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	public double getHoras()
	{
		return horas;
	}
	public void setHoras(double horas) 
	{
		this.horas = horas;
	}
	public double getValorhora() 
	{
		return valorhora;
	}
	public void setValorhora(double valorhora)
	{
		this.valorhora = valorhora;
	}
	
	
	public double pagamentoSalario() 
	{
		
		return this.horas*this.valorhora;
		
	}
}
