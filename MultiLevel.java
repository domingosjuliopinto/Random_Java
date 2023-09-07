// Program for multilevel inheritance
class Animal{
	int limbs;
	Animal(int limbs)
	{
		this.limbs=limbs;
	}
	void cellular()
	{
		System.out.println("They are multicellular organism");
		System.out.println("They have "+limbs+" limbs");
	}
}

class Mammals extends Animal{
	int eyes;
	Mammals(int limbs,int eyes){
		super(limbs);
		this.eyes=eyes;
	}
	void mammalia()
	{	
		System.out.println("They have mammary glands and hair");
		System.out.println("They have "+eyes+" eyes");
	}
}

class Dog extends Mammals{
	int tail;	
	Dog(int limbs,int eyes,int tail){
		super(limbs,eyes);
		this.tail=tail;
	}
	void character(){
		System.out.println("They are loyal and bark.");
		System.out.println("They have "+tail+" tail which they wag when they are happy");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		System.out.println("Characteristics of a Dog");
		Dog dog = new Dog(4,2,1);
		dog.cellular();
		dog.mammalia();
		dog.character();
	}

}
