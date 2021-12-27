
import java.util.Scanner;

public class JPA02_4 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		
	}
	
	public static void test() {
		System.out.println("Input:");
		int n = input.nextInt();
		if(n%5==0 && n%9==0) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
	}

}
