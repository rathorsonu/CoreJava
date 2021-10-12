package core_java_Rays_opp;

//import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class Person2 {
public static void main(String[] args) throws ParseException {
	//Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//Date d1=sdf.parse("8/12/1997");
	Person1 sl=new Person1();
	sl.setName("sonu");
	sl.setDob( sdf.parse("8/12/1997"));
	sl.setAddress("indore");
	System.out.println("Name  "+sl.getName());
	System.out.println("Date "+ sdf.format(sl.getDob()));
	System.out.println("Adress "+sl.getAddress());
	
}
}
