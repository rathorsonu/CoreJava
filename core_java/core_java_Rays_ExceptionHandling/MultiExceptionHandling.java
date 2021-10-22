package core_java_Rays_ExceptionHandling;

public class MultiExceptionHandling {
public static void main(String[] args) {
	try {
	String name= null;
	System.out.println("length of name"+name.length());
	System.out.println(name.charAt(5));
}catch(StringIndexOutOfBoundsException e) {
	System.out.println("String not available");
}catch(RuntimeException e) {
	System.out.println("String Available nhi ho skti");
}finally{
	System.out.println("padta hai");
}
}
}