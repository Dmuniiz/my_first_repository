package Banco;

import java.util.Scanner;

public class TesteContaBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.println("Informe o titular: ");
		String titular = sc.next();

		ContaBanco cb1 = new ContaBanco(numeroConta, titular);

		System.out.println("Saldo: " + cb1.getSaldo());
		System.out.println("Limite: " + cb1.getLimiteSaldoNegativo());

		System.out.println("Digite o valor do limite que a conta pode ficar no negativo: ");
		double novoLimite = sc.nextDouble();
		cb1.setLimiteSaldoNegativo(novoLimite);
		System.out.println(cb1.mostrarDados());

		System.out.println("Quantos depositos deseja fazer: ");
		int quantidadeDepositos = sc.nextInt();

		for (int i = 1; i <= quantidadeDepositos; i++) {
			System.out.println(i + " - Informe o valor que deseja deposito: ");
			double valor = sc.nextDouble();
			cb1.deposito(valor);
		}

		System.out.println(cb1.mostrarDados());

		System.out.println("Informe o valor a ser sacado: ");
		double valorSaque = sc.nextDouble();

		while (valorSaque != 0) {
			cb1.saque(valorSaque);
			valorSaque = sc.nextDouble();
			System.out.println("Saldo atual: " + cb1.getSaldo());

		}

		System.out.println("Dados da conta após saques com while:");
		System.out.println(cb1.mostrarDados());
		System.out.println("Saldo Final: " + cb1.getSaldo());

		/*
		 * do { valorSaque = sc.nextDouble(); cb1.saque(valorSaque);
		 * System.out.println("Saldo atual: " + cb1.getSaldo());
		 * 
		 * }while(valorSaque != 0);
		 * 
		 * System.out.println("Dados da conta após saques com do/while:");
		 * System.out.println(cb1.mostrarDados());
		 */

		sc.close();
	}
}
