package core_java_Collection;

import java.util.LinkedList;

public class List {
public static void main(String[] args) {
	LinkedList sd=new LinkedList();
	sd.add(12);
	sd.add(1.5);
	sd.add("Sonu");
	sd.add(89);
	sd.add(2, 4);
	sd.remove(3);
	//System.out.println(sd.get(3));
	System.out.println(sd);
	}
}
