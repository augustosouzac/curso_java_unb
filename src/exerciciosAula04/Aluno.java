package exerciciosAula04;

public class Aluno extends ObjetoComparavel {

	private String nome;
	private int idade;

	Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int comparar(Comparavel c) {
		if (c instanceof Aluno) {
			Aluno outroAluno = (Aluno) c;
			return this.idade - outroAluno.idade;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

	
	
}
