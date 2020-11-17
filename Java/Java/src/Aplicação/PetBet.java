package Aplicação;

import java.util.Scanner;

import Entidade.Aves;
import Entidade.Cachorro;
import Entidade.Pessoa;
public class PetBet {
	public static void main(String[] args)
	{
		
		
		Scanner leia = new Scanner(System.in); //leia objeto do tipo Scanner
		Pessoa cliente1 = new Pessoa("ED", "FICIO"); //instanciar - criar objeto do tipo pessoa
		Pessoa cliente2 = new Pessoa("Ricardo");
			
		Cachorro dog1 = new Cachorro("Pintcher"); //criado um cachorro da raca pintcher
		Cachorro dog2 = new Cachorro("Pitbull");
		Aves ave1 = new Aves ("Verde", "Curvado", "Arara");
		
		
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		System.out.println("Digite o sobrenome");
		cliente1.sobrenome = leia.nextLine();
		System.out.println("Digite o ano de nascimento:");
		cliente1.anoNascimento = leia.nextInt();
		System.out.println("Digite M/F/O:");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		cliente1.idade(); // metodo idade()
		System.out.println(cliente1.idade);
		System.out.println("informando o ano");
		cliente1.idade(2020);
		System.out.println(cliente1.pegaidade(2050));
		System.out.println(cliente1.seuGenero());
		
		
	}
}