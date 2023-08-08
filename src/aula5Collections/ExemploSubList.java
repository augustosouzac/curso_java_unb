package aula5Collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploSubList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        List<Integer> subLista = numeros.subList(1, 4);

        System.out.println("Lista original: " + numeros);
        System.out.println("Sublista: " + subLista);
    }
}
