package core_java_Rays_opp;

public class Ractangle2  extends Shape4 {
public int length;
public int width;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int area() {
	return length*width;
}
                  

public static void main(String[] args) {
	Ractangle2 v=new Ractangle2();
	v.setLength(5);
	v.setWidth(6);
	v.setColor("blue");
	v.setBorderwidth(9);
	System.out.println("Area of Ractangle is ---->"+v.area());
	System.out.println("Length of Ractangle is ---->"+v.getLength());
	System.out.println("Width of Ractangle is ---->"+v.getWidth());
	System.out.println("color  of Ractangle is ---->"+v.getColor());
	System.out.println("Borderwidth of Ractangle is ---->"+v.getBorderwidth());
}
}
