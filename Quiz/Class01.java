package Class;

class Ccir{
	int length;
	int width;
	int height;
	double pi = 3.14159;
	double radius;
	String name;
	
	
	
	void cal_area() {
		System.out.println(length*width*2+length*height*2+width*height*2);
		
		
		System.out.println(4*pi*radius*radius*radius/3);
		
		
	}
	
	
	
}

// ≤y≈È≈Èøn 4/3*pi*r^3

public class Class01 {
	public static void main(String args[]) {
		
		Ccir cir1 = new Ccir();
		cir1.radius = 10;
		cir1.length = 4;
		cir1.width = 5;
		cir1.height = 6;
		cir1.cal_area();
		
		
	}

}
