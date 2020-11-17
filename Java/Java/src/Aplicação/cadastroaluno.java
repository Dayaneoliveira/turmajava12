package Aplicação;

import java.util.Scanner;

import Entidade.ALUNO;

public class cadastroaluno
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		
		String nome;
		int matricula;
		int anoNascimento;
		char genero;
		boolean ativo;
	
		System.out.println("Escreva o nome do aluno:");
		nome = leia.next();
		System.out.println("Escreva a matrícula:");
		matricula = leia.nextInt();
		
		
		ALUNO aluno1 = new ALUNO(matricula,nome); //instanciar o funcionario para ler chamar o set, para mostrar o get
		System.out.println("Digite o gênero:");
		aluno1.setGenero(leia.next().toUpperCase().charAt(0));
		System.out.println(aluno1.getGenero());
		System.out.println("Digite o ano de nascimento:");
		aluno1.setAnoNascimento(leia.nextInt());
		aluno1.idade();
		System.out.printf("Bem-vindo %s %s! ",
		aluno1.obterGenero(), aluno1.getNome());
		
				
		
		if (idade1== 0; idade1<= 13) 
		{
			System.out.println("ENSINO FUNDAMENTAL");
		}
		else if (idade>13 && idade=17) 
		{
			System.out.println("ENSINO MEDIO");
		}
		else 
		{
			System.out.println("ENSINO SUPERIOR");
		}
		
		System.out.println("Qual é o seu nome:" +aluno1);
		System.out.println ("Qual é a sua idade:"+idade1);
		System.out.println ("Qual é o seu sexo:" +genero);
	}
}
