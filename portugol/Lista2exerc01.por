programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//variáveis 
          real p,m,ex
          
		//entrada
		
		escreva ("\nPeso do tomate:")
		leia(p)
		limpa()

		//processamento
		se (p>50.0)
		{
			ex= p*4.00
			m= mat.arredondar ((ex - 200.0),2) 
			
			escreva ("\n Devido ao excesso de peso a multa deverá pagar o valor de:" +m)
			
		}
		senao 
		{
			p= 0
			m= 0
			ex= 0
		}
		
		//saida
		escreva ("P: "+p+", E: "+ex+", M: "+m)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */