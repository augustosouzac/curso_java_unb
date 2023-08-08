package aula5Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ExemploIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("JavaScript");

        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);

            if (elemento.equals("C++")) {
                iterator.remove();
            }
        }

        System.out.println("Lista após a remoção: " + lista);
       
        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);

        Iterator<Integer> iteratorNumeros = numeros.iterator();

        int soma = 0;
        int produto = 1;

        while (iteratorNumeros.hasNext()) {
            int numero = iteratorNumeros.next();
            soma += numero;
            produto *= numero;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
    }
}
