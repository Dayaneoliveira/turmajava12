package Estudos;

import java.util.Scanner;

public class MEDIAALUNOS 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		double n1,n2,n3,media;
		
		
		System.out.println("Nota prova 1:");
		n1=leia.nextDouble();
		System.out.println("Nota prova 2:");
		n2=leia.nextDouble();
		System.out.println("Nota prova 3:");
		n3=leia.nextDouble();
		
		
		media=((n1*0.2)+(n2*0.3)+(n3*0.5)/10);
		
		System.out.println("SUA NOTA FINAL É:" +media);
	}
	
}
