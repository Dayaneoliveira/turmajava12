package Desafios;

import java.util.*;

public class Ecom
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double totalcompras = 0.0; //carrinho final das compras
		int pagamento;
		final int qtdeDeProds=10	;
		String produtos[]={"Camiseta azul","Camiseta vermelha", "Camiseta verde", "Camiseta rosa", "Camiseta branca", "Camiseta preta", "Camiseta roxa", "Camiseta amarela", "Camiseta cinza", "Camiseta xadrez" };
		int codProdutos[]={01,02,03,04,05,06,07,8,9,10};
		int estoque[]= {10,10,10,10,10,10,10,10,10,10};
		double preco[]={10.00,11.00,12.00,10.00,11.00,10.00,12.00,10.00,11.00,15.00};
		double carrinhoCompra[] = new double [10];
		int menuOpcao=0, compraOpcao=0, cont=0, qtd =0;
		int verificaCodigo;
		int notaFiscal=0;		
			 	

				

				 
				//leitura/menuprincipal
				do
				{
					System.out.print("==================================");	
					System.out.print("  Bem vindo a Camisaria G7!  ");
					System.out.print("==================================");
					//leitura menu principal
					System.out.print("\n1 - Alterar Estoque.");
					System.out.print("\n2 - Exibir Dados dos Produtos.");
					System.out.print("\n3 - Comprar.");
					System.out.print("\n4 - Sair.");
					System.out.print("\nSelecione o número da opção desejada: ");
					menuOpcao = leia.nextInt();
					System.out.print("==================================");

					//Alterar estoque dos produtos (adicionar ou subtrair)
					if(menuOpcao==1)
					{
						System.out.print("Insira o código do produto a ser alterado: ");
						verificaCodigo = leia.nextInt();

								for (cont=0; cont<qtdeDeProds; cont++)
								{
									if ( verificaCodigo == codProdutos[cont] )
									{ 
										System.out.println("Você selecionou o produto "+produtos[cont]+".");
										System.out.print("Digite a quantidade desejada adicionar: ");
										qtd = leia.nextInt();
										estoque[cont] = estoque[cont] + qtd;
									}
								
								
								}
					
						
					}

					//Exibir dados dos produtos
					else if(menuOpcao==2)
					{		System.out.println("\nCódigo\tEstoque\t  Preço \t Nome do produto");
						for (cont=0; cont<qtdeDeProds; cont++)
						{	
							System.out.println(codProdutos[cont]+"\t "+estoque[cont]+"\t R$"+preco[cont]+"\t\t"+produtos[cont]);
							System.out.print("__________________________________________________\n");
							
							
						}
						System.out.println("\n");
					}
						

					//Opcoes de Compra
					else if (menuOpcao==3)
					{
						do
						{	
							//leitura/menucompra
							System.out.println("1 - Selecionar Produtos.");
							System.out.println("2 - Retirar Itens do Carrinho.");
							System.out.println("3 - Retirar Todos Itens do Carrinho.");
							System.out.println("4 - Pagamento.");
							System.out.println("5 - Voltar ao Menu Anterior.");
							System.out.println("Selecione o número da opção desejada: ");
							compraOpcao = leia.nextInt();
							
							

							//Cliente escolhe os produtos
							if (compraOpcao==1)
							{ 
								System.out.println("Insira o código do produto: ");
								verificaCodigo = leia.nextInt();
								int d = 0; //Adicionando condição de opção invalida
								for (cont=0; cont<qtdeDeProds; cont++)
								{
									if( verificaCodigo == codProdutos[cont] )
									{
				
										System.out.println("Você selecionou o produto "+produtos[cont]+".");
										System.out.println("Digite a quantidade desejada: ");
										qtd = leia.nextInt();
										estoque[cont] = estoque[cont] - qtd;

										carrinhoCompra[cont] = qtd;

										System.out.println("\n              Total de produtos");
										System.out.println("Produto \t Quantidade \t Preço");
										//jogar aqui syso depois do for
										
										d=1;
									}
								
								}
								if (d == 0)
								{
									System.out.println("Opcao Invalida!" );
									System.out.println("Selecione novamente!\n" );
								}	

								
								
								for (cont=0;cont<qtdeDeProds;cont++)
									{
										
									if(carrinhoCompra[cont] > 0)
									{	
										System.out.println(produtos[cont]+"\t      "+carrinhoCompra[cont]+"\t"+(preco[cont]*carrinhoCompra[cont]));
												
									}
								}
								System.out.print("\n\n");
							} 

							
							//no final colocar compraEmAberto == verdadeiro caso tenha algum produto no carrinho

							//Opcao para retirar itens de 1 em 1
							else if(compraOpcao==2)
							{

								System.out.println("Insira o código do produto a ser retirado: ");
								verificaCodigo = leia.nextInt();
								

								for(cont=0; cont<qtdeDeProds; cont++)
								{
									if( verificaCodigo == codProdutos[cont] )
									{ 
										System.out.println("Você selecionou o produto "+produtos[cont]+".");
										System.out.println("Digite a quantidade desejada a retirar: ");
										qtd = leia.nextInt();
										estoque[cont] = estoque[cont] + qtd;

										carrinhoCompra[cont] = carrinhoCompra[cont] - qtd;
									}
								
								
								}
							}

							//Opcao para retirar todos itens do carrinho
							else if(compraOpcao==3)
							{
								
								for(cont=0; cont<qtdeDeProds; cont++)
								{
								carrinhoCompra[cont]=0;
								}

							}

							//Opcao de pagamento
							else if(compraOpcao==4)
							{	notaFiscal++;
								System.out.println("----------------------------------------------");
								System.out.println("\n\nNota fiscal: "+notaFiscal);
								System.out.println("Produto \t Quantidade \t Preço");
							for (cont=0;cont<qtdeDeProds;cont++)
								{
									
								if(carrinhoCompra[cont] > 0)
								{	
									System.out.println(produtos[cont]+"\t      "+carrinhoCompra[cont]+"\t  "+(preco[cont]*carrinhoCompra[cont]));
											
								}
							}
									
							System.out.println("----------------------------------------------");
									
								for (cont=0;cont<qtdeDeProds;cont++)
								{
									totalcompras = ((preco[cont]*carrinhoCompra[cont]) + totalcompras);
								}

								System.out.println("\t\tO total é: "+totalcompras);
								System.out.println("----------------------------------------------");

								do
								{

									System.out.println("\nSelecione a forma de pagamento: ");
									System.out.println("(1)Dinheiro ou cheque, \n(2) Cartão credito, \n(3)2x Sem juros, \n(4)3x com Juros: \n");
									pagamento=leia.nextInt();

									if(pagamento == 1)
									{
										totalcompras = totalcompras - (totalcompras * 0.20);
										System.out.println("\n \t\tO valor total com desconto de 20% é de R$"+ totalcompras);
										System.out.print("=====================");	
										System.out.print(" Agradecemos sua compra, volte sempre! ");
										System.out.print("==========================\n\n");
									}
									else if (pagamento == 2)
									{
										totalcompras =  totalcompras - (totalcompras * 0.15);
										System.out.println("\n \t\tO valor total com desconto de 15% é de R$"+ totalcompras);
										System.out.print("=====================");	
										System.out.print(" Agradecemos sua compra, volte sempre! ");
										System.out.print("===========================\n\n");
									}
									else if (pagamento == 3)
									{
										totalcompras = totalcompras / 2;
										System.out.println("\n \t\tO valor total divido em duas vezes é R$"+totalcompras+" cada parcela");
										System.out.print("=====================");	
										System.out.print(" Agradecemos sua compra, volte sempre! ");
										System.out.print("==========================\n\n");
									}
									else if (pagamento == 4)
									{
										totalcompras = totalcompras/3 + (totalcompras * 0.10) ; 
										System.out.println("\n \t\tO valor total devido em 3x é de R$"+totalcompras+" adicionando 10% de juros");
										System.out.print("=====================");	
										System.out.print(" Agradecemos sua compra, volte sempre! ");
										System.out.print("==========================\n\n");
									}
									else if (pagamento < 1 || pagamento > 4)
									{
										System.out.println("Opção inexistente\n\n");
										pagamento = 0;
											
									}

								}while(pagamento == 0);

							}

						
							else if(compraOpcao != 5)
							{
								System.out.println("Opção inválida!!\n\n");
								System.out.println("-----------------------\n\n");
							}

						//fim opcoes de compra
						}
						
						while	(compraOpcao != 5);
						{
						
						
					}
					}
								
					//verifica se foi digitado uma opcao válida
						else if( menuOpcao != 4)
					{
							System.out.println("Opção inválida!!\n\n");
							System.out.println("-----------------------\n\n");
					}


				//fim menu principal
				}while(menuOpcao != 4);
				{
					
				}
	}
}
