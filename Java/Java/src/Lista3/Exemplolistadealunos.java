package Lista3;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Exemplolistadealunos 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		String times []= {"Corinthians","Palmeiras","Santos","São Paulo"};
		int pontos [][]= new int [4][4];
		char opcao = 0;
		int linha,coluna;
		int x=0;
		
		for (x=0; x<4; x++)
		{
			
			System.out.println(times[x]);
		}
		for (linha = 0; linha < 4; linha++) //linha
		{
			System.out.println("Rodada:"+linha);
			for (coluna = 0; coluna < 4; coluna++)//coluna
			{
				System.out.println("Time " +times [coluna] + " G-Ganhou, E-empate, P-Perdeu:");
				opcao=leia.next().charAt(0);
				
				if(opcao=='G' || opcao== 'g') 
				{
				  pontos[linha][coluna]=3;
				}
				else if(opcao=='E' || opcao== 'e') 
				{
					pontos[linha][coluna]=1;
				}
				else if (opcao=='P'|| opcao== 'p')
				{
					pontos[linha][coluna]=0;
					System.out.println(" ");
				}else 
				  {
					System.out.println("Você não escolheu correto!!!");
					pontos[linha][coluna]=0;
				  }
			}	
				
			
			
		}
		
		
	}			
			
}
