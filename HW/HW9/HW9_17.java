package HW9;

class Namecard{
	private String name;
	private String address;
	private Phone data;
	
	class Phone{
		private String company;
		private String cell;
		
		public Phone(String s1,String s2) {
			company = s1;
			cell = s2;
			
		}
	}
	public Namecard(String na,String add,String s1,String s2) {
		name = na;
		address = add;
		data = new Phone(s1,s2);
		
	}
	public void show() {
		System.out.println("�n�ͩm�W�G"+name);
		System.out.println("�p���a�}�G"+address);
		System.out.println("���q�q�ܡG"+data.company);
		System.out.println("������X�G"+data.cell);
	}
}


public class HW9_17 {
	
	public static void main(String args[]){
		
		Namecard first = new Namecard("Andy","123City","2345-6778","0911-123456");
		first.show();
		
		
	   }
		
}
