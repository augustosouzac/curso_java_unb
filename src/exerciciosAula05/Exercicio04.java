package exerciciosAula05;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Exercicio04 {
	public static boolean isValid(String s) {
		Map<Character, Character> parenthesesMap = new HashMap<>();
		parenthesesMap.put('(', ')');
		parenthesesMap.put('{', '}');
		parenthesesMap.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) {
			if (parenthesesMap.containsKey(c)) {
				stack.push(c);
			} else if (parenthesesMap.get(stack.pop()) != c) {
				return false;
			}
		}
		
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input1 = "(){}[]";
		String input2 = "(])]";
		String input3 = "{[]}(()(()({[()]})))()";
		
		System.out.println(input1);
		System.out.println(isValid(input1));
		System.out.println();
		
		System.out.println(input2);
		System.out.println(isValid(input2));
		System.out.println();
		
		System.out.println(input3);
		System.out.println(isValid(input3));
		System.out.println();

	}
}
