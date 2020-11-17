package Desafios;

import java.util.*;

public class Triangulo 
{
		public static void main (String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			int base1,altura1,area1;
			int base2,altura2,area2;
			
			
			System.out.println("1 primeiro triangulo,qual é a base?");
			base1= leia.nextInt();
			System.out.println("1 triangulo,qual é a altura?");
			altura1= leia.nextInt();
			System.out.println("2 triangulo,qual é a base?");
			base2= leia.nextInt();
			System.out.println("2 triangulo,qual é a altura?");
			altura2= leia.nextInt();
			
			area1=((base1*altura1)/2);
			area2=((base2*altura2)/2);
			
			if (area1>area2) 
			{
				System.out.println("Area 1 é a maior !!!");
			}
			else if (area2<area1)
			{
				System.out.println("Area 2 é a menor !!!");
			}
			else 
			{
				System.out.println("Apenas numeros positivos e maiores que zero, tente novo");
			}
			System.out.println("\nPrimeiro triângulo");
			System.out.printf("Base: ", base1);
			System.out.printf("\nAltura: ", altura1);
			
			System.out.println("\n\nSegundo triângulo");
			System.out.printf("Base: ", base2);
			System.out.printf("\nBase: ", altura2);

		}
}
