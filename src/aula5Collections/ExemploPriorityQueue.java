package aula5Collections;

import java.util.PriorityQueue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        // Criando uma PriorityQueue de Integers com ordem natural (menor valor no topo)
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();

        // Adicionando elementos à PriorityQueue
        filaPrioridade.add(5);
        filaPrioridade.add(2);
        filaPrioridade.add(8);
        filaPrioridade.add(1);
        filaPrioridade.add(3);

        // Exibindo os elementos da PriorityQueue (ordem de acordo com a prioridade)
        System.out.println("Elementos na fila de prioridade:");
        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }
    }
}