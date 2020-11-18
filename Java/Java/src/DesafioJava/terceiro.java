package DesafioJava;

public class terceiro extends Funcionarios 
{
		private double adicional;

		public terceiro() 
		{
			
		}

		public terceiro(String codigo, double horas, double valorhora) {
			super(codigo, horas, valorhora);
			
		}

		public double getAdicional() {
			return adicional;
		}

		public void setAdicional(double adicional) {
			this.adicional = adicional;
		}
		
		@Override // para fazer o poliformismo, 
		public double pagamentoSalario() 
		{
			
			return (this.horas*this.valorhora)+this.adicional;
			
		}
		
}
