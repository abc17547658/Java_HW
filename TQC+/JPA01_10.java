
import java.util.Scanner;

public class JPA01_10 {
	public static void main(String args[]) {
		double totalarea;
		System.out.printf("圓形面積為:%f \n",circle(5));    //圓面積
		System.out.printf("三角形面積為:%f \n",triangle(10,5));	 //三角形面積
		System.out.printf("方形面積為:%f \n",rectangle(5,10));	 //方形面積
		totalarea = circle(5)+triangle(10,5)+rectangle(5,10);
		System.out.printf("此圖形面積為:%f \n",totalarea);	 //總面積
	}
	
	public static double circle(int r) {
		double pi = 3.1415926;
		return pi*Math.pow(r, 2);
		
	}
	
	public static double triangle(int b,int h) {
		return b*h/2;
		
	}
	
	public static double rectangle(int l,int w) {
		return l*w;
		
	}
}
