package core_java_Rays_opp;

public class TestPoly {
//private static final Object[] s = null;
public static void main(String[] args) {
Shape5[] s=new Shape5[3];
 s[0]  = new  Circle2(5);
 s[1]=new Rectangle2(2,5);
 s[2]=new Tringle3(4,5);
 double totalArea =CalcArea(s);
 System.out.println(totalArea);
}
public static double CalcArea(Shape5[]s) {
	double totalArea=0;
 for (int i = 0; i < s.length; i++) {
		totalArea =totalArea+s[i].area();
	}
 return totalArea;
}
}