package Lista1;

import java.util.Scanner;

public class Exercicio2 
{

		public static void main (String[] agrs) 
		{
			Scanner leia = new Scanner(System.in);
			
			int dias, meses, anos;
			
			System.out.println("Insira sua idade em dias:");
			dias= leia.nextInt();
			
					anos = (dias / 365);
					meses = (dias / 30);
					dias = ((dias % 365)%30);
					
			System.out.print ("Total de sua idade em anos:" + anos);
			System.out.print ("\nTotal em meses: " + meses);
			System.out.print ("\nTotal em dias:" + dias);
					
		}
}
