programa
{
	
	funcao inicio()
	{
		real a,b,c
		//entrada
		escreva ("\nInsira grupo 1:")
		leia (a)
		escreva ("\nInsira grupo 2:")
		leia (b)
		escreva ("\nInsira grupo 3:")
		leia (c)
		limpa()
		
		//processamento
		se (( a>=0.5 e a<=0.25) e ( b>=0.5 e b<=0.25) e ( c>=0.5 e c<=0.25))
		{		
			escreva ("\nAtividades liberadas")
		}
		se ( (a>=0.3))
		{
			senao se ((a>=0.4) e (b<=0.5))
			{
				escreva ("\nAtividades suspensas")
			}
			senao se ((a>=0.4) e (b>=0.4))
			{
				escreva ("\nAtividades deverão ser suspensas")
			}

			senao se ((a>=0.5) e (b>=0.5) e (c>=0.5))
			{
				escreva ("\nAtividades deverão ser paralisadas")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */