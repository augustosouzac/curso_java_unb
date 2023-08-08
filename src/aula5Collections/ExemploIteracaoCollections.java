package aula5Collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploIteracaoCollections {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");

        // Iteração usando o loop "for-each"
        System.out.println("Iteração usando o loop \"for-each\":");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Iteração usando o método forEach() com expressão lambda
        System.out.println("\nIteração usando o método forEach() com expressão lambda:");
        nomes.forEach(nome -> System.out.println(nome));

        // Iteração usando o método forEach() com referência a método
        System.out.println("\nIteração usando o método forEach() com referência a método:");
        nomes.forEach(System.out::println);
    }
}
