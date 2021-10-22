package core_java_Rays_ExceptionHandling;

public class TestException {
public static void main(String[] args) {
	try {
		String name="Sonu";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
	}catch(StringIndexOutOfBoundsException e) {
		System.err.println(e.getMessage());
		try {
			String s="rathor";
			System.out.println(s.length());
			System.out.println(s.charAt(8));
		} catch (Exception d) {
			System.err.println(d.getMessage());
		}finally {
			System.out.println("tata byy byy");
		}
	}
	}
	
}

