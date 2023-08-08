package exercicios.designPartterns;

import exercicios.exercicio7.Armazenamento;
import exercicios.exercicio7.ArmazenamentoH2;

public class ArmazenamentoH2Factory implements ArmazenamentoFactory {
    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoH2();
    }
}
