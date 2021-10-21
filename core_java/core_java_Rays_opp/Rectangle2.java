package core_java_Rays_opp;

public class Rectangle2 extends Shape5 {
private int leng;
private int wid;

public Rectangle2(int l,int w) {
	leng=l;
	wid=w;
	
}
public Rectangle2() {
	// TODO Auto-generated constructor stub
}
public int getLeng() {
	return leng;
}
public int getWid() {
	return wid;
}
public double area() {
	int d=leng*wid;
	System.out.println("area of Rectangle is "+d);
	return d;
}

}
