
programa
{
		
	funcao inicio()
	{
		inteiro valor,totalSoma,n
		real media
		
		valor=0
		n=0
		totalSoma=0
		media=0
		
		enquanto(valor >= 0)
		{
			n=n+1
			totalSoma=totalSoma + valor
			media=totalSoma/n
			escreva("Digite um valor: ")
			leia(valor)
		}
		escreva("O programa rodou ",n," vezes, a soma total é de ",totalSoma," e a média é de ",media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */