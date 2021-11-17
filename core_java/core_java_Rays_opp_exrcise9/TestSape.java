package core_java_Rays_opp_exrcise9;



public  class TestSape extends ShapeAbstract {
	private String color;
	private int borderwidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public static void main(String[] args) {
		TestSape s=new TestSape();
		
		s.setColor("red");
		s.setBorderwidth(5);
		System.out.println("color--->"+s.getColor());
		System.out.println("borderwidth--->"+s.getBorderwidth());
	
		RectangleAbstract d=new RectangleAbstract();
		d.setLeng(6);
		d.setWidth(5);
		System.out.println("length"+d.getLeng());
		System.out.println("width"+d.getWidth());
	
		d.area();
		CircleAbstract f=new CircleAbstract();
		f.setRadius(4);
		System.out.println("radius"+f.getRadius());
		f.area();
		TringleAbstaract k=new TringleAbstaract();
		k.setBase(4);
		k.setHight(6);
		System.out.println("Base"+k.getBase());
		System.out.println("hight"+k.getHight());
	
		k.area();
		
		
		
			
			
		}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


	


