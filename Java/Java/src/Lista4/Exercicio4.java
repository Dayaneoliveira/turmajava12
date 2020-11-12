package Lista4;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
				final int lin=3;
				final int col=3;
				int quadrado[][]= new int [lin] [col];
				int x=0, y=0;
				int somaDiagonal=0;
				for (x=0; x<lin; x++)
				{
					for (y=0; y<col; y++)
					{
						quadrado[x][y]=java.util.Random(1,10);
						if (x==y)
						{
							somaDiagonal=somaDiagonal + quadrado[x][y];
						}
					}
				}
				
	}
}
