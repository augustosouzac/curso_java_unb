package exerciciosAula04;

public class Quadrado implements Figura{

	@Override
	public double calcularArea(double valor1, double valor2) {
		return valor1 * valor2;
	}

	@Override
	public double calcularPerimetro(double valor1) {
		return valor1 * 4;
	}

}
