package aula3oo.heranca;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;  // Usando "this" para referenciar o atributo da classe
        this.idade = idade;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);  // Usando "this" para referenciar o atributo da classe
        System.out.println("Idade: " + this.idade);
    }
}
