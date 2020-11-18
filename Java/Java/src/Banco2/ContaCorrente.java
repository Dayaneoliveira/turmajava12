package Banco2;


	public class ContaCorrente extends Conta
	{
		private int numeroTalaodeCheque;
		
		public ContaCorrente(int numeroConta, String cpf_cnpj) 
		{
			super(numeroConta, cpf_cnpj);	
		}

		public int getNumeroTalaodeCheque() {
			return numeroTalaodeCheque;
		}

		public void setNumeroTalaodeCheque(int numeroTalaodeCheque) {
			this.numeroTalaodeCheque = numeroTalaodeCheque;
		}
		public void emitirTalaodeCheque(int numeroTalaodeCheque) 
		{
			numeroTalaodeCheque ++;
		}
			
	
}  



