package core_java_Collection;

import java.util.Comparator;

public class Sallary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSallary()-o2.getSallary();
	}


	}


