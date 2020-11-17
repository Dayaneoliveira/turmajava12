package Aplicação;

import java.util.Scanner;

import Listadefuncoes.avião;

public class Turma12Air 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		// variavel 
		String modeloAviao; 
		int valordaVelocidade;
		
		//instanciar objeto, para o usuario. 
		System.out.println("Digite o modelo do avião:");
		modeloAviao=leia.next();
		System.out.println("Qual limite de velocidade para decolar:");
		valordaVelocidade=leia.nextInt();
		//Instanciar o objeto para o programador, não esquecer que new é criando.
		avião aviao1=new avião (modeloAviao);
		
		aviao1.getVelocidade();
		
		//poderia usar (FOR/PARA), depende da forma que deseja programar. 
		if(aviao1.velocidade<10) 
		{
			aviao1.voando=false;
		}
		else 
		{
			aviao1.voando=true;
		}
		//metodos
		System.out.println("O aviao está voando:" +aviao1.voando);
		System.out.println("Qual a velocidade atual:" +aviao1.velocidade);
	}
}
