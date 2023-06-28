package aula4interface;

public class Aluno implements Ordenavel {

    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Ordenavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            return this.idade - outroAluno.idade;
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

