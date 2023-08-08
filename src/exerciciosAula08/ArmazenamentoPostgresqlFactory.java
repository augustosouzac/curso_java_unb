package exercicios.designPartterns;

import exercicios.exercicio7.Armazenamento;

public class ArmazenamentoPostgresqlFactory implements ArmazenamentoFactory {
    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoPostgresql();
    }
}