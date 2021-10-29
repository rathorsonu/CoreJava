package core_java_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionTestqueue {

	public static void main(String[] args) {
	
		PriorityQueue p = new PriorityQueue ();
		p.add(12);
		p.add(15);
		p.add(25);
		p.add(19);
		p.add(14);
		p.add(16);
		
		p.remove(12);
		//p.peek();
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.peek());
	//	System.out.println(p.element());
		
        LinkedList l= new LinkedList();
        l.add(12);
        l.add(14);
        l.add(16);
        l.add(2);
        l.add(12);
        l.add(1);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

	}

}
