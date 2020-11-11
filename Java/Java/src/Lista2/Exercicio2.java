package Lista2;

import java.util.*;

public class Exercicio2 
{
		public static void main (String[]args) 
		{
			Scanner leia= new Scanner(System.in);
			
			String C; 
			int N,limite=50;
			final double salarioTotal,salarioNormal,salarioExcedente;
			double valorHora=10.00, valorExcedente=20.00;
			int E; 
			
			System.out.println("QUAL O CODIGO DO FUNCIONARIO:");
			C=leia.next();
			System.out.println("Digite a quantidade de horas trabalhadas:");
			N=leia.nextInt();
			
			if(N<=limite) 
			{
				salarioNormal= N*valorHora;
				
				System.out.println("Salario bruto:" +salarioNormal);
			}
			
			else if (N>limite)
			{
				salarioExcedente=(N-limite)*valorExcedente;
				salarioNormal= limite * valorHora;
				salarioTotal= salarioNormal + salarioExcedente;
				
				
				
			}
			
		}
	
}
