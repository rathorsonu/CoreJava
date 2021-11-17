package core_java_Collection_Exrcise;

import java.util.Stack;

public class TestAtoZ {
public static void main(String[] args) {
	Stack sd=new Stack();
	Stack sr=new Stack();
	
	sd.push("a");
	sd.push("b");
	sd.push("c");
	sd.push("d");
	sd.push("e");
	sd.push("f");
	sd.push("g");
	sd.push("h");
	sd.push("i");
	sd.push("j");
	sd.push("k");
	sd.push("l");
	sd.push("m");
	sd.push("n");

	sd.push("o");
	sd.push("p");
	sd.push("q");
	sd.push("r");
	sd.push("s");
	sd.push("t");
	sd.push("u");
	sd.push("v");
	sd.push("w");
	sd.push("x");
	sd.push("y");
	sd.push("z");
	
for (int i = 0; i < args.length; i++) {
	sd.push((i));
}
System.out.println(sd);
System.out.println(sd.size());
	for (int i=sd.size(); i > args.length; i--) {
		sr.push(sd.pop());
	}
System.out.println(sr);
	for (int i = sr.size(); i > args.length; i--) {
		sr.pop();
	}
		System.out.println(sr);
		
	}


		
}
	
	


