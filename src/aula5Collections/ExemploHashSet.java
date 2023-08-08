package aula5Collections;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();

        // Adicionando elementos ao HashSet
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Laranja");
        conjunto.add("Abacaxi");

        // Verificando se um elemento está presente no HashSet
        boolean contemBanana = conjunto.contains("Banana");
        System.out.println("Contém Banana? " + contemBanana);

        // Removendo um elemento do HashSet
        conjunto.remove("Laranja");

        // Iterando sobre os elementos do HashSet
        System.out.println("Elementos no conjunto:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // Verificando o tamanho do HashSet
        int tamanho = conjunto.size();
        System.out.println("Tamanho do conjunto: " + tamanho);
    }
}
