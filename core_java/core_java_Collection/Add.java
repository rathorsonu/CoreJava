package core_java_Collection;

import java.util.ArrayList;
import java.util.List;

public class Add {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(45);
		a.add(0);
		a.add(5);
		a.add(4.5f);
		a.add(4);
		a.add("rathor");
		
		// System.out.println(a.size());
//a.remove(5);
//a.removeAll(a);
		// System.out.println(a.contains(5));
//System.out.println(a.isEmpty());
		ArrayList b = new ArrayList();
		b.add(5);
		b.add(4);
		b.add("sk");
		System.out.println(b.retainAll(a));
		System.out.println(b);
		// b.add(4);
		// b.add(4.6f);
		// System.out.println(b.containsAll(a));
//b.removeAll(b);
		// for (Object o : b) {
		// System.out.println(o);
	}

}
