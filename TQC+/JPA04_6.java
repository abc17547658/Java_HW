import java.util.Scanner;
public class JPA04_6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String args[]) {
		String str;
		
		for(int i = 1;i <= 2;i++) {
			System.out.print("Input a string: ");
			str = keyboard.nextLine();
			
			System.out.printf("%s has %d As\n", str,countA(str));
		}
	}

	public static int countA(String str) {
		if(str.length() == 0)
			return 0;
		else if(str.charAt(0) == 'A')
			return 1 + countA(str.substring(1));
		return countA(str.substring(1));
	}
}