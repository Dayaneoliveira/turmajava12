package RevisaoJava;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main (String[] args) 
	
	{
		Scanner leia = new Scanner(System.in);
		double peso,altura,imc;
		System.out.println("Qual � a sua altura:");
		altura= leia.nextDouble();
		System.out.println("Qual � a sua peso:");
		peso= leia.nextDouble();
		
		imc=(peso/(altura*altura));
		
		if (imc<=18.5)
		{
			System.out.printf("\nVoc� esta abaixo do peso:", imc);
		}
		if (imc>=18.5 && imc<=25)
		{
			System.out.printf("\nVoc� esta peso normal:", imc);
		}
		if (imc>=25 && imc<=30)
		{
			System.out.printf("\nVoc� esta acima do peso:", imc);
		}
		if (imc>30)
		{
			System.out.printf("\nVoc� esta obeso", imc);
		}
	}
}
