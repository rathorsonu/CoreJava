package core_java_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionTestHashmap {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		h.put('a', "red");
		h.put('b', "green");
		h.put('c', "yellow");
		h.put('d', "orange");
		h.put('e', "blue");
		
	//System.out.print(h.keySet());	
	//System.out.println(h.values());
	//System.out.println(h.get(2));
	//System.out.println(h.remove(3));
	System.out.println(h.entrySet());
	//System.out.println(h.containsValue("orange"));
	//System.out.println(h.containsKey('c'));
		}
		
		

	}


