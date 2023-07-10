package exerciciosAula04;

public class Triangulo implements Figura{

	@Override
	public double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro(double lado) {
		return lado * 3;
	}

}
