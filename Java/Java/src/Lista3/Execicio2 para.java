package Lista3;

import java.util.*;

public class Execicio1 
{
	public static void main (String[] args)
	{
		Scanner leia= new Scanner (System.in);

		int contador,soma=0;
		
		for(contador=0; contador<=500; contador++)
		{
			if((contador%2)!=0 && (contador%3) ==0)
			{
				soma= contador + soma;
				
				System.out.println("\nImpares múltiplos de 3 é de:"+soma);
			}
		}
		
		
	}
}
