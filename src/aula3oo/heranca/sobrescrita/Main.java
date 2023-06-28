package aula3oo.heranca.sobrescrita;

import aula3oo.heranca.Animal;
import aula3oo.heranca.Cachorro;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        animal.emitirSom();  // Saída: "O animal emite um som."
        
        Cachorro cachorro = new Cachorro("cachorro");
        cachorro.emitirSom();  // Saída: "O cachorro late."
        
//        Animal animalCachorro = new Cachorro("animalCachorro");
//        animalCachorro.emitirSom(); 
    }
}