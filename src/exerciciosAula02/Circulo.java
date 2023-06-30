package exerciciosAula02;

public class Circulo extends aula3oo.heranca.Forma {
	private double raio;
	private double pi = 3.14;
	
	public Circulo (double raio) {
		this.raio = raio;
	}
		
	@Override
	public double calcularArea() {
		return pi * Math.pow(raio, 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * pi * raio;
	}
	
}