package core_java_Rays_opp;

public class Automobile2 {
public static void main(String[] args) {
	Automobile1 s =new Automobile1();
	s.setColor("brown");
	s.setSpeed(20);
	s.setMake("2021");
	s.Break(10);
    s.accelerator(40);
	System.out.println("initial speed--->" + s.getSpeed());
	
	int b=s.getSpeed();
	
	int c=b+10;
	int d=c+10;
	int e=d+10;
	
	
	if(gear()==1) {
		System.out.println("speed in 1st gear: "+b +"km/h");
		
	}
		else if (gear()==2) {
			System.out.println("speed in 2nd gear:"+c +"km/h");
		}
		else if (gear()==3) {
			System.out.println("speed is 3rd  gear:"+d+"km/h");
			
		}
		else if (gear()==4) {
			System.out.println("Speed is 4th gear:"+e+"km/h"); 
			}
		else {
			System.out.println("Speed is 0km/h ");
		}
			
		}

private static int gear() {
	// TODO Auto-generated method stub
	return 2 ;
}
	


}


