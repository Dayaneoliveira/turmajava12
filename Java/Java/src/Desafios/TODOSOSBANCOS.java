package Desafios;

import java.util.Scanner;

public class TODOSOSBANCOS
{
	public static void main (String[] args) 
	
	{
	Scanner leia = new Scanner(System.in);
		
		int limite = 10;
		char operacao ;
		int numeroConta = 0;
		int conta = 0 ;
		String cnpj;
		boolean novoUsuario = true;
		String cpf;
		int movimento[] = new int[limite];
		String tipoMovimentacao[] = new String[limite];
		double credito;
		double debito;
		String fatura[] = new String[limite];
		int transacao = 0;
		double saldoLimite = 700;
		char usarLimite;
		int numeroTalaodeCheque;
		System.out.println("Entre com o tipo de conta :\n - 1(Poupança)\n - 2(Corrente)\n - 3(Especial)\n - 4(Empresarial)");
		
		while(novoUsuario = true) {
			numeroConta = leia.nextInt();
			if(numeroConta == 1) {
				double saldo = 0.0;
				System.out.println("Entre com seu CPF");
				cpf = leia.nextLine();
				System.out.println("CONTA: "+numeroConta+" CPF:"+cpf);
				System.out.println("SALDO: R$"+saldo);
				
				for(int x = 0; x < limite; x++) {
					System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
					operacao = leia.next().toUpperCase().charAt(0);
					if(operacao == 'C' ) {
							
							System.out.println("Entre com o valor de CREDITO:(operação: "+(movimento[x] +1)+" de 10)");
							saldo=0.0;
							credito = leia.nextDouble();
							saldo = saldo + credito;
							fatura[x] = "R$"+ saldo + " - CREDITO";
							System.out.println("SALDO: R$"+saldo);
					} else if(operacao == 'D') {
							System.out.println("Entre com o valor de DEBITO:(operação: "+(movimento[x] +1)+" de 10)");
							debito = leia.nextDouble();
							saldo = saldo - debito;
							fatura[x] = "R$"+ debito + " - DEBITO";
							if(saldo == 0) {
								System.out.println("SALDO: R$"+saldo);
							}
							if(saldo < 0) {
								saldo = debito + saldo;
							    System.out.println("Saldo insuficiente");
									}
					}else {			
						break;
					}
					System.out.println("Deseja realizar uma nova operação ? (S - Sim / N - Não)");
					operacao = leia.next().toUpperCase().charAt(0);
					if(operacao == 'S') {
	
					} else {
						System.out.println("É o aniversario da conta ? (S / N)");
						operacao = leia.next().toUpperCase().charAt(0);
						if (operacao == 'S') {
							saldo = saldo + (saldo * 0.05);
						}
						System.out.println("\t\tFATURA\n");
						for( x = 0; x<limite; x++) {
							if(fatura[x] == null) {
								break;
							}
							System.out.println("Movimentação "+(x+1)+": "+fatura[x]);
							System.out.println("------------------------------------------");
							
						}
						System.out.println("\nSALDO: "+saldo);
						break;
					}
				}
				
		
			}
			if(numeroConta==2) 
			{ 
				System.out.println("-----------------------------------------");
				System.out.println("Digite o número do CPF:");
				cpf=leia.next();
				System.out.println("-----------------------------------------");
				
				for( int x=0; x<limite; x++) 
				{
				double saldo = 0.0;
				 System.out.println("Deseja fazer Credito ou Debito: (C-credito/ D-debito)");
				 operacao=leia.next().toUpperCase().charAt(0);
				 if(operacao == 'C' )
				 {
						System.out.println("Entre com o valor de CREDITO:  "+(x+1)+")");
						credito = leia.nextDouble();
						saldo = saldo + credito;
						fatura[x]=("R$" +credito+ "- CREDITO");
						System.out.println("Total saldo:" +saldo);
				 } 
				 else if(operacao == 'D') 
					{
						System.out.println("Entre com o valor de DEBITO: "+(x+1)+")");
						debito = leia.nextDouble();
						saldo = saldo - debito;	
						fatura[x]=("R$" +debito+ "- DEBITO");
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
								for(x = 0; x<limite; x++) {
									if(fatura[x] == null) {
										break;
									}
									System.out.println("Movimentação "+(x+1)+": "+fatura[x]);
									System.out.println("------------------------------------------");
								}
							System.out.println("   ");	
							System.out.println("SALDO: R$"+saldo);
							break;
						 }
					}

				}
		}
			if(numeroConta == 3) {
			
				double saldo = 0.0;
				System.out.println("Entre com seu CPF");
				cpf = leia.nextLine();
				System.out.println("CONTA: "+numeroConta+" CPF:"+cpf);
				System.out.println("SALDO: R$"+saldo);
				while(transacao < 3) {
				System.out.print("\nDeseja fazer credito ou debito: (C - credito / D - debito): ");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'C' ) {
					System.out.print("Entre com o valor de deposito: ");
					credito = leia.nextDouble();
					saldo = saldo + credito;
					transacao++;
					System.out.printf("Saldo atualizado: R$%.2f\n", saldo);
				} else if(operacao == 'D') {
					System.out.print("Entre com o valor de saque: ");
					debito = leia.nextDouble();
					if (debito < saldo) {
						saldo = saldo - debito;
						System.out.printf("Saldo atualizado: R$%.2f", saldo);
						transacao++;
					} else if ((debito - saldo) <= saldoLimite) {
						while(true) {
							System.out.print("Deseja usar o seu limite especial? [S/N] ");
							usarLimite = leia.next().toUpperCase().charAt(0);
							if (usarLimite == 'S') {
								System.out.printf("Débito de R$%.2f realizado com sucesso.\n", debito);
								transacao++;
								debito -= saldo;
								saldo -= saldo;
								saldoLimite -= debito;
								saldo -= saldo;
								saldo -= debito;
								System.out.printf("\nSaldo atualizado: R$%.2f\n", saldo);
								System.out.printf("Disponibilidade no limite especial: R$%.2f\n", saldoLimite);
								break;
							} else if(usarLimite == 'N') {
								System.out.println("Acesso ao limite negado.");
								break;
							} else {
								System.out.println("Resposta esquisita!");
							}
						}
					}else {
						System.out.println("Transação não autorizada!");
						System.out.printf("Disponibilidade no limite especial: R$%.2f\n", saldoLimite);
						System.out.printf("Saldo atual: R$%.2f\n", saldo);
					}
				}
			}System.out.println("\n\nVocê ja realizou todas as suas movimentações permitidas por dia. Por hoje é só!");
		}
			if(numeroConta == 4 ) {
				double saldo = 0.0;
				System.out.println("Entre com o CNPJ da empresa:");
				cnpj = leia.nextLine();
				System.out.println("CONTA: "+numeroConta+" CPNJ:"+cnpj);
				System.out.println("SALDO: R$"+saldo);
				
				for( int x = 0; x < limite; x++ ) {
					
					System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
					
					operacao = leia.next().toUpperCase().charAt(0);
					
					if(operacao == 'C' ) {
						
							System.out.println("Entre com o valor de CREDITO:(operação: "+(movimento[x] +1 )+" de 10)");
							
							credito = leia.nextDouble();
							
							saldo = saldo + credito;
							
							System.out.println("SALDO: R$"+saldo);
							
							fatura[x] = "R$"+ credito + " - CREDITO";
							
					} else if(operacao == 'D') {
							System.out.println("Entre com o valor de DEBITO:(operação: "+(movimento[x] +1)+" de 10)");
							
							debito = leia.nextDouble();
							
							saldo = saldo - debito;
							
							fatura[movimento[x]] = "R$"+ debito + " - DEBITO";
							
							if(saldo == 0) {
								
								System.out.println("SALDO: R$"+saldo);
								
								System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - Não)");
								
								operacao = leia.next().toUpperCase().charAt(0);
								
								if (operacao == 'S') {
									
									System.out.print("Insira o valor do emprestimo desejado: (Limite R$1000)");
									
									int emprestimo = leia.nextInt();
									
									if(emprestimo <= 1000) {
										
									saldo = saldo + emprestimo;
									
									System.out.println("SALDO: R$"+saldo);
									
									} else {
										System.out.println("Valor fora do limite, tente novamente mais tarde.");
									}
								}
							}
							if(saldo < 0) {
								saldo = 0;
								System.out.println("Saldo insuficiente.");
								System.out.println("SALDO: R$"+saldo);
								System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - Não)");
								operacao = leia.next().toUpperCase().charAt(0);
								if (operacao == 'S') {
									System.out.print("Insira o valor do emprestimo desejado: (Limite R$1000)");
									int emprestimo = leia.nextInt();
									if(emprestimo <= 1000) {
									saldo = saldo + emprestimo;
									System.out.println("SALDO: R$"+saldo);
									} else {
										System.out.println("Valor fora do limite, tente novamente mais tarde.");
									}
								}
							}
					}
					System.out.println("Deseja realizar uma nova operação ? (S - Sim / N - Não)");
					operacao = leia.next().toUpperCase().charAt(0);
					if(operacao == 'S') {
						
					} else {
						System.out.println("\t\tFATURA\n");
							for( x = 0; x < limite; x++) {
								if(fatura[x] == null) {
									break;
								}
								System.out.println("Movimentação "+(x+1)+": "+fatura[x]);
								System.out.println("------------------------------------------");
							}
						System.out.println("SALDO: R$"+saldo);
						break;
						}
					
					
					}
				}
				System.out.println("DESEJA ENTRAR COM NOVO USUARIO ? (S - Sim | N - Não)");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'S') {
					novoUsuario = true;
					debito = 0;
					credito = 0;
					conta++;
					
				} else {
					novoUsuario = false;
				}
		}
	}
}
