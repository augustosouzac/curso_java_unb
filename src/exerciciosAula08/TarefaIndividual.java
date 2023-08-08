package exercicios.designPartterns;
/**
 * Leaf
 * @author 03408072108
 *
 */
public class TarefaIndividual implements Tarefa {
    private String descricao;

    public TarefaIndividual(String descricao) {
        this.descricao = descricao;
    }

    public void executar() {
        System.out.println("Executando tarefa individual: " + descricao);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        // Não aplicável para tarefa individual
    }

    public void removerTarefa(Tarefa tarefa) {
        // Não aplicável para tarefa individual
    }
}