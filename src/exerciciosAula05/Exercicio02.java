package exerciciosAula05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio02 {
	public Map<String, Integer> contaOcorrencias(List<String> strings) {
		Map<String, Integer> ocorrencias = new HashMap<>();

		for (String str : strings) {
			Integer contador = ocorrencias.get(str);
			if (contador != null) {
				contador++;
			} else {
				contador = 1;
			}
			ocorrencias.put(str, contador);
		}

		return ocorrencias;
	}

	public static void main(String[] args) {
		Exercicio02 o = new Exercicio02();
		List<String> list = new ArrayList<>();
		
		list.add("Augusto");
		list.add("Souza");
		list.add("Cavalcante");
		list.add("Cavalcante");
		list.add("Cavalcante");
		
		System.out.println(o.contaOcorrencias(list));

	}
}
