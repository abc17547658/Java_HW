
import java.util.Scanner;

public class JPA01_10 {
	public static void main(String args[]) {
		double totalarea;
		System.out.printf("��έ��n��:%f \n",circle(5));    //�ꭱ�n
		System.out.printf("�T���έ��n��:%f \n",triangle(10,5));	 //�T���έ��n
		System.out.printf("��έ��n��:%f \n",rectangle(5,10));	 //��έ��n
		totalarea = circle(5)+triangle(10,5)+rectangle(5,10);
		System.out.printf("���ϧέ��n��:%f \n",totalarea);	 //�`���n
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
