/*Exercício 3: Cadastro de funcionários com as classes "Funcionario" e "Gerente"

Crie uma classe "Funcionario" com atributos privados nome (String) e salario (double), 
além de métodos getters e setters. 

Em seguida, crie uma classe "Gerente" que herde da classe "Funcionario" e tenha um atributo privado departamento (String)
e um método para calcular o bônus salarial. 

Utilize o encapsulamento e herança para implementar a funcionalidade.*/

package exerciciosAula02;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		String nome, depto;
		double salario, bonus;
		int flagGerente;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionário: ");
		nome = sc.nextLine();

		System.out.println("Informe o salário do funcionário: ");
		salario = sc.nextDouble();

		System.out.println("É gerente? 1: Sim / 2: Não ");
		flagGerente = sc.nextInt();

		if (flagGerente == 1) {
			Gerente gerente = new Gerente(nome, salario);
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Informe o depto do gerente: ");
			depto = sc1.nextLine();

			System.out.println("Informe o bônus salarial do gerente: ");
			bonus = sc1.nextDouble();

			gerente.bonusSalarial(bonus);
			gerente.setDepartamento(depto);
			System.out.println("Nome: " + gerente.getNome());
			System.out.println("Depto: " + gerente.getDepartamento());
			System.out.println("Salário: " + (gerente.getSalario() - bonus));
			System.out.println("Salário + bônus: " + gerente.getSalario());
			
			sc1.close();

		} else {
			Funcionario funcionario = new Funcionario(nome, salario);
			
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Salário: " + funcionario.getSalario());
		}

		sc.close();
	}
}
