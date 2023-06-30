/*
	Exercício 2 : Simulação de um banco com as classes "Conta" e "ContaCorrente"
	Crie uma classe "Conta" que represente uma conta bancária com atributos privados
	número (int) e saldo (double), além de métodos para depositar e sacar dinheiro. 
	Em	seguida, crie uma classe "ContaCorrente" que herde da classe "Conta" e tenha um
	atributo privado limite (double) e um método para realizar um saque considerando o
	limite disponível. Utilize o encapsulamento e herança para implementar a
	funcionalidade.
 */
package exerciciosAula02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int numConta;
		double saldo, valorSaque;

		System.out.println("Informe a conta: ");
		Scanner sc = new Scanner(System.in);
		numConta = sc.nextInt();

		System.out.println("Informe o saldo: ");
		saldo = sc.nextDouble();

		Conta conta = new Conta(numConta, saldo);
		ContaCorrente cc = new ContaCorrente(numConta, saldo);

		System.out.println("Conta nº: " + conta.getNumero());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Informe o valor do saque: ");
		valorSaque = sc.nextDouble();
		if (valorSaque > cc.getSaldo()) {
			System.out.println("Não possui saldo suficiente");
		} else {
			cc.sacar(valorSaque);
		}
		
		System.out.println("Saldo após o saque: " + cc.getSaldo());

		sc.close();

	}
}
