package Lista2;

import java.util.Scanner;

public class Exercicio6 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		int idade = 0;
		System.out.print("\nQual é a sua idade: ");
		idade= leia.nextInt();
		
		if (idade <5)
		{
			System.out.print("\nProibido ");
		}
		else if (idade >=5 && idade <=7) 
		{
			System.out.print("\nInfantil A ");
		}
		else if (idade >=8 && idade <=11) 
		{
			System.out.print("\nInfantil B ");
		}
		else if (idade >=12 && idade <=13) 
		{
			System.out.print("\nJuvenil A ");
		}
		else if (idade >=14 && idade <=17) 
		{
			System.out.print("\nJuvenil B ");
		}
		else if (idade >=18)
		{
			System.out.print("\nAdultos ");
		}
	}
}
