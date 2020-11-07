package Lista1;

import java.util.Scanner;

public class EXERCICIO1 
{
	public static void main(String [] args) 
	{
		Scanner leia= new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Insira sua idade em anos:");
		anos = leia.nextInt();
		
		System.out.println("\nInsira os meses:");
		meses = leia.nextInt();
		
		System.out.println("\nInsira os dias:");
		dias = leia.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		dias = anos + meses + dias;
		
		System.out.println("\nA sua idade em dias é de: " + dias);
		
	}
}
