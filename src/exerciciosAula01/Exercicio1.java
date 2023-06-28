/*
	Exercício 1: Calcular a soma dos números pares de 1 a N
	Escreva um programa em Java que solicite ao usuário um número inteiro positivo N e calcule a soma de todos os números 
	pares de 1 até N.
	Requisitos:
	●	O programa deve utilizar um loop for para iterar pelos números de 1 a N.
	●	A soma dos números pares deve ser armazenada em uma variável.
	●	Ao final, o programa deve exibir a soma calculada.
*/
package exerciciosAula01;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int x = sc.nextInt();
		int somaPares = 0;

		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			}
		}
		System.out.println("A soma dos números pares é igual a: " + somaPares);

		sc.close();
	}
}