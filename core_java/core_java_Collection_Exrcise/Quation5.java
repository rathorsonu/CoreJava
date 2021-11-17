package core_java_Collection_Exrcise;

import java.util.ArrayList;
import java.util.HashSet;

public class Quation5 {
public static void main(String[] args) {
	int g;
	double s1=0;
	double s2=0;
	
	ArrayList  h = new ArrayList();
	for (int i = 0; i < 100000; i++) {
		h.add(i);
		s1=System.currentTimeMillis();
		
	}
	HashSet d=new HashSet();
	h.addAll(d);
	for (int i = 0; i <=50; i++) {
		g=(int) (Math.random()*h.size());
		System.out.println(i+":"+g);
		s2=System.currentTimeMillis();
	}
System.out.println(s1+ "-->"+"time");
System.out.println(s2+"-->"+"time");
}
}
