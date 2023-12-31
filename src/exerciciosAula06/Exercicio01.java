package exerciciosAula06;

public class Exercicio01 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5);

		System.out.println("Pilha está vazia? " + pilha.isEmpty());
		
		try {
			pilha.push(10);
			pilha.push(20);
			pilha.push(30);
			pilha.push(40);
			pilha.push(50);
			pilha.push(60);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("Elemento no topo da pilha: " + pilha.peek());
		
		System.out.println("Removendo elementos da pilha: ");
		while (!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
		
		System.out.println("Pilha está vazia? " + pilha.isEmpty());
	}
}
