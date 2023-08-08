package aula5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);

        // Min
        Integer menorElemento = Collections.min(numeros);
        System.out.println("Menor elemento: " + menorElemento);

        // Max
        Integer maiorElemento = Collections.max(numeros);
        System.out.println("Maior elemento: " + maiorElemento);

        // Shuffle
        System.out.println("Lista antes do embaralhamento: " + numeros);
        Collections.shuffle(numeros);
        System.out.println("Lista após o embaralhamento: " + numeros);

        // Reverse
        System.out.println("Lista antes da inversão: " + numeros);
        Collections.reverse(numeros);
        System.out.println("Lista após a inversão: " + numeros);

        // BinarySearch
        List<Integer> numerosOrdenados = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenados); // Ordena a lista antes da busca
        int indice = Collections.binarySearch(numerosOrdenados, 8);
        System.out.println("Índice do elemento 8: " + indice);
    }
}