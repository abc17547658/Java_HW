import java.util.Scanner;

public class JPA03_10 {
	 static Scanner keyboard = new Scanner(System.in);
	    public static void main(String[] args) {
	        int n, sum = 0;
	        
		do {
	        	System.out.print("�п�J n ����(n > 0�A�B������)�G");
	        	n = keyboard.nextInt();
	        } while(n % 2 != 0 || n < 0);
			
		for(int i = 2;i <= n;i += 2) 
			sum += i;
			
		System.out.printf("2+4+...+%d=%d\n", n,sum);
	    }
}
