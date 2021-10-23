package core_java_Rays_ExceptionHandling;

public class Test {
	public static void main(String[] args) {
		try {
			String name ="sonu";
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		
		} catch (Exception e) {
			String name ="rathor";
			System.out.println(name.length());
			System.out.println(name.charAt(6));
			System.out.println("tata byyy");
		}
		}
		
}
	
	

	
