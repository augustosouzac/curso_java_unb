package exerciciosAula04;

public class Exercicio04 {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		Circulo c1 = new Circulo();
		Triangulo t1 = new Triangulo();
		
		System.out.println("Área do quadrado: "+q1.calcularArea(5, 5));
		System.out.println("Perímetro do quadrado: "+q1.calcularPerimetro(5));
		
		System.out.println("Área do circulo: "+c1.calcularArea(5, 5));
		System.out.println("Perímetro do circulo: "+c1.calcularPerimetro(5));
		
		System.out.println("Área do triângulo: "+t1.calcularArea(5, 5));
		System.out.println("Perímetro do triângulo: "+t1.calcularPerimetro(5));
	}
}
