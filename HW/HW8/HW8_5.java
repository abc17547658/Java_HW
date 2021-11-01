package HomeWork;

class CBox{
	int length;
	int width;
	int height;
	int volume;
	int surfaceArea;
	int showData;
	
	void volume() {
		 System.out.print(length*width*height);
	};
	
	void surfaceArea() {
		System.out.print(length*width*2 + length*height*2 + width*height*2);
	}
	
	void showData() {
		System.out.print(length);
		System.out.print(width);
		System.out.print(height);
		System.out.print(volume);
		System.out.print(surfaceArea);
		
	}
	
}

public class HW8_5 {
	public static void main(String args[]) {
		CBox box= new CBox();
		
		box.length = 1;
		box.width = 1;
		box.height = 1;
		
		box.showData();
		
		
	}

}
