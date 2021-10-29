package core_java_Collection;

import java.util.Comparator;

public class TestComparator implements Comparator<Marksheet1> {

	@Override
	public int compare(Marksheet1 o1, Marksheet1 o2) {
		if (o1.getFirstName()!=o2.getFirstName()) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		} else {
         return o1.getLastName().compareTo(o2.getLastName());
		}
	
		

	
	

	
}
}
