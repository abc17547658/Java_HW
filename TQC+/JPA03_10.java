import java.util.Scanner;

public class JPA03_10 {
	 static Scanner keyboard = new Scanner(System.in);
	    public static void main(String[] args) {
	        int n, sum = 0;
	        
		do {
	        	System.out.print("請輸入 n 的值(n > 0，且為偶數)：");
	        	n = keyboard.nextInt();
	        } while(n % 2 != 0 || n < 0);
			
		for(int i = 2;i <= n;i += 2) 
			sum += i;
			
		System.out.printf("2+4+...+%d=%d\n", n,sum);
	    }
}
