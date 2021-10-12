package core_java_Rays_opp;

public class Shape1 {
private String color;
private int borderwidth;
private int radius;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getBorderwidth() {
	return borderwidth;
}
public void setBorderwidth(int borderwidth) {
	this.borderwidth = borderwidth;
}
public double area() {
	return 3.14*radius*radius;
	//System.out.println("Area of circle"+arr);
}

}
