package core_java_Rays_opp;

public class Businessman2 implements Richman,SocialWorker{
private String name;
private String Address;
public Businessman2(String a,String b) {
	name=a;
	Address=b;
	System.out.println("name of Businessman-->"+a);
	System.out.println("Address of Businessman-->"+b);
	// TODO Auto-generated constructor stub
	
}
	
	public Businessman2() {
	// TODO Auto-generated constructor stub
}

	public String getName() {
	return name;
}

public String getAddress() {
	return Address;
}

	public void earnmony(int i) {
		int d=5000;
		System.out.println("earnmony-->"+d);
	
	}
	public void donation(int b) {
		int s=4000;
		System.out.println("Giving donation-->"+s);
	
	}
	public void party(int c) {
		int z=1000;
		System.out.println("get party-->"+z);
		
	}
	public void helptoother() {
		System.out.println("Helptoother");
		
	}

public static void main(String[] args) {
	Richman s=new Businessman2("ram","indore");
	
	s.earnmony(5000);
	s.donation(4000);
	s.party(1000);
SocialWorker d=new Businessman2();
	d.helptoother();
}

	
	}


