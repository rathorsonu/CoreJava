package core_java_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
public static void main(String[] args) {
	ArrayList f=new ArrayList();
	f.add("sonu");
	f.add("Rathor");
	f.add("Rajat");
	f.add("soni");
	f.add("vipin");
	Iterator g=f.iterator();
while (g.hasNext()) {
		Object s = (Object) g.next();
		System.out.println(s);
	//for (Object s : f) {
		//System.out.println(s);
	}
	}
}

