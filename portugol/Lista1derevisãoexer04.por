programa
{
	
	funcao inicio()
	{
		/*/
		 * 
			4-  	Faça um programa que calcula e escreve a seguinte soma:
			soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 * 
		 * 
		 * 
		 * 
		 */

		 inteiro x=1, y=0, total, mais= 2

		 para (y=1; y<=50; y++)
		 {
		 	total= x+y
			escreva ( x+ "/", y, "\n")

			x= x + mais 
			 
		 }
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */