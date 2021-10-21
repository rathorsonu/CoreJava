package core_java_Rays_opp;

public class Circle2 extends Shape5 {
	
	private int radius;

	public Circle2(int w) {
		radius=w;
		
	}

	
	public double area() {
		double s = 3.14 * radius * radius;
		System.out.println("area of circle is " + s);
		return s;
	}


}
