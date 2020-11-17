package Estudos;

import java.util.Scanner;
import java.math.*;

public class EXPRESSAEVENTOEMHORASMINUTOSESEGUNDOS
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		double segundos,minutos,horas, duracao;
		
		System.out.println("Informe a duração do evento em segundos:");
		duracao=leia.nextDouble();
		
		minutos=((duracao%3600)/60);
		horas=(duracao/3600);
		segundos=((duracao%3600)%60);
		
		
		System.out.println ("\nTotal em horas: "+horas);
		System.out.println ("Total em minutos: "+minutos);
		System.out.println ("\nTotal em segundos: "+segundos);
		
	}
}
