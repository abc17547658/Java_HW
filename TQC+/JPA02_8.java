
import java.util.Scanner;

public class JPA02_8 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
		test();
		
	}
	static void test() {
		int grade;
		System.out.print("Input:");
		grade = keyboard.nextInt();
		String str = "Your grade is ";
		if(grade>=90) {
			System.out.println(str+"A");
		}
		else if(grade>=80) {
			System.out.println(str+"B");
		}
		else if(grade>=70) {
			System.out.println(str+"C");
		}
		else if(grade>=60) {
			System.out.println(str+"D");
		}
		else {
			System.out.println(str+"F");
		}
	}
	
}
