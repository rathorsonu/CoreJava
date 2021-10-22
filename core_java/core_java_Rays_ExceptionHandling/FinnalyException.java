package core_java_Rays_ExceptionHandling;

public class FinnalyException {
public static void main(String[] args) {
	try {
		String name="Sonu";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
	}catch(StringIndexOutOfBoundsException |NullPointerException|ArithmeticException e) {
		System.err.println(e.getMessage());
		System.exit(500);
}finally {
	
	System.out.println();
}
}
}