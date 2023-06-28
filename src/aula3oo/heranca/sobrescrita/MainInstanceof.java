package aula3oo.heranca.sobrescrita;

import aula3oo.heranca.Animal;
import aula3oo.heranca.Cachorro;
import aula3oo.heranca.Gato;

public class MainInstanceof {

	public static void main(String[] args) {
		Animal animal = new Cachorro("cachorro"); //Upcast
		Animal animal2 = new Gato(); //Upcast

		if (animal instanceof Cachorro) {
			Cachorro cachorro = (Cachorro) animal; // Downcast
			System.out.println("O objeto é uma instância de Cachorro.");
		} else if (animal instanceof Gato) {
			Cachorro cachorro = (Cachorro) animal; // Downcast forçar o ClassCastException
			System.out.println("O objeto é uma instância de Gato.");
		} else {
			System.out.println("O objeto não é uma instância de Cachorro nem de Gato.");
		}
	}
}