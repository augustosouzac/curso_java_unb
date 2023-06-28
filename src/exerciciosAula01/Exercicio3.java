/*
	Exercício 3: Adivinhe o número
	Escreva um programa em Java que gera um número aleatório entre 1 e 100 e permite que o usuário adivinhe qual é 
	esse número. O programa deve fornecer dicas para ajudar o usuário a chegar à resposta correta. O programa deve 
	continuar executando até que o usuário adivinhe corretamente o número.
	Requisitos:
	●	O programa deve gerar um número aleatório entre 1 e 100 utilizando a classe java.util.Random.
	●	O programa deve solicitar ao usuário que adivinhe o número e ler a entrada do usuário utilizando a classe 
	java.util.Scanner.
	●	O programa deve fornecer dicas ao usuário após cada tentativa, indicando se o número a ser adivinhado é maior ou 
	menor do que a tentativa atual.
	●	O programa deve continuar executando até que o usuário adivinhe corretamente o número.
	●	Ao final, o programa deve exibir o número total de tentativas realizadas pelo usuário para adivinhar o número.
	
	Neste exercício, o programa gera um número aleatório entre 1 e 100 utilizando a classe java.util.Random. 
	Em seguida, o programa solicita ao usuário que adivinhe o número e lê a entrada do usuário utilizando a classe 
	java.util.Scanner. O programa fornece dicas ao usuário após cada tentativa, indicando se o número a ser adivinhado 
	é maior ou menor do que a tentativa atual. O programa continua executando até que o usuário adivinhe corretamente o 
	número. Ao final, o número total de tentativas realizadas pelo usuário é exibido.
	


*/
package exerciciosAula01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numAleatorio = random.nextInt(101) + 1;
		int numTentativas = 1;

		System.out.println("Chute um número: ");
		int chute = sc.nextInt();

		while (numAleatorio != chute) {

			if (chute > numAleatorio) {
				System.out.println("ERROU!!! O número é menor que " + chute);
			} else {
				System.out.println("ERROU!!! O número é maior que " + chute);
			}

			numTentativas += 1;
			System.out.println("Chute outro número: ");
			chute = sc.nextInt();
		}

		System.out.println("PARABÉNS!!! VOCÊ ADIVINHOU APÓS "+numTentativas+" TENTATIVA(S)!!");

		sc.close();
	}
}