package exercicios.designPartterns;
/**
 * Component 
 * @author 03408072108
 *
 */
public interface Tarefa {
    void executar();
    void adicionarTarefa(Tarefa tarefa);
    void removerTarefa(Tarefa tarefa);
}