package aula5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

public class ExemploComparators {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Maria"));
		pessoas.add(new Pessoa("João"));
		pessoas.add(new Pessoa("Ana"));
		pessoas.add(new Pessoa("Pedro"));

		Comparator<Pessoa> comparador = new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {

				return o1.getNome().compareTo(o2.getNome());
			}
		};

		Collections.sort(pessoas, comparador);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
