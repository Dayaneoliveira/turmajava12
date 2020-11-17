package Aplicação;

import java.util.Scanner;

import Listadefuncoes.exercicio1funcoescliente;

public class clienteaplicacao 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		exercicio1funcoescliente consumidor1 = new exercicio1funcoescliente( "Dayane", "Oliveira"); //instanciar - criar objeto do tipo pessoa
		exercicio1funcoescliente consumidor2 = new exercicio1funcoescliente("Guilherme");
		
		System.out.println(consumidor1.consumidor);
		System.out.println("Digite o sobrenome");
		consumidor1.sobrenomeConsumidor= leia.nextLine();
		
		
	}
}
