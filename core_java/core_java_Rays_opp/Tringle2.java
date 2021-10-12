package core_java_Rays_opp;

public class Tringle2 extends Shape4 {
public int base ;
public int hight;

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

public int getHight() {
	return hight;
}

public void setHight(int hight) {
	this.hight = hight;
}
public double area() {
	return 0.5*base*hight;
}
public static void main(String[] args) {
	Tringle2 sd=new Tringle2();
	sd.setBase(5);
	sd.setHight(6);
sd.setColor("black");
sd.setBorderwidth(6);
System.out.println("area of tringle is --->"+sd.area());
System.out.println("area of tringle is --->"+sd.getBase());
System.out.println();
System.out.println("area of tringle is ---->"+sd.getHight());
System.out.println("color of tringle is ---->"+sd.getColor());
System.out.println("borderwidth of tringle is--->"+sd.getBorderwidth());

	
}
}

