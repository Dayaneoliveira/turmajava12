package DesafioJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.terceiro;

public class Cadfun
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		//variaveis 
		int numero;
		
		List<Funcionarios> cadastro = new ArrayList<>(); //objeto é o funcionario por isso esta dentro <>, tipos que aceitam gerar lista //interface
		
		System.out.println("Digite o numero de funcionarios para cadastro:");
		numero = leia.nextInt();
		
		for (int x=1 ; x<=numero; x++) 
		{
			System.out.println("Empregado"+x);
			System.out.println("Terceiro S/N:  ");
			char resposta = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o codigo do funcionario: ");
			String codigo = leia.next();
			System.out.println("Digite as horas: ");
			double horas=leia.nextDouble();
			System.out.println("Digite valor horas: ");
			double valorhora=leia.nextDouble();
			
			if(resposta == 'S') 
			{
				System.out.println("Digite o valor do adicional deste terceiro");
				double adicional=leia.nextDouble();
				cadastro.add (new terceiro (codigo,horas,valorhora+(adicional)));// para transformar issso em terceiro so colocar ele dentro//polimorfismo 
				 
			}
			else 
			{
				cadastro.add(new Funcionarios(codigo,horas,valorhora)); //cadastro da lista , precisa colocar tudo dentro 
			}
			
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionarios func: cadastro) //func cria dentro do for //forint
		{
			System.out.println(func.getCodigo() + " - " +String.format("%.2f",func.pagamentoSalario()));
		}
	}
}
