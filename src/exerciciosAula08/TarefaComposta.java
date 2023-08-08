package exercicios.designPartterns;

import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {
    private List<Tarefa> tarefas = new ArrayList<>();
    private String descricao;

    public TarefaComposta(String descricao) {
        this.descricao = descricao;
    }

    public void executar() {
        System.out.println("Executando tarefa composta: " + descricao);
        for (Tarefa tarefa : tarefas) {
            tarefa.executar();
        }
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }
}
