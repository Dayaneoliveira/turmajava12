package Aplica��o;

import java.util.Scanner;

import Listadefuncoes.avi�o;

public class Turma12Air 
{
	public static void main (String[] args) 
	{
		Scanner leia= new Scanner (System.in);
		// variavel 
		String modeloAviao; 
		int valordaVelocidade;
		
		//instanciar objeto, para o usuario. 
		System.out.println("Digite o modelo do avi�o:");
		modeloAviao=leia.next();
		System.out.println("Qual limite de velocidade para decolar:");
		valordaVelocidade=leia.nextInt();
		//Instanciar o objeto para o programador, n�o esquecer que new � criando.
		avi�o aviao1=new avi�o (modeloAviao);
		
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
		System.out.println("O aviao est� voando:" +aviao1.voando);
		System.out.println("Qual a velocidade atual:" +aviao1.velocidade);
	}
}
