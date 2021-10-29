package core_java_Collection;

import java.util.Stack;

public class CollectionTestStack {

	public static void main(String[] args) {
		Stack s= new Stack ();
		s.push("ram");
		s.push("shyam");
		s.push("sonu");
		s.push("rajat");
		s.push("vinay");
		s.push("harsh");
		//s.pop();
		//s.pop();
		s.pop();
		
		s.peek();
		s.pop();
		s.pop();
		
		System.out.println(s);

	}

}
