programa
{
	
	funcao inicio()
	{
		inteiro evento,h,m,s
        escreva ("Tempo de duração em segundos do evento:")
        leia (evento)
        
        m =(evento% 3600)/60
        h =(evento/3600)
        s =((evento%3600)%60)

        escreva ("Total em minutos: "+m)
        escreva ("\nTotal em horas: "+h)
        escreva ("\nTotal em segundos: "+s)
        
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