package aula4interface;

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 18);

		if (aluno1.compareTo(aluno2) < 0) {
			System.out.println(aluno1.getNome() + " é mais novo do que " + aluno2.getNome());
		} else if (aluno1.compareTo(aluno2) > 0) {
			System.out.println(aluno1.getNome() + " é mais velho do que " + aluno2.getNome());
		} else {
			System.out.println(aluno1.getNome() + " tem a mesma idade que " + aluno2.getNome());
		}
	}
}