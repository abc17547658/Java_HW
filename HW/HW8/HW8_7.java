package HomeWork;

class Ctest{
	
	int a;
	char test;
	
	void test() {
		
		if (a == 0) {
			System.out.println("计0");
		}
		
		else if(a % 2 ==0) {
			System.out.println("计案计");
		}
		else {
			System.out.println("计计");
		}
		
		
	}
	
}


public class HW8_7 {
	public static void main(String args[]) {
		Ctest a, test;
		
		
		Ctest ctest = new Ctest();
		
		
		ctest.a = 3;
//		ctest.a = 8;
//		ctest.a = 0;
		ctest.test();
		

		

		
		
	}

}
