package core_java_Rays_opp_exrcise9;

public  class RectangleAbstract extends ShapeAbstract{
private int leng;
private int width;
public int getLeng() {
	return leng;
}
public void setLeng(int leng) {
	this.leng = leng;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}

	






@Override
public double area() {
	// TODO Auto-generated method stub
	return leng*width;
}
}
