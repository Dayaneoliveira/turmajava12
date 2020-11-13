package RevisaoJava;

import java.util.*;

public class Exercicio1 
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double valor;
		double valorTotal = 0;
		int pagamento;
		int x;
		
		
		System.out.println("Qual é o valor do produto:");
		valor=leia.nextFloat();
		System.out.println("Qual é a forma de pagamento:\n 1 - Á vista em dinheiro ou cheque, recebe 20% de desconto.\n 2 - À vista no cartão de crédito, recebe 15% de desconto.\n 3 -Em duas vezes, preço normal de etiqueta sem juros.\n 4 - Em três vezes, preço normal de etiqueta mais juros de 10% ");
		pagamento=leia.nextInt();
		System.out.println(" ");
		
		if(pagamento==1) 
		{
			valor=  valor -  (valor * 0.20);
			System.out.println("O valor a ser pago terá um desconto de 20%: R$" +valor);
		}
		else if(pagamento==2) 
		{
			valor= valor -  (valor * 0.15);
			System.out.println("O valor a ser pago terá um desconto de 15%: R$" +valor);
		}
		else if(pagamento==3) 
		{
			valor= (valor / 2);
			System.out.println("O valor a ser pago em duas vezes  SEM JUROS: R$" +valor);
		}
		else if(pagamento==4) 
		{
			valor= ((valor/3)+ (valor * 0.10));
			
			System.out.println("O valor a ser pago em três vezes COM JUROS: R$" +valor);
		}
		else
		{
			System.out.println("OPÇÃO INVALIDA:");
		}
			
	}

	}
