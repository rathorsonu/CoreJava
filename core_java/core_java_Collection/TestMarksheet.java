package core_java_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet{


public static void main(String[] args) {		
	ArrayList sd= new ArrayList();
	sd.add(new Marksheet("A161111777", "sonu", 99));
	sd.add(new Marksheet("A161111775", "rajat", 66));
	sd.add(new Marksheet("A161111776", "vipin", 93));
	sd.add(new Marksheet("A161111774", "Aditya", 95));
	Collections.sort(sd);
	for (Object s: sd) {
		System.out.println(s);
	}
}
}