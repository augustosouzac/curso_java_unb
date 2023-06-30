package exerciciosAula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String nome, matricula, curso;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Informe a matrícula: ");
		matricula = sc.nextLine();
		System.out.println("Informe o curso: ");
		curso = sc.nextLine();

		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno(nome, matricula, curso);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno2.getNome());

		sc.close();
	}

}
