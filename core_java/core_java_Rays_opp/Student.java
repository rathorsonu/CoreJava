package core_java_Rays_opp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student extends Person3 {
public String rollNo;
public int marks;
public Student(String s) {
	rollNo=s;
}
public Student(int f) {
	marks=f;
	// TODO Auto-generated constructor stub
	
}
public String getRollNo() {
	return rollNo;
}
public int getMarks() {
	return marks;
}
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
	Student cv=new Student("16111777");
	Student d=new Student(80);
	
cv.setName("Rahul");
cv.setAddress("indore");
cv.setDateofbirth(sd.parse("8/12/1997"));
System.out.println("Student Roll_No is ---->"+cv.getRollNo());
System.out.println("Student Name  is ---->"+cv.getName());
System.out.println("Student Address is ---->"+cv.getAddress());
System.out.println("Student marks is ---->"+d.getMarks());
//System.out.println("Student name is ---->"+cv.getRollNo());

}
}
