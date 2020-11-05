programa
{
	
	funcao inicio()
	{
		 const inteiro lin=1
		 const inteiro col=2
		 inteiro N1[lin][col]
		 inteiro N2[lin][col]
		 inteiro M1[lin][col]
		 inteiro M2[lin][col]
		 inteiro x=0, y=0

		 para(x=0; x<lin; x++)
		 {
		 		para (y=0; y<col; y++)
		 		{
		 			escreva ("Qual é o valor:")
					leia(N1[x] [y])
		 		}
		 }
		 para(x=0; x<lin; x++)
		 {
		  		para (y=0; y<col; y++)
		  		{
		  			escreva ("Qual é o valor:")
					leia(N2[x] [y])	
		  		}
		 }
		 para(x=0; x<lin; x++)
		 {
		 	para(y=0; y<col; y++)
		  		{
		  			M1[x][y]= N1[x][y] + N2 [x][y])
		  			escreva (" ", M1[x][y])	
		  		}
		 }escreva ("\n ")	  		
		  para(x=0; x<lin; x++)
		 {
		 	para(y=0; y<col; y++)
		  		{
		  			M2[x][y]= N1[x][y] - N2 [x][y])
		  			escreva (" ", M2[x][y])	
		  		} 			
		
	 	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 78; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */