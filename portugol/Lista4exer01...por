programa
{
	
	funcao inicio()
	{
		inteiro n[5]
		inteiro x = 0
		inteiro MaiorP=0

		para(x=0 ; x<5; x++)
		{
			escreva("digite um valor: ")
			leia(n[x])
		}
		para(x=0; x<5; x++)
		{
			escreva ("\nValor posição ", x+1,":",n[x])
		}
		para (x=0; x<5; x++) 
	  	{
	  		escreva("\nValor posição ", x+1,":",n[x])
	  		se(n[x] > MaiorP)
	  		{
	  			MaiorP =n[x]
	  		}
	  		
			
	  	}
	  	limpa()
	  	escreva ("A maior pontuação foi ", MaiorP)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */