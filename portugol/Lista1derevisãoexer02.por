programa
{
	inclua biblioteca Matematica -->mat
 
	funcao inicio()
	{
		/*/
		 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso 
		 * de uma pessoa adulta. A fórmula é 
		 * IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura
de um adulto e mostre sua condição de acordo
com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso
 
		 */
		real peso=0.0
		real altura=0.0
		cadeia nome
		real IMC=0.0

		escreva ("\nQual é o seu nome:")
		leia (nome)
		escreva ("\nQual é o seu peso:")
		leia (peso)
		escreva ("\nQual é a sua altura:")
		leia(altura)

		IMC= mat.arredondar((peso/altura*2), 2)


		se (IMC<=18.5)
		{
		  escreva("\nVocê esta abaixo do peso:", IMC)
		}
		se (IMC>=18.5 e IMC<=25)
		{
		  escreva("\nVocê esta peso normal:", IMC)
		}
		se (IMC>=25 e IMC<=30)
		{
		  escreva("\nVocê esta acima do peso:", IMC)
		}
		se (IMC>30)
		{
		  escreva("\nVocê esta obeso:", IMC)
		}
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