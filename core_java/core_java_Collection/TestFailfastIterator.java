package core_java_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailfastIterator {
public static void main(String[] args) {
	ArrayList sd=new ArrayList();
	sd.add(12);
	sd.add(12);
	sd.add(12);
	sd.add(12);
	sd.add(12);
	Iterator a=sd.iterator();
	sd.add(12);
	while (a.hasNext()) {
		Object s= (Object) a.next();
		System.out.println(s);
		
	}
}
}
