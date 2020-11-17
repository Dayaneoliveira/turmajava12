package Estudos;

import java.util.Scanner;

public class IDADEPESSOAEXPRESSAEMDIAS
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		int idade,anos,meses,dias;
		
		System.out.println("Em que ano voc  nasceu?");
		anos=leia.nextInt();
		System.out.println("Em que Mes voc  nasceu?");
		meses=leia.nextInt();
		System.out.println("Em que dia voc  nasceu?");
		dias=leia.nextInt();
		
		anos=anos*365;
		meses=meses*30;
		dias=dias;
		idade=anos+meses+dias;
		
		System.out.println("Sua idade expressa em dias È de:" +idade);
		
	}
}
