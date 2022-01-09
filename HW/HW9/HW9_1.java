package HW9;

class CRectangle{
	int width;
	int height;
	
	public CRectangle(int w,int h) {
		width=w;
		height=h;
		System.out.println("");
	}
	public CRectangle() {
		this(10,8);
		System.out.println("");
	}
	public void show() {
		System.out.println("width="+width);
		System.out.println("height="+height);
		
	}
	
}



public class HW9_1 {
	public static void main(String args[]) {
		CRectangle rec1=new CRectangle(5,2);
		rec1.show();
		CRectangle rec2=new CRectangle();
		rec2.show();
	}

}
