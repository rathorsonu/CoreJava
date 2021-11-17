package core_java_Rays_opp_exrcise9;

public abstract class ShapeAbstract {
	
	public abstract double area();

	public static void main(String[] args) {
			ShapeAbstract[] s = new ShapeAbstract[3];
			CircleAbstract sd=new CircleAbstract();
		System.out.println("Area of circle--->"+sd.area());
				
			RectangleAbstract sr=new RectangleAbstract();
			System.out.println("Area of Rectangle--->"+sr.area());
			
			TringleAbstaract sw=new TringleAbstaract();
			System.out.println("Area of Tringle--->"+sw.area());
		s[0] =  sd ;
		s[1] = sr;
		s[2] = sw;
		
		double totalArea = CalcArea(s);
		System.out.println(totalArea);
	}

	public static double CalcArea(ShapeAbstract[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}


	}

	
	

		

