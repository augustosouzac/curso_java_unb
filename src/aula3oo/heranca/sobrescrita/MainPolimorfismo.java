package aula3oo.heranca.sobrescrita;

import aula3oo.heranca.Animal;
import aula3oo.heranca.Cachorro;
import aula3oo.heranca.Gato;

public class MainPolimorfismo {
	 public static void main(String[] args) {
	        Animal[] animais = new Animal[2];
	        animais[0] = new Cachorro("cachorro");
//	        animais[1] = new Gato("gato");
	        animais[1] = new Gato();
	        for (Animal animal : animais) {
	            animal.emitirSom();
	        }
	    }

}
