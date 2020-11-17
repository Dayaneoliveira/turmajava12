package Estudos;

import java.util.Scanner;

public class CALCULEAEXPRESSAO {

	public static void main(String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		double a,b,c,d,r,s;
		
		System.out.println("Insira o numero A:");
		a= leia.nextInt();
		System.out.println("Insira o numero B:");
		b=leia.nextInt();
		System.out.println("Insira o numero C:");
		c=leia.nextInt();
		
		r= Math.pow(a+b, 2);
		s= Math.pow(b+c, 2);
		d= ((r+s)/2);
		
		System.out.println("A expressão D é:"+d);
	}

}
