programa
{
	
	funcao inicio()
	{
		const inteiro numAlunos = 29
		cadeia nomes[numAlunos]={"Ana Veronica Nascimento Cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos","Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego Joaquim Silva","Erick Alan","Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira","Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes","Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro","Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de Cássia Antunes Oliveira","Patricia da Silva Machado","Paula Leticia","Raul Fernandes","Ricardo Magalhaes Finkelstein","Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}
		cadeia email[numAlunos]={"anaveronica3001@hotmail.com","bruno.estivalli@gmail.com","brunohmoraes93@gmail.com","daniel.z.ferreira@hotmail.com","dayane873@gmail.com","denisvini@gmail.com","joaquim.diego8@gmail.com","erickalan068@gmail.com","eversonmessias@outlook.com","gabrieldgrafico@outlook.com","guilhermealex01@gmail.com","gui.fdsk@hotmail.com","gumiqueias@hotmail.com","zaq.c@live.com","iurinunes01@gmail.com","jenifer.sdti@gmail.com","jessicacristianebtr@gmail.com","joao_usercon@hotmail.com","larissaribeiro03@hotmail.com","leo_o_nardo1@outlook.com","lucas.00.santos@outlook.com","mari_oli25@hotmail.com","pathsilva09@gmail.com","paula.leticia.braz@gmail.com","raulogus2@gmail.com","ricardomrfin@gmail.com","thiagohdosanjos99@gmail.com","vitoriagcf@hotmail.com","william.xavier07@hotmail.com"}
		logico masculino[numAlunos]={falso,verdadeiro,verdadeiro,verdadeiro,falso,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,verdadeiro,falso,falso,verdadeiro,falso,verdadeiro,verdadeiro,falso,falso,falso,verdadeiro,verdadeiro,verdadeiro,falso,verdadeiro}
		cadeia codigo[numAlunos]={"G7-1","G7-2","G7-3","G7-4","G7-5","G7-6","G7-7","G7-8","G7-9","G7-10","G7-11","G7-12","G7-13","G7-14","G7-15","G7-16","G7-17","G7-18","G7-19","G7-20","G7-21","G7-22","G7-23","G1-24","G7-25","G1-26","G7-27","G7-28","G7-29"}
		inteiro atvEntregue[numAlunos], notas[numAlunos]
		inteiro cont=0, menuOpcao=0, verificador=0
		caracter entregaAtiv
		cadeia verificaCodigo
		cadeia nome
		
		faca{
			escreva("1 - Exibir o nome e o código de todos os alunos.")
			escreva("\n2 - Exibir os dados de um aluno pelo código.")
			escreva("\n3 - Opcoes de Entrega de Atividade.")
			escreva("\n4 - Sair.")
			escreva("\nSelecione o número da opção desejada: ")
			leia(menuOpcao)
			limpa()
			se( menuOpcao == 1)
			{
				para(cont=0; cont<numAlunos; cont++)
				{
					escreva("\nNome: ",nomes[cont]," - ",codigo[cont])
				}
				escreva("\n\n")
			}
			senao se( menuOpcao == 2)
			{
				faca{
					escreva("Insira o código do aluno: ")
					leia(verificaCodigo)
					limpa()
					
					para(cont=0; cont<numAlunos; cont++)
					{
						se( verificaCodigo == codigo[cont] )
						{
					
							se(masculino[cont] == falso)
							{
								escreva("Aluna: ",nomes[cont])
								escreva("\nCódigo: ",codigo[cont])
								escreva("\nEmail: ",email[cont])
								escreva("\nAtividades entregues: ",atvEntregue[cont])
								escreva("\nNota atual: ", notas[cont])
							}
							senao se (masculino[cont] == verdadeiro)
							{
								escreva("Aluno: ",nomes[cont])
								escreva("\nCódigo: ",codigo[cont])
								escreva("\nEmail: ",email[cont])
								escreva("\nAtividades entregues: ",atvEntregue[cont])
								escreva("\nNota atual: ", notas[cont])
							}
							escreva("\n\n")
							verificador=1	
						}
							
			
					}
					se(verificador != 1)
					{
						escreva("Código não existe\n\n")
					}
					
					verificador=0
					escreva("Deseja continuar? S/N: ")
					leia(verificaCodigo)
					limpa()
					
				}enquanto(verificaCodigo != "N" e verificaCodigo != "n")
				
			}
			senao se( menuOpcao == 3)
			{
				faca{
					escreva("Insira o código do aluno: ")
					leia(verificaCodigo)
					limpa()
					
					para(cont=0; cont<numAlunos; cont++)
					{
						se( verificaCodigo == codigo[cont] )
						{
					
							escreva("O aluno ",nomes[cont]," entregou a atividade? S/N: ")
							leia(entregaAtiv)
						
							se( entregaAtiv == 's' ou entregaAtiv == 'S')
							{
								notas[cont] = notas[cont] + 1
								atvEntregue[cont] =  atvEntregue[cont] + 1
							}
							senao se( entregaAtiv == 'n' ou entregaAtiv == 'N')
							{
								atvEntregue[cont] =  atvEntregue[cont] + 1
							}
							escreva("\n\n")
							verificador=1	
						}
						senao se( verificador != 1 )
						{
							verificador =0
						}	
			
					}
					se(verificador != 1)
					{
						escreva("Código não existe\n\n")
					}
					
					verificador=0
					escreva("Deseja continuar? S/N: ")
					leia(verificaCodigo)
					limpa()
					
				}enquanto(verificaCodigo != "N" e verificaCodigo != "n")
			}
			senao se( menuOpcao != 4)
			{
				escreva("Opção inválida!!\n\n")
				escreva("-----------------------\n\n")
			}
		
		}enquanto(menuOpcao != 4)
				
				
				
	}			
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */