package exerciciosAula04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		String arquivo;
		int operacao = 0;

		Audio audio = new Audio();

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do arquivo: ");
		arquivo = sc.nextLine();

		System.out.println("Tocando áudio: " + audio.abrir(arquivo));

		while (operacao != 9) {
			System.out.println("\n1: Reproduzir \n2: Pausar \n3: Parar \n9: Sair");
			operacao = sc.nextInt();
			if (operacao == 1) {
				System.out.println(audio.reproduzir());
			} else if (operacao == 2) {
				System.out.println(audio.pausar());
			} else if (operacao == 3) {
				System.out.println(audio.parar());
			} else if (operacao == 9) {
				System.out.println("PARANDO REPRODUÇÃO DO ÁUDIO!!!");
				break;
			} else {
				System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");
			}
		}

		sc.close();
	}

}
