package Lista2;

import java.util.Scanner;
import java.math.*;

public class Exercicio1 
{
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float P;
		float M = 0;
		float E = 0;
		
		System.out.println("\nQual é o peso:");
		P = leia.nextFloat();
		
		if(P>50.0) 
		{
			E=(float) (P*4.00);
			M=(Math.round((E -200.0)));
			
			System.out.println("\nDevido ao excesso de peso o valor será:" +M);		
		}
		else  
		{
						
			System.out.println("\nP:  " +P+"\n E:   " +E+" \n M:  " +M);
		}
		
		
	}
}
