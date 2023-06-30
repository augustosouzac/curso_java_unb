package exerciciosAula02;

public class ContaCorrente extends Conta {
	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
		// TODO Auto-generated constructor stub
	}

	private double limite;


	@Override
	public void sacar(double valor) {
		limite = getSaldo();
		setSaldo(limite - valor);
	}
	
	
}
