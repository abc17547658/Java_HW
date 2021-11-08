package HomeWork;


class CSphere{
	
	private int x;
	private int y;
	private int z;
	private int radius;
	
	double pi;
	
	
	void setLocation() {
		x = 3;
		y = 4;
		z = 5;
	}
	
	void setRadius(){
		radius = 1;
	}
	
	void surfaceArea() {
		System.out.println(pi*radius*radius);
	}
	
	void volume() {
		System.out.println(3*pi*radius*radius/4);
	}
	
	void showCenter() {
		System.out.println();
	}
	
}


public class HW8_16 {
	public static void main(String args[]) {
		
		CSphere pi;
		
		CSphere CS = new CSphere();
		
		CS.pi = 3.14;
		
		CS.setRadius();
		CS.setLocation();
		
		CS.surfaceArea();
		CS.volume();
		CS.showCenter();
		
		
	}
	
}
