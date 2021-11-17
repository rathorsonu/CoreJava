package core_java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
public static void main(String[] args) {
	Employee s= new Employee();
	s.setName("sonu");
	s.setSallary(50000);
	
	Employee s1= new Employee();
	s1.setName("Rajat");
	s1.setSallary(80000);
	
	Employee s2= new Employee();
	s2.setName("vipin");
	s2.setSallary(90000);
	
	ArrayList<Employee> d=new ArrayList<Employee>();
	d.add(s);
	d.add(s1);
	d.add(s2);
	Collections.sort(d,new Sallary());
	Iterator<Employee> sd=d.iterator();
	while (sd.hasNext()) {
		Employee x = (Employee) sd.next();
		System.out.println(x.getName()+" "+x.getSallary());
	}
	}
}
