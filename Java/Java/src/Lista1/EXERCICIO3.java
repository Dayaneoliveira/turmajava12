package Lista1;

import java.util.Scanner;

public class EXERCICIO3 
{

	public static void main(String[] args) 
	{
{
		Scanner leia = new Scanner(System.in);	
		int S,H,M;
		int evento=0; 
		
		System.out.println("Qual é o horário do evento:");		
		evento = leia.nextInt();
		
		            M = (evento% 3600)/60;
			        H =(evento/3600);
			        S =((evento%3600)%60);
			        
	System.out.print ("\nTotal em minutos: " + M);
	System.out.print ("\nTotal em horas: "+ H);
	System.out.print ("\nTotal em segundos: "+S);
}

	}
}