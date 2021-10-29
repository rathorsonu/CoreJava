package core_java_Collection;

import java.util.ArrayDeque;

public class CollectionTestDeque {

	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		a.add(2);
		a.add("sonu");
		a.addFirst(1);
		a.addLast('e');
		
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		
		
		System.out.println(a);
System.out.println(a.getFirst());
System.out.println(a.getLast());

	}

}
