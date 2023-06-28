package aula4classeAbstrata;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar() {
        System.out.println("Olá! Meu nome é " + nome);
    }

    public void apresentarIdade() {
        System.out.println("Tenho " + idade + " anos.");
    }
}

