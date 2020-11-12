package Lista3;

import java.util.Scanner;

public class Timematriz 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
				
				final  int linha =5;
				final  int coluna=31;
				String matricula[][]= new String [linha][coluna];
				int x,dias;
				
				System.out.println("Qual dia corresponde:");
				dias=leia.nextInt();
				
				dias=dias-1;
				
				if(dias>0 && dias<=31)
				{
					for(x=0; x<5; x++)
					{
					matricula [x][dias]=leia.next();
					System.out.printf("\nInsira a tarefa %d:"+(x+1));
						
					}
				}
				
				
	}
}
