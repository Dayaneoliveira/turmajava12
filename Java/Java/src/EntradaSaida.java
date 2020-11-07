import java.util.Scanner;

public class EntradaSaida 
{
	
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		int a;
		int b;
		int soma;
		
		System.out.println("Entre com o valor de A:");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B:");
		b = ler.nextInt();
		soma=a+b;
		
		System.out.println("O valor da soma é:"+ soma);
		
	}
		
		
 }
