package exerciciosAula05;

import java.util.LinkedList;

public class Exercicio05 {
	public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> mergedList = new LinkedList<>();
		
		while (!list1.isEmpty() && !list2.isEmpty()) {
			if (list1.getFirst() <= list2.getFirst()) {
				mergedList.add(list1.removeFirst());
			} else {
				mergedList.add(list2.removeFirst());
			}
		}
		
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		
		return mergedList;
	}

	public static void main(String[] args) {
		Exercicio05 merger = new Exercicio05();
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		LinkedList<Integer> merged = merger.mergeTwoLists(list1, list2);
		
		System.out.println(merged);
		

	}
}
