package core_java_Rays_opp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Doctor  extends Person3{
	public String  registrationNo;
	public Doctor(String d) {
		 registrationNo=d;
		 
		// TODO Auto-generated constructor stub
		
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		 Doctor a=new  Doctor(" Certificate_no 15-17898");
		 a.setName("Neeraj Dhakad");
		 a.setAddress("Sandhara");
		 a.setDateofbirth(sd.parse("1/12/1997"));
		 System.out.println("Doctor registrationNo is--->"+a.getRegistrationNo());
		 System.out.println("Doctor  Name is--->"+a.getName());
		 System.out.println("Doctor Address is--->"+a.getAddress());
		 System.out.println("Doctor Date of birth is--->"+sd.format(a.getDateofbirth()) );
		 
	}
	}


