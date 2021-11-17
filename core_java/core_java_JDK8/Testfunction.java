package core_java_JDK8;

public class Testfunction {
public static void main(String[] args) {
	functionInterface sd=(a,b)->{
	//System.out.println(a+b);
	return a+b;
	
}; int c=sd.add(10, 20);
System.out.println(c);
	//HelloInt sd=new HelloInt() {
		
		//@Override
		//public void say() {
			// TODO Auto-generated method stub
			//System.out.println("Annotion function");
		//}
	//};sd.say();
}
}