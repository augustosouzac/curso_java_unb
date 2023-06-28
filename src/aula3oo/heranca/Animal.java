package aula3oo.heranca;

public class Animal {
    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}