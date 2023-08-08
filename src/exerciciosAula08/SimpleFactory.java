package exercicios.designPartterns;

import exercicios.exercicio7.Armazenamento;
import exercicios.exercicio7.ArmazenamentoArquivo;
import exercicios.exercicio7.ArmazenamentoH2;

public class SimpleFactory {
	public static final String ARQ = "ARQ";
	public static final String H2 = "H2";
	public static final String POSTGRESQL = "POSTGRESQL";
	
	private SimpleFactory() {
		
	}
	
	public static Armazenamento createArmazenamento (String tipo) throws Exception {
		if(tipo.equals(ARQ)) {
			return new ArmazenamentoArquivo();
		} else if (tipo.equals(H2)) {
			return new ArmazenamentoH2();
		} else if (tipo.equals(POSTGRESQL)) {
			return new ArmazenamentoPostgresql();
		 
		} else {
			throw new Exception("Tipo de armazenamento não existe: " + tipo);
		}
	}
}
