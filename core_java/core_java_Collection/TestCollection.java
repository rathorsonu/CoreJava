package core_java_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection x = new ArrayList();
		x.add("Bura mat deko");
		x.add("Bura mat deko");
		x.add("Bura mat deko");
		System.out.println("Length of Collection-->"+x.size());
		System.out.println(x);
		for (Object s : x) {
			System.out.println(s);
				
			}
		}
	}

