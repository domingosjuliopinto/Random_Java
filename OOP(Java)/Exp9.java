// Program for inheritance
import java.util.Scanner;
class Animal{
	int limbs;
	Animal(int limbs)
	{
		this.limbs=limbs;
	}
	void cellular()
	{
		System.out.println("They are multicellular organism");
		if(limbs==4)
			System.out.println("Correct,They have "+limbs+" limbs");
		else
			System.out.println("Wrong,They have 4 limbs");
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
		if(eyes==2)
			System.out.println("Correct, They have "+eyes+" eyes");
		else
			System.out.println("Wrong, They have 2 eyes");
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

class Cat extends Mammals{
	int ears;	
	Cat(int limbs,int eyes,int ears){
		super(limbs,eyes);
		this.ears=ears;
	}
	void character(){
		System.out.println("They meow and are mostly independent.");
		System.out.println("They have "+ears+" ears which have a hearing frequency of 45hz to 64khz");
	}
}

public class Exp9 {

	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		int l,e;
		System.out.println("Today we will learn characteristics of a Dog and Cat");
		System.out.println("");
		System.out.println("Before that answer two questions");
		System.out.println("How many limbs does a dog have ?");
		l=c.nextInt();
		System.out.println("How many eyes does a dog have ?");
		e=c.nextInt();
		System.out.println("");
		System.out.println("Characteristics of a Dog");
		Dog dog = new Dog(l,e,1);
		dog.cellular();
		dog.mammalia();
		dog.character();
		System.out.println("");
		System.out.println("Now answer two questions regarding Cat");
		System.out.println("How many limbs does a cat have ?");
		l=c.nextInt();
		System.out.println("How many eyes does a cat have ?");
		e=c.nextInt();
		System.out.println("");
		System.out.println("Characteristics of a Cat");
		Cat cat = new Cat(l,e,2);
		cat.cellular();
		cat.mammalia();
		cat.character();
	}

}
