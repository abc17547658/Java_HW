package Class;

class Ccir{
	int length;
	int width;
	int height;
	double pi = 3.14159;
	double radius;
	String name;
	
	void cal_area() {
		System.out.println("半徑 = "+radius);
		System.out.println(4*pi*radius*radius*radius/3);
		System.out.println("長 = "+length);
		System.out.println("寬 = "+width);
		System.out.println("高 = "+height);
		System.out.println("立方體表面積 = "+(length*width*2+length*height*2+width*height*2));
		
	}
}

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


//半徑 = 10.0
//4188.786666666667
//長 = 4
//寬 = 5
//高 = 6
//立方體表面積 = 148

