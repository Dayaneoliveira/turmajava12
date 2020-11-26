package Desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clienteg7
{
	public static void main (String [] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		
		Cliente cliente1 = new Cliente();
		int codigoProduto; int quantidade; int qTotal = 0; char operacao; int vezes = 0; boolean novoCliente = true;
		
		while(novoCliente == true) 
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
			int menuOpcao = leia.nextInt();
			System.out.print("==================================");
		}
		
		
		
	}
}
