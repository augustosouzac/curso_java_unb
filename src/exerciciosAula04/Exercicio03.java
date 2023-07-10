package exerciciosAula04;

import java.util.Arrays;

public class Exercicio03 {
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[5];

		for (int i = 0; i <= (alunos.length - 1); i++) {
			alunos[i] = new Aluno("Aluno " + i, i);
		}

		alunos[0].setIdade(50);
		alunos[1].setIdade(49);

		for (int i = 0; i <= (alunos.length - 1); i++) {
			System.out.println("Nome: " + alunos[i].getNome());
			System.out.println("Idade: " + alunos[i].getIdade() + "\n");
		}

		System.out.println(Arrays.toString(alunos));
		System.out.println(AlunoMaxIdade(alunos));
		System.out.println(AlunoMinIdade(alunos));
	}

	public static Aluno AlunoMaxIdade(Aluno[] alunosArr) {
		Aluno maxIdade = alunosArr[0];
		
		for (int i = 0; i < alunosArr.length; i++) {
			if(maxIdade.comparar(alunosArr[i]) < 0) {
				maxIdade = alunosArr[i];
			}
		}
		return maxIdade;
	}

	public static Aluno AlunoMinIdade(Aluno[] alunosArr) {
		Aluno minIdade = alunosArr[0];
		
		for (int i = 0; i < alunosArr.length; i++) {
			if(minIdade.comparar(alunosArr[i]) > 0) {
				minIdade = alunosArr[i];
			}
		}
		return minIdade;
	}

}
