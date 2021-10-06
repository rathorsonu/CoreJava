package core_java;

public class StringB {
	public static void main(String[] args) {
		//java.lang.String
		StringBuffer s1= new StringBuffer("sonu");
		s1.append("kumar rathor");
		System.out.println("length:"+s1.length());
		System.out.println("capicity"+s1.capacity());
		System.out.println("char at"+s1.charAt(2));
		System.out.println("index of"+s1.indexOf("rathor"));
		System.out.println("replase"+s1.replace(0, 5, "rat"));
	}

}
