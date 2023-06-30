package exerciciosAula02;

public class Gerente extends Funcionario{
	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	private String departamento;
	
	public void bonusSalarial(double valor) {
		setSalario(getSalario() + valor);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
