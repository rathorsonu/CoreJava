package core_java_Rays_opp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
private String name;
private Date dob;
private String address;
public void setName(String name) {
	this.name = name;
}

public void setAddress(String address) {
	this.address = address;
}
	public void setDob(Date dob) {
		this.dob = dob;
	}


public String getAddress() {
	return address;
}
public String getName() {
	return name;
}
public Date getDob() {
	return dob;
}
public static void main(String[] args) throws ParseException {
	Date d=new Date();
	SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");
	
Person s2 =new Person();
s2.setName("sonu");
s2.setDob(sdf.parse("08/12/1997"));
s2.setAddress("rajabag colony indore");
System.out.println("name"+s2.getName());
System.out.println("date"+s2.getDob());
System.out.println("adress"+s2.getAddress());
}


	
}


	





