package core_java_Rays_ExceptionHandling;

public class TryCatchTest {
	public static void main(String[] args) {
	try {
		String name="Sonu";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
	
		try {
			String s="rathor";
			System.out.println(s.length());
			System.out.println(s.charAt(8));
		
		} catch (StringIndexOutOfBoundsException e) {
		//System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}catch(Exception d) {
		System.err.println(d.getMessage());
	}
	}
	}