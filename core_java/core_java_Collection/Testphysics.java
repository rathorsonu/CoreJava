package core_java_Collection;

import java.util.Comparator;

public class Testphysics implements Comparator<Marksheet1> {

	@Override
	public int compare(Marksheet1 o1, Marksheet1 o2) {
		
		return o1.getPhysics()-o2.getPhysics();
	}

}
