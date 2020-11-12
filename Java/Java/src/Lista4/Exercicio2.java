package Lista4;

import java.util.Scanner;

public class Exercicio2
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		final int limite[]= new int[10];
		int lancamentos[]=  new int [10];
		int x= 0;
		int totalSoma= 0;
		int maiorValor= 0;
		int contadorMaior= 0;
		int somalan=0;
		
		for(x= 0; x < limite; x++) 
		{
					lancamentos[x]=util.random();
					System.out.printf("\nValor da posição",x+1,":",lancamentos[x]);
					somalan=somalan+lancamentos[x];
					if (lancamentos[x] >=maiorValor)
					{
						if (lancamentos[x] != maiorValor)
						{
							contadorMaior=0;
						}
						maiorValor=lancamentos[x];
						contadorMaior++;
					}
		}
		System.out.printf("\nTotal de valores somados: ", somalan);
		System.out.printf("\nMedia aritmetica %d/%d: ",somalan, limite);
		System.out.printf("\nMaior valor ", maiorValor);
		System.out.printf("\nQuantas vezes aparece: ",contadorMaior);
	}
}
