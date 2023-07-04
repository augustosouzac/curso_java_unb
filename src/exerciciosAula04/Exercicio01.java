package exerciciosAula04;

public class Exercicio01 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		System.out.println("Carro acelera: "+carro.acelerar(80));
		System.out.println("Carro freia: "+carro.frear());
		
		System.out.println("Moto acelera: "+moto.acelerar(100));
		System.out.println("Moto freia: "+moto.frear());
	}
}
