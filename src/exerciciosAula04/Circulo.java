package exerciciosAula04;

public class Circulo implements Figura{
	static double pi = 3.14;
	
	@Override
	public double calcularArea(double raio, double pi) {
		return this.pi * (raio*raio);
	}

	@Override
	public double calcularPerimetro(double raio) {
		return 2 * this.pi * raio;
	}

}
