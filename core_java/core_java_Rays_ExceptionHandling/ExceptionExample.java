package core_java_Rays_ExceptionHandling;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			//int a=15,b=0;
			 double div=15/0;

		} catch (ArithmeticException e){
			
			e.printStackTrace();
		}

	}

}