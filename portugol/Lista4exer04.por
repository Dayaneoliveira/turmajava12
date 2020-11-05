programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro lin=3
		const inteiro col=3
		inteiro Quadrado[lin][col]
		inteiro x=0, y=0
		inteiro somaDiagonal=0
		para (x=0; x<lin; x++)
		{
			para (y=0; y<col; y++)
			{
				Quadrado[x][y]=Util.sorteia(1,10)
				se (x==y)
				{
					somaDiagonal=somaDiagonal + Quadrado[x][y]
				}
			}
		}
		para (x=0; x<lin; x++)
		{
			para (y=0; y<col; y++)
			{
				escreva(Quadrado[x][y])
				escreva(" ")
			}
			escreva("\n")
		}
		escreva("TOTAL DE VALORES DA DIAGONAL PRINCIPAL DA MATRIZ ", somaDiagonal)
		
	}	
}			

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 100; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */