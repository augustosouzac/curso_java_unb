/*
	Crie uma classe chamada "Círculo" que represente um círculo com raio. A classe
	deve ter os seguintes atributos privados: raio (double). Implemente métodos para
	calcular a área e o perímetro do círculo. Deve herdar da classe
	/Curso_java_unb/src/aula3oo/heranca/Forma.java
	
	area circulo = A = π r²).
	perimetro = C = 2 * π * r
 */


package exerciciosAula02;

public class Exercicio01 {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(1);
		
		System.out.println("Área: "+circulo.calcularArea());
		System.out.println("Perímetro: "+circulo.calcularPerimetro());
	}
}
