package Trycatch;

import java.util.Scanner;
public class Testejava {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int notas[] = new int[4];
		String nome;
		int qtde;
		//String erro;
		
		try {
			System.out.println("Sistema de notas");
			System.out.print("Digite o nome do aluno: ");
			nome = leia.nextLine();
			System.out.print("Digite a quantidade de notas para cadastro: ");
			qtde = leia.nextInt();
			
			for (int x=0; x<qtde; x++)
			{
				System.out.print("\nDigite a nota "+(x+1)+" :");
				notas[x] = leia.nextInt();
				
			}
			
		} //fim do try
		catch (java.util.InputMismatchException erro)
		{
			System.out.println("Vc não digitou um numero inteiro. Vacilo!!!");
			erro.printStackTrace();
			
		}
		catch (java.lang.ArrayIndexOutOfBoundsException erro)
		{
			System.out.println("Tamanho do vetor tá errado. Te vira!!!!");
			erro.printStackTrace();
		}
		
		System.out.println("Todas as notas cadastradas!!!");
		System.out.println("Obrigado, fim de programa");
	}
}