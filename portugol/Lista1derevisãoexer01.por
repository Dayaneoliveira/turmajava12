programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		/*/
		 * Elabore um programa que calcule o que deve ser pago por 
		 * um produto, considerando o preço normal de etiqueta e 
		 * a escolha da condição de pagamento. Utilize os códigos da 
		 * tabela a seguir para ler qual a condição de pagamento 
		 * escolhida e efetuar o cálculo adequado.
		Código Condição de pagamento
	1 À vista em dinheiro ou cheque, recebe 20% de desconto
	2 À vista no cartão de crédito, recebe 15% de desconto
	3 Em duas vezes, preço normal de etiqueta sem juros
	4 Em três vezes, preço normal de etiqueta mais juros de 10%
		*/

		real produto=0.0
		inteiro pagamento
		
		
		
		escreva("\nQual é o valor do produto:")
		leia (produto)

		escreva ("\nQual é a forma de pagamento: (1)Dinheiro/Cheque, (2)Cartão de Crédito,(3)Duas vezes Sem juros, (4)Três vezes Com juros:")
		leia(pagamento) 

		se(pagamento == 1)
		{
			produto= produto - (produto*0.20)
			escreva ("\nO valor do produto tem um desconto de 20%:",produto)
		}
		se(pagamento == 2)
		{
			produto= produto - (produto*0.15)
			escreva ("\nO valor do produto tem um desconto de 15%:",produto)
		}
		se(pagamento ==3)
		{
			produto= produto /2
			escreva ("\nO valor do produto em 2 vezes: é" , produto, "Sem juros")
		}
		se(pagamento == 4)
		{
			produto= produto /3
			escreva ("\nO valor do produto em 3 vezes: é" , produto, "Com juros")
		}
		se(pagamento >=5)
		{
			escreva ("\nNão existe essa forma de pagamento.")
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */