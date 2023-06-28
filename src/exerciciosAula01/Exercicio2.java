/*
	Exercício 2: Calcular a soma dos números pares de M a N
	Escreva um programa em Java que solicite ao usuário 2 números inteiros positivos M e N e calcule a soma de todos os 
	números pares de M até N.
	Requisitos:
	●	O programa deve utilizar um loop for para iterar pelos números de M a N.
	●	A soma dos números pares deve ser armazenada em uma variável.
	●	Ao final, o programa deve exibir a soma calculada.

*/
package exerciciosAula01;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int x1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int x2 = sc.nextInt();

		int somaPares = 0;

		for (int i = x1; i <= x2; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			}
		}
		System.out.println("A soma dos números pares é igual a: " + somaPares);

		sc.close();
	}
}