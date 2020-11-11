package Lista3;

import java.util.*;	

public class Exercicio1facaenquanto
{
	public static void main (String [] args) 
	{
		Scanner leia=new Scanner(System.in);
		
		int x=233;
		do 
		{
			
				System.out.println(x);
				
				
				if( x>=233 && x<=456) 
				{
					x=x+3;
				}
				else 
				{
					x= x + 5;
				}
			
		}while (x<=456);
	}	
}
