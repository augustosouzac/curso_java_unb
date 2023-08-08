package aula5Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExemploListIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        ListIterator<String> listIterator = lista.listIterator();

        System.out.println("Percorrendo a lista na ordem original:");
        while (listIterator.hasNext()) {
            String elemento = listIterator.next();
            System.out.println(elemento);
        }

        System.out.println("\nPercorrendo a lista na ordem inversa:");
        while (listIterator.hasPrevious()) {
            String elemento = listIterator.previous();
            System.out.println(elemento);
        }
    }
}
