package core_java_Rays_ExceptionHandling;

public class ExeptionPropagation {

 public static void main(String[] args) throws LoginException {
	authenticate ("sonu");
	System.out.println("Invalid Id/password");
}

private static void authenticate(String login) throws LoginException {
	if(!"rajat".equals(login)) {
		LoginException sd=new LoginException();
		throw sd;
	
}
 

	
}
}
