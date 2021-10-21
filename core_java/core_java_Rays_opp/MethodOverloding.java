package core_java_Rays_opp;

public class MethodOverloding {
public void m1(int a,int b) {
	System.out.println(a+b + "first");
	
}

public void m1(int a,int b,int c) {
	System.out.println(a+b+c + "second");
	
}
public void m1(int a,int b,int c,float d) {
	System.out.println(a+b+c+d + "third");
	
}

public static void main(String[] args) {
	MethodOverloding m=new MethodOverloding();
	m.m1(5, 9,3,4f);
}
}
