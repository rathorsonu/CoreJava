package core_java;

public class UnaryOprators {
public static void main(String[] args) {
	int i=2;
	//System.out.println(i++ + i++ + i++ + i++ +i++);
	//System.out.println(i++ + ++i + i++ + i++ + i++ +i++);
	               //  System.out.println(i++ + ++i +i++ + i++ + i++ );
	          // System.out.println(i++ + ++i + i++ + i++ + i++ + ++i); 
	                              //2   4      4     5     6   8
	           System.out.println(i++ + i++ + ++i + ++i +i++ + i++);
	                             // 2  3       5   6     6     7
	               
}                   
}
