package exerciciosAula05;

import java.util.HashMap;
import java.util.Map;

public class Exercicio03 {
	public String jogadorMaiorScore(Map<String, Integer> scores) {
		int maxScore = Integer.MIN_VALUE;
		String jogadorComMaiorScore = null;
		
		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			String jogador = entry.getKey();
			int score = entry.getValue();
			
			if (score > maxScore) {
				maxScore = score;
				jogadorComMaiorScore = jogador;
			}
		}

		return jogadorComMaiorScore;
	}

	public static void main(String[] args) {
		Exercicio03 j = new Exercicio03();
		Map<String, Integer> list = new HashMap<>();
		
		list.put("Augusto", 2);
		list.put("Vasco", 50);
		list.put("Souza", 1);
		list.put("Cavalcante", 3);		
		
		System.out.println(j.jogadorMaiorScore(list));

	}
}
