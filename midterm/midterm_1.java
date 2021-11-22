class Personel{
	String name;
	int bornIn;
	
	public Personel(String n, int b) {
		this.name=n;
		this.bornIn=b;
	}
	
	void show() {
		
	}
}

class Student extends Personel{
	String id;
	int grade;
	String c1,c2;
	public Student(String n,int b,String id,int g,String c1,String c2) {
		super(n,b);
		this.id=id;
		this.grade=g;
		this.c1=c1;
		this.c2=c2;
	}
	
	void show() {
		System.out.println("name:"+this.name);
		System.out.println("Date of Birth: "+this.bornIn);
		System.out.println("grade: "+this.grade);
		System.out.println("Course: "+this.c1);
		System.out.println("Course: "+this.c2);
	}
	
}
class Teacher extends Personel{
	String course;
	public Teacher(String n,int b,String c) {
		super(n,b);
		this.course=c;
		
	}
	void show() {
		System.out.println("name"+this.name);
		System.out.println("Date of Birth: "+this.bornIn);
		System.out.println("Course: "+this.course);
	}
}


public class midterm_1 {
	public static void main(String[] args) {
		int i;
		Personel[] persons=new Personel[4];
		persons[0]=new Student("張三",88,"94001",1,"國文","英文");
		persons[1]=new Student("王五",87,"93001",2,"數學","英文");
		persons[2]=new Teacher("張九",60,"英文");
		persons[3]=new Teacher("蕭十",62,"國文");
		
		
		for(i=0;i<persons.length;i++) {
			persons[i].show();
			System.out.println("-----------------");
		}
	}

}
