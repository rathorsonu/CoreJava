package core_java;

public class Parse {
public static void main(String[] args) {
	String s1="10";
	String s2="20";
	String s3="5.5";
	String s4="6.24f";
	String s5="sonu Rathor";
	int a =Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	double c=Double.parseDouble(s3);
	float e=Float.parseFloat(s4);
	
	System.out.println(a+b);
	System.out.println(c);
	System.out.println(e);
	
}
}
