package exerciciosAula06;

public class Pilha<T> {
	private T[] elementos;
	private int topo;

	@SuppressWarnings("unchecked")
	public Pilha(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		topo = -1;
	}
	
	public void push(T elemento) {
		if (isFull()) {
			throw new IllegalStateException("A sua pilha está cheia.");
		}
		elementos[++topo] = elemento;
	}
	
	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("A sua pilha está vazia.");
		}
		T elemento = elementos[topo];
		elementos[topo--] = null;
		return elemento;
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("A pilha está vazia.");
		}
		return elementos[topo];
	}
	
	public boolean isEmpty() {
		return topo == -1;
	}
	
	public boolean isFull() {
		return topo == elementos.length - 1;
	}
	
	public int size() {
		return topo + 1;
	}
	
	public int capacidade() {
		return elementos.length;
	}
}
