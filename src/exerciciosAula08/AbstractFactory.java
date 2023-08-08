package exercicios.designPartterns;

import exercicios.exercicio7.Armazenamento;

public class AbstractFactory {
	public static final String ARQ = "ARQ";
	public static final String H2 = "H2";
	public static final String POSTGRESQL = "POSTGRESQL";
	
	private AbstractFactory() {
		
	}
	
    public static Armazenamento createArmazenamento(String tipo) throws Exception {
        ArmazenamentoFactory factory;

        if (tipo.equals(ARQ)) {
            factory = new ArmazenamentoArquivoFactory();
        } else if (tipo.equals(H2)) {
            factory = new ArmazenamentoH2Factory();
        } else if (tipo.equals(POSTGRESQL)) {
            factory = new ArmazenamentoPostgresqlFactory();
        } else {
            throw new Exception("Tipo de armazenamento não existe: " + tipo);
        }

        return factory.criarArmazenamento();
    }
}
