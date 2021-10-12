package core_java_Rays_opp;

public class Automobile1 {
private String color;
private int speed;
private String make;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public void Break (double sd ) {
	if(speed>=sd) {
		System.out.println("Break ----> "+(speed -10));
	}
}
	public void accelerator (double sdr ) {
		if(speed<=sdr) {
			System.out.println("Accelerate---->"+(speed + 30));
		}
}
}


