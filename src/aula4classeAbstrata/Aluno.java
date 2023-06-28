package aula4classeAbstrata;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibirMatricula() {
        System.out.println("Minha matrícula é " + matricula);
    }
}

