package aula5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoCollections {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Pedro");

        System.out.println("Lista antes da ordenação:");
        System.out.println(nomes);

        // Ordenação usando o método sort() da classe Collections
        Collections.sort(nomes);

        System.out.println("\nLista após a ordenação:");
        System.out.println(nomes);
        
        // Ordenação usando o método sort() da classe Collections
        Collections.reverse(nomes);
    }
}
