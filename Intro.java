//Program to try oop

class Marks {
	int Engm;
	int Mathm;
	int Phym;
	
}
public class Intro {
	int Stuage;
	public Intro(String name) {
		System.out.println("Student name is "+name);
	}
	public void setAge(int age) {
		Stuage= age;
	}
	public int getAge() {
		System.out.println("Student age is "+Stuage);
		System.out.println();
		return Stuage;
	}

	public static void main(String[] args) {
		Marks obj1 = new Marks();
		Intro ob1 = new Intro("Tom");
		ob1.setAge(21);
		ob1.getAge();
		obj1.Engm=50;
		obj1.Mathm=60;
		obj1.Phym=70;
		
		Marks obj2 = new Marks();
		Intro ob2 = new Intro("Jerry");
		ob2.setAge(18);
		ob2.getAge();
		obj2.Engm=40;
		obj2.Mathm=50;
		obj2.Phym=60;
		
	System.out.println("The first set of marks are ");
	System.out.println("Age is " +ob1.Stuage);
	System.out.println(obj1.Engm);
	System.out.println(obj1.Mathm);
	System.out.println(obj1.Phym);
	System.out.println();
	System.out.println("The second set of marks are ");
	System.out.println("Age is "+ob2.Stuage);
	System.out.println(obj2.Engm);
	System.out.println(obj2.Mathm);
	System.out.println(obj2.Phym);
	System.out.println();
	String name = "Passed";
	int num1 = 316;
	System.out.println(name+ " Finally with "+num1);
	}

}
