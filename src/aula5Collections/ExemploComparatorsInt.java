package aula5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}

public class ExemploComparatorsInt {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Maria", 25));
		pessoas.add(new Pessoa("João", 30));
		pessoas.add(new Pessoa("Ana", 20));
		pessoas.add(new Pessoa("Pedro", 35));

		Comparator<Pessoa> comparador = new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				// TODO Auto-generated method stub
				return o1.getIdade() - o2.getIdade();
			}
		};

		Collections.sort(pessoas, comparador);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
		}
	}
}
