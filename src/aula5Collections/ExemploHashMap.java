package aula5Collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap
        mapa.put("João", 25);
        mapa.put("Maria", 30);
        mapa.put("Pedro", 27);
        mapa.put("Ana", 22);

        // Obtendo o valor associado a uma chave
        int idadeMaria = mapa.get("Maria");
        System.out.println("Idade da Maria: " + idadeMaria);

        // Verificando se uma chave está presente no HashMap
        boolean contemAna = mapa.containsKey("Ana");
        System.out.println("Contém chave 'Ana'? " + contemAna);

        // Removendo um par chave-valor do HashMap
        mapa.remove("Pedro");

        // Iterando sobre as chaves e valores do HashMap
        System.out.println("Chaves e valores no mapa:");
        for (String chave : mapa.keySet()) {
            int valor = mapa.get(chave);
            System.out.println(chave + ": " + valor);
        }

        // Verificando o tamanho do HashMap
        int tamanho = mapa.size();
        System.out.println("Tamanho do mapa: " + tamanho);
    }
}
