package Lista3;

import java.util.*;
import java.math.*;

public class Exercicio1enquanto
{
	public static void main (String [] args) 
	{
		Scanner leia = new Scanner(System.in);
		int valor=0,totalSoma=0,numero=0;
		int media=0;
		
					
		
		while (valor >=0) 
		{
				numero=numero+1;
				totalSoma=totalSoma+valor;
				media=(totalSoma/numero);
				System.out.printf("Digite um valor:");
				valor=leia.nextInt();
		}
		System.out.print("\nO programa resultou "+numero);
		System.out.print("\nSoma total de vezes é:"+totalSoma);
		System.out.print ("\nA média é de:"+media);
		
	}
}
	
