package core_java_Rays_opp;

public class Shapee {
	
	public String color;
	public int borderwidth;
	
	public Shapee() {}
	
	public Shapee(String a, int b) {
		this.color=a;
		this.borderwidth=b; 
	}
	
	
	
	public String getColor() {
		return color;
	}
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public static void main(String[] args) {
		Shapee s=new Shapee("red", 8);
		System.out.println(s.borderwidth);
		System.out.println(s.color);
	}
}
