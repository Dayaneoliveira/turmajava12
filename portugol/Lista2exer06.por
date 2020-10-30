programa
{
	
	funcao inicio()
	{
		//variavel 
		inteiro idade
		
		//entrada
		escreva ("\nQual é a sua idade:")
		leia (idade)
		
		//processamento
		se (idade < 5)
		{
			escreva ("\n Proibido:")
		}
		senao se (idade >=5 e idade <=7)
		{
			escreva ("\nInfatil A")
		}
		senao se (idade >=8 e idade <=11)
		{
			escreva ("\nInfatil B")
		}
		senao se (idade >=12 e idade <=13)
		{
			escreva ("\nJuvenil A")
		}
		senao se (idade >=14 e idade <=13)
		{
			escreva ("\nJuvenil B")
		}
		senao se (idade >=18)
		{
			escreva ("\nAdultos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */