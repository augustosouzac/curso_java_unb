package exerciciosAula05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio01 {
	public List<Integer> findDuplicados(List<Integer> numeros) {
		List<Integer> duplicados = new ArrayList<>();
		Set<Integer> numerosUnicos = new HashSet<>();

		for (Integer numero : numeros) {
			if (numerosUnicos.contains(numero)) {
				duplicados.add(numero);
			} else {
				numerosUnicos.add(numero);
			}
		}

		return duplicados;
	}

	public static void main(String[] args) {
		Exercicio01 d = new Exercicio01();
		List<Integer> n = new ArrayList<>();

		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(4);
		n.add(1);
		List<Integer> resp = d.findDuplicados(n);
		System.out.println(Arrays.toString(resp.toArray()));

	}
}
