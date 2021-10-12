package core_java_Rays_opp;

public class Constructor {
	private String color;
	private int borderwidth;
	
public Constructor() {
	System.out.println("Constructor is default");
}
public String getColor() {
	return color;
}
public int getBorderwidth() {
	return borderwidth;
}
public Constructor(String a ,int n) {
	color=a;
	borderwidth=n;

}

}

