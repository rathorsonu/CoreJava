package core_java_Rays_opp;

public class Circle extends Shape4 {
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area( ) {
	return  Math.PI*radius*radius;
	//System.out.println();
}

public static void main(String[] args) {
	Circle d= new Circle();	
	d.setRadius(5);
	d.setColor("red");
	d.setBorderwidth(5);
	System.out.println("area of cicle is --->"+d.area());

	System.out.println("Radius of circle is--->"+d.getRadius());
	System.out.println();
	System.out.println("Color of circle is ---->"+d.getColor());
	System.out.println("Borderwidth of circle is----> "+d.getBorderwidth());

}
}
