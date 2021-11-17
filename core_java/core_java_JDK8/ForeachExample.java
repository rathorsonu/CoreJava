package core_java_JDK8;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {
public static void main(String[] args) {
	List<String>l1=new ArrayList<String>() ;
	l1.add("sonu");
	l1.add("rajat");
	l1.add("harh");
	l1.add("vipin");
	l1.forEach(l2->System.out.println(l2));
}
}
