package core_java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet1 {
	public static void main(String[] args) {
		Marksheet1 m1 = new Marksheet1();
		m1.setRollNo("56");
		m1.setFirstName("sonu");
		m1.setLastName("Rathor");
		m1.setPhysics(99);
		m1.setChemistry(98);
		m1.setMaths(77);

		Marksheet1 m2 = new Marksheet1();
		m2.setRollNo("75");
		m2.setFirstName("Rajat");
		m2.setLastName("Soni");
		m2.setPhysics(75);
		m2.setChemistry(63);
		m2.setMaths(89);

		Marksheet1 m3 = new Marksheet1();
		m3.setRollNo("57");
		m3.setFirstName("Vipin");
		m3.setLastName("Gupta");
		m3.setPhysics(96);
		m3.setChemistry(98);
		m3.setMaths(76);

		Marksheet1 m4 = new Marksheet1();
		m4.setRollNo("63");
		m4.setFirstName("Harsh");
		m4.setLastName("Upadhyay");
		m4.setPhysics(96);
		m4.setChemistry(94);
		m4.setMaths(98);

		Marksheet1 m5 = new Marksheet1();
		m5.setRollNo("62");
		m5.setFirstName("Akansha");
		m5.setLastName("Rawal");
		m5.setPhysics(93);
		m5.setChemistry(98);
		m5.setMaths(74);

		Marksheet1 m6 = new Marksheet1();
		m6.setRollNo("95");
		m6.setFirstName("Harsh");
		m6.setLastName("Rathor");
		m6.setPhysics(93);
		m6.setChemistry(94);
		m6.setMaths(46);

		Marksheet1 m7 = new Marksheet1();
		m7.setRollNo("84");
		m7.setFirstName("Pawan");
		m7.setLastName("Rathor");
		m7.setPhysics(99);
		m7.setChemistry(98);
		m7.setMaths(77);
		ArrayList<Marksheet1> sd = new ArrayList<Marksheet1>();
		sd.add(m1);
		sd.add(m2);
		sd.add(m3);
		sd.add(m4);
		sd.add(m5);
		sd.add(m6);
		sd.add(m7);
//Testphysics v=new Testphysics();
//Collections.sort(sd,v);
		Collections.sort(sd,new Testphysics());
		
		Iterator<Marksheet1> l = sd.iterator();
		while (l.hasNext()) {
			Marksheet1 s = (Marksheet1) l.next();
			System.out.println(s.getRollNo() + " " + s.getFirstName() + " " + s.getLastName() + " " + s.getPhysics()
					+ " " + s.getChemistry() + " " + s.getMaths());
		}
	}
}
