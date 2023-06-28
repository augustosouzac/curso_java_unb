/*
	Escreva um programa em Java que solicite ao usuário um endereço de email e extraia o domínio desse email. O domínio é a 
	parte do email após o símbolo @.
	Requisitos:
	●	O programa deve solicitar ao usuário um endereço de email e ler a entrada do usuário utilizando a classe 
	java.util.Scanner.
	●	O programa deve utilizar o método indexOf para encontrar a posição do símbolo @ no email.
	●	O programa deve utilizar o método substring para extrair a parte do email após o símbolo @.
	●	O programa deve exibir o domínio extraído.

	


*/
package exerciciosAula01;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um endereço de e-mail: ");
		String email = sc.next();

		int indexArroba = email.indexOf("@");
		String dominio;

		dominio = email.substring(indexArroba + 1);

		if (indexArroba == -1) {
			System.out.println("Não possui @ no dado informado!!");
		} else {
			System.out.println("O domínio é igual a: " + dominio);
		}
		sc.close();
	}
}