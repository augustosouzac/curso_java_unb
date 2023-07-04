package exerciciosAula04;

public class Carro extends Veiculo{

	@Override
	public int acelerar(int velocidade) {
		return velocidade;
	}

	@Override
	public int frear() {
		return 0;
	}
	
}
