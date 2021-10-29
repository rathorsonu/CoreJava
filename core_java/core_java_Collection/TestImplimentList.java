package core_java_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class TestImplimentList {
	public static void main(String[] args) {
		ArrayList d = new ArrayList();
		d.add("one");
		d.add("two");
		d.add("three");
		d.add("four");

		//int x = d.size();
		for (Object e : d) {
			System.out.println(d+ ":" + e.toString());
			// Integer s=new Integer(5);
			// d.add(s);
			// Integer i=(Integer) d.get(4);
			// System.out.println(i);
		}

		Vector s1 = new Vector();
		s1.add(55);
		s1.add(5);
		s1.add(12);
		s1.add(10);
		
		Integer h = new Integer(6);
		s1.add(h);
		Integer b = (Integer) s1.get(4);
		System.out.println(b);
System.out.println(s1);
	}
}
