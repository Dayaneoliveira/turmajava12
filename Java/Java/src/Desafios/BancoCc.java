package Desafios;

import java.util.Scanner;

public class BancoCc
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int numeroConta=002;
		double saldo=00.00;
		String cpf="000.000.000-00";
		int movimento=0;
		int limite=10;
		String fatura[]= new String [limite];
		double credito=0;
		double debito=0; 
		char operacao;
		int numeroTalaodeCheque;
		
				System.out.println("Entre com o tipo de conta:\n - 1(Poupança)\n - 2(Corrente)\n - 3(Especial)\n - 4(Empresarial)");
				numeroConta = leia.nextInt();
		
		if(numeroConta==2) 
		{ 
			System.out.println("-----------------------------------------");
			System.out.println("Digite o número do CPF:");
			cpf=leia.next();
			System.out.print("Digite o número da conta corrente:");
			numeroConta=leia.nextInt();
			System.out.println("-----------------------------------------");
			
			for(movimento=0; movimento<limite; movimento++) 
			{
			 System.out.println("Deseja fazer Credito ou Debito: (C-credito/ D-debito)");
			 operacao=leia.next().toUpperCase().charAt(0);
			 if(operacao == 'C' )
			 {
					System.out.println("Entre com o valor de CREDITO:  "+(movimento+1)+")");
					credito = leia.nextDouble();
					saldo = saldo + credito;
					fatura[movimento]=("R$" +credito+ "- CREDITO");
					System.out.println("Total saldo:" +saldo);
			 } 
			 else if(operacao == 'D') 
				{
					System.out.println("Entre com o valor de DEBITO: "+(movimento+1)+")");
					debito = leia.nextDouble();
					saldo = saldo - debito;	
					fatura[movimento]=("R$" +debito+ "- DEBITO");
					 if (saldo<0) 
					 {
						 saldo=0.0;
						 System.out.println("Saldo insuficiente!!!");
						 System.out.println("Total saldo: R$ "  +saldo);
						 if(saldo<=0.0) 
					 {
							 
									System.out.println("Deseja solicitar um novo talão de Cheque: (S-sim/ N-não)");
									operacao=leia.next().toUpperCase().charAt(0);
									if(operacao == 'S' ) 
									{
										System.out.println("Apenas um talão de Cheque por dia: ");
										numeroTalaodeCheque = leia.nextInt();
										if(numeroTalaodeCheque<=0 ) 
										{
											System.out.println("Essa opção não é valida ");
										}
										
										if(numeroTalaodeCheque>=2 ) 
										{
											System.out.println("Erro, apenas um cheque por dia: ");
										}	
									}
									else
								{
										System.out.println("Não seja,obrigado!!! ");
									
									
								}  
					 }
						 
					 }
					 System.out.println("Deseja realizar uma nova operação ? (S - Sim / N - Não)");
					 operacao = leia.next().toUpperCase().charAt(0);
					 if(operacao == 'S')
					 {
							
					 } else
					 {
						 System.out.println("\t\tFATURA\n");
							for(movimento = 0; movimento<limite; movimento++) {
								if(fatura[movimento] == null) {
									break;
								}
								System.out.println("Movimentação "+(movimento+1)+": "+fatura[movimento]);
								System.out.println("------------------------------------------");
							}
						System.out.println("   ");	
						System.out.println("SALDO: R$"+saldo);
						break;
					 }
				}

			}
	}
	}
}