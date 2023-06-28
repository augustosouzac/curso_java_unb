package aula4classeAbstrata;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void apresentarDisciplina() {
        System.out.println("Eu leciono " + disciplina);
    }
}
