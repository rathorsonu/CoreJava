package core_java_Rays_opp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Businessman  extends Person3 implements Richman{
public double income;
public Businessman(double a) {
	income=a;
	
}
public double getIncome() {
	return income;

}
public static void main(String[] args) throws ParseException {
	//Businessman s= new Businessman( 50000.5);
	SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
	Businessman s= new Businessman( 50000.5);
	s.setName("sonu rathor");
	s.setAddress("indore");
	s.setDateofbirth(sd.parse("8/12/1997"));
	
	System.out.println("Name of businessman is "+s.getName());
	System.out.println("Name of businessman is "+s.getAddress());
	System.out.println("Name of businessman is "+sd.format(s.getDateofbirth()));
System.out.println(s.getIncome());

}
}
