package core_java_Rays_opp;

public class Shape2 extends Shapee  {
	public int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
	this.radius = radius;
	}
	public  double area() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Shape2 sdr=new Shape2();
		sdr.setRadius(9);
	    sdr.setBorderwidth(9);
	    sdr.setColor("black");
	    
		System.out.println(sdr.area());
		System.out.println("Borderwidth "+sdr.getBorderwidth());
		System.out.println("color "+sdr.getColor());
		
	}
}
