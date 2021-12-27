
import java.util.Scanner;

public class JPA01_2 {
	public static void main(String[] args) {
		System.out.println("Please input: ");
		double KG = new Scanner(System.in).nextInt();
		System.out.printf("%.6f kg = %.6f ponds\n", KG,KG*2.20462);
	}

}
