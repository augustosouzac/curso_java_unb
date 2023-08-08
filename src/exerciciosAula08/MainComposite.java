package exercicios.designPartterns;

public class MainComposite {
	public static void main(String[] args) {
		TarefaComposta projeto = new TarefaComposta("Projeto ABC");

		Tarefa tarefa1 = new TarefaIndividual("Tarefa 1");
		Tarefa tarefa2 = new TarefaIndividual("Tarefa 2");

		TarefaComposta fase1 = new TarefaComposta("Fase 1");
		fase1.adicionarTarefa(tarefa1);
		fase1.adicionarTarefa(tarefa2);

		Tarefa tarefa3 = new TarefaIndividual("Tarefa 3");
		TarefaComposta fase2 = new TarefaComposta("Fase 2");
		fase2.adicionarTarefa(tarefa3);

		projeto.adicionarTarefa(fase1);
		projeto.adicionarTarefa(fase2);

		projeto.executar();
	}

}
