package exerciciosAula02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		int numConta1, numConta2, numCC01, numCC02, operacao = 0;
		double saldo01, saldo02, saldoCC01, saldoCC02, valorSaque;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número da conta 01: ");
		numConta1 = sc.nextInt();
		System.out.println("Informe o saldo da conta 01: ");
		saldo01 = sc.nextDouble();

		System.out.println("Informe o número da conta 02: ");
		numConta2 = sc.nextInt();
		System.out.println("Informe o saldo da conta 02: ");
		saldo02 = sc.nextDouble();

		Conta conta1 = new Conta(numConta1, saldo01);
		Conta conta2 = new Conta(numConta2, saldo02);

		System.out.println("Informe o número da conta corrente 01: ");
		numCC01 = sc.nextInt();
		System.out.println("Informe o saldo da conta corrente 01: ");
		saldoCC01 = sc.nextDouble();
		
		System.out.println("Informe o número da conta corrente 02: ");
		numCC02 = sc.nextInt();
		System.out.println("Informe o saldo da conta corrente 02: ");
		saldoCC02 = sc.nextDouble();
		
		ContaCorrente cc1 = new ContaCorrente(numCC01, saldoCC01);
		ContaCorrente cc2 = new ContaCorrente(numCC02, saldoCC02);
		
		while (operacao != 9) {
			System.out.println("1 - Sacar | 2 - Depositar | 9 - Sair");
			operacao = sc.nextInt();
			if (operacao != 1 && operacao != 2 && operacao != 9 ) {
				System.out.println("INFORME UMA OPERAÇÃO VÁLIDA!!\n");
			} else if (operacao == 1) {
				System.out.println("Escolha a conta: ");
				System.out.println("1: "+numConta1+"\n2: "+numConta2+"\n3: "+numCC01+"\n4: "+numCC02+"\n9: Sair");
				operacao = sc.nextInt();
				while (operacao != 9) {
					if (operacao == 1) {
						System.out.println("Informe o valor a sacar: ");
						valorSaque = sc.nextDouble();
						conta1.sacar(valorSaque);
						break;
					} else if (operacao == 2) {
						System.out.println("Informe o valor a sacar: ");
						valorSaque = sc.nextDouble();
						conta2.sacar(valorSaque);
						break;
					} else if (operacao == 3) {
						System.out.println("Informe o valor a sacar: ");
						valorSaque = sc.nextDouble();
						cc1.sacar(valorSaque);
						break;
					} else if (operacao == 4) {
						System.out.println("Informe o valor a sacar: ");
						valorSaque = sc.nextDouble();
						cc2.sacar(valorSaque);
						break;
					}
				}
			break;
			}
		}
		
		System.out.println("Saldo da conta 01: "+conta1.getSaldo());
		System.out.println("Saldo da conta 02: "+conta2.getSaldo());
		System.out.println("Saldo da cc 01: "+cc1.getSaldo());
		System.out.println("Saldo da cc 02: "+cc2.getSaldo());
		


		sc.close();

	}
}
