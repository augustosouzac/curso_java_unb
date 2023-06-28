package aula3oo.heranca;

public class Gato extends Animal {
	public Gato() {
		super("gato");
		// TODO Auto-generated constructor stub
	}
    @Override
    public void emitirSom() {
        System.out.println("O gato mia.");
    }
}