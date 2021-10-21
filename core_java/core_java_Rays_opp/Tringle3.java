package core_java_Rays_opp;

public class Tringle3 extends Shape5 {
private int base;
private int hight;
public Tringle3(int b,int h) {
	base=b;
	hight=h;
	
	
}
public Tringle3() {
	// TODO Auto-generated constructor stub
}
public int getBase() {
	return base;
}
public int getHight() {
	return hight;
}
public double area () {
double s=0.5*base*hight;
	System.out.println("area of Tringlen is "+s);
	return s;
}

}
