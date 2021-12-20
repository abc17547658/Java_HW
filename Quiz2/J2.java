package ch11;

interface iShape03{
	public void show();
	public int area();
}

interface iColor{
	public void showColor();	
}

class CWin {
	protected int width;
	protected int height;
	protected String color;
	protected int area;
	
	public CWin(int w,int h,String str){
		width=w;
		height=h;
		color="Green";
	}
	
	public void show() {
		System.out.println("color="+color);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+height*width);
		
	}
	
//	public int area(){
//		area = width*height;
//	}
	
	public void showColor(){

	}

}



public class J2 {
	public static void main(String args[]) {
		CWin win = new CWin(5,7,"Green");
		win.show();
	}
}
