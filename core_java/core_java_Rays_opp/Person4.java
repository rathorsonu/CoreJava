package core_java_Rays_opp;

public class Person4 {
	protected String fname;
	protected String lname;
	protected String address;
	public Person4() {}
	
	public Person4(String fn,String ln) {
		fname=fn;
		lname=ln;
		System.out.println("2 parameter");
			}
	public Person4(String fn,String ln,String add) {
	this(fn, ln);
	address=add;
	System.out.println("3 parameter");
	}
	
	
	public static void main(String[] args) {
		Person4 d=new Person4("sonu" , "rathor", "indore");
		System.out.println(d.fname);
		System.out.println(d.lname);
	System.out.println(d.address);
		
	}
}
