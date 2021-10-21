package core_java_Rays_opp;

public class Empolyee extends Person4{
	
private String designation;

public Empolyee() {
	
}
public Empolyee(String fn,String ln,String des) {
super(fn, ln);
designation=des;
System.out.println("3 prams constructor");

}
public static void main(String[] args) {
	Empolyee s= new Empolyee("sonu","rathor","devloper");
	System.out.println(s.fname);
	System.out.println(s.lname);
	System.out.println(s.designation);
	
	
}
}
