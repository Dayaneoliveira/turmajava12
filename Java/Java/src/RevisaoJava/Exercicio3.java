package RevisaoJava;

import java.util.*;

public class Exercicio3
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int x=0;
		int contador =0;
				 

			
				do
				{
					System.out.println ("\nQual é o número:");
					x=leia.nextInt();

							if (x>=0 && x<=25)
						{
							contador ++;
						}
							if (x>=26  && x<=50)
						{
							contador ++;
						}
							if (x>=51 && x<=75)
						{
							contador ++;
						}
							if (x>=76 && x<=100)
						{
							contador ++;
						}

				} 	
				while(x>0);
				System.out.println ("\nSeguintes intervalos."+ contador);
	}

}
