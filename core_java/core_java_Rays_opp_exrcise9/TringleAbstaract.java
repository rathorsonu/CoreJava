package core_java_Rays_opp_exrcise9;

public class TringleAbstaract extends ShapeAbstract {
	private int hight;
	private int base;

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}



	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*hight;
	}
}
