
import java.util.Scanner;

public class JPA02_6 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		test();
		test();
		test();
	}
	
	static void test() {
		int chinese, english, math, avg;
		System.out.print("Input Chinese score:");
		chinese = keyboard.nextInt();
		System.out.print("Input English score:");
		english = keyboard.nextInt();
		System.out.print("Input math score:");
		math = keyboard.nextInt();
		
		if(chinese < 60) {
			System.out.println("Chinese is failed.");
		}
		if(english < 60) {
			System.out.println("English is failed.");
		}
		if(math < 60) {
			System.out.println("math is failed.");
		}
		if(chinese >=60 && english >=60 && math >=60) {
			System.out.println("All pass.");
		}
	}
}
