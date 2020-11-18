package Banco2;

import java.util.Scanner;
import java.util.ArrayList;
public class Cc
{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		ArrayList <String> fatura = new ArrayList<>();
		
		int numeroConta; String cpf_cnpj; int tipoConta; char operacao; double credito; double debito;
		System.out.println("Insira o numero da conta e cpf/cnpj:");
		System.out.print("NUMERO CONTA: ");
		numeroConta = input.nextInt();
		System.out.print("CPF/CNPJ: ");
		cpf_cnpj = input.next();
		
		Conta conta1 = new Conta(numeroConta, cpf_cnpj);
		
		System.out.println("Selecione o tipo de conta: (1 - Corrente, 2 - Poupança, 3 - Especial, 4 - Empresarial)");
		tipoConta = input.nextInt();
		conta1.setTipoConta(tipoConta);
		
		if(conta1.getTipoConta() == 1) {
			ContaCorrente cC1 = new ContaCorrente(numeroConta, cpf_cnpj);
			System.out.println("NUMERO CONTA: "+cC1.getNumeroConta()+"\t|\t CNPJ: "+cC1.getCpf_cnpj());
			
			for(int x = 0; x <= 4; x++) {
				System.out.println("SALDO: "+cC1.getSaldo());
				System.out.println("Deseja realizar uma operação de C - CREDITO ou D - DEBITO:");
				operacao = input.next().toUpperCase().charAt(0);
				
				if(operacao == 'C') {
					System.out.print("INSIRA O VALOR DE CREDITO: R$ ");
					credito = input.nextDouble();
					cC1.credito(credito);
					String itemFatura = ("\nCREDITO - R$ \t"+credito+"\t\t"+cC1.getRelogio());
					fatura.add(x, itemFatura);
				} else if (operacao == 'D') {
					System.out.println("INSIRA O VALOR DE DEBITO: R$");
					debito = input.nextDouble();
					cC1.debito(debito);
					if(cC1.getSaldo() >= 0) {String itemFatura = ("\nDEBITO - R$ \t"+debito+"\t\t"+cC1.getRelogio());
					fatura.add(x, itemFatura);}
				}
			}
			System.out.println("SALDO: "+cC1.getSaldo());
			System.out.println("Deseja solicitar um novo talão de cheque ? (S-sim | N-não)");
			operacao = input.next().toUpperCase().charAt(0);
			if(operacao == 'S') {
				System.out.println("Insira o numero do seu talao de cheque: ");
				int numeroTalao = input.nextInt();
				cC1.setNumeroTalaodeCheque(numeroTalao);
				System.out.println("Deseja emitir um novo talão ? ( S-sim | N-não)");
				operacao = input.next().toUpperCase().charAt(0);
				if(operacao == 'S') {
					System.out.println("Insira a quantidade de talões a emitir:");
					cC1.emitirTalaodeCheque(input.nextInt());
				}
			}
			
		}
		if(conta1.getTipoConta() == 4) {
			ContaEmpresarial cE1 = new ContaEmpresarial(numeroConta, cpf_cnpj);
			System.out.println("NUMERO CONTA: "+cE1.getNumeroConta()+"\t|\t CNPJ: "+cE1.getCpf_cnpj());
			
			for(int x = 0; x <= 4; x++) {
				System.out.println("SALDO: "+cE1.getSaldo());
				System.out.println("Deseja realizar uma operação de C - CREDITO ou D - DEBITO:");
				operacao = input.next().toUpperCase().charAt(0);
				
				if(operacao == 'C') {
					System.out.print("INSIRA O VALOR DE CREDITO: R$ ");
					credito = input.nextDouble();
					cE1.credito(credito);
					String itemFatura = ("\nCREDITO - R$ \t"+credito+"\t\t"+cE1.getRelogio());
					fatura.add(x, itemFatura);
				} else if (operacao == 'D') {
					System.out.println("INSIRA O VALOR DE DEBITO: R$");
					debito = input.nextDouble();
					cE1.debito(debito);
					if(cE1.getSaldo() >= 0) {String itemFatura = ("\nDEBITO - R$ \t"+debito+"\t\t"+cE1.getRelogio());
					fatura.add(x, itemFatura);}
				}
			}
			
			System.out.println("SALDO: "+cE1.getSaldo());
			System.out.println("Deseja realizar um emprestimo ? (S-sim | N-não)");
			operacao = input.next().toUpperCase().charAt(0);
			if(operacao == 'S') {
				System.out.println("LIMITE: "+cE1.getLimite());
				System.out.println("Insira o valor do emprestimo:");
				double emprestimo = input.nextDouble();
				cE1.setEmprestimo(emprestimo);
				System.out.println("SALDO: "+cE1.getSaldo());
			}
			
		}
		System.out.println("OPERAÇÃO:\tVALOR:\t\tDATA:");
		System.out.println(fatura);
	}
}