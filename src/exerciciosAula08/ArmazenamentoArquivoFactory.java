package exercicios.designPartterns;

import exercicios.exercicio7.Armazenamento;
import exercicios.exercicio7.ArmazenamentoArquivo;

public class ArmazenamentoArquivoFactory implements ArmazenamentoFactory {
    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoArquivo();
    }
}