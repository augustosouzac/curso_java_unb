package aula3oo.construtores;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa() {
        nome = "Sem nome";
        idade = 0;
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos getters e setters...
}