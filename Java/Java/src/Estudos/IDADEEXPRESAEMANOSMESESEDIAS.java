package Estudos;

import java.util.Scanner;
import java.math.*;

public class IDADEEXPRESAEMANOSMESESEDIAS 
{
	public static void main (String [] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		int anos,meses,dias;
		
		System.out.println("QUAL É A SUA IDADE EXPRESSA EM DIAS?");
		dias=leia.nextInt();
		
		anos=(dias/365);
		meses=(dias/30);
		dias=((dias%365)%30);
		
		System.out.println("ANO DE NASCIMENTO"+anos);
		
		System.out.println("MES DE NASCIMENTO"+meses);
		
		System.out.println("DIA DE NASCIMENTO:"+dias);
		
		
		
		
				
	}
}
