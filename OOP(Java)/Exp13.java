// Program to show user made exception
import java.util.Scanner;

class MyException extends Exception { 
   
	private static final long serialVersionUID = 1L;

	// default constructor 
    MyException() {    } 
  
    // parametrized constructor 
    MyException(String str) { super(str); } 
  }
  
public class Exp13 {

	public static void main(String[] args) {
		try {
			String name,check;
			int age;
			long number;
			
			Scanner input = new Scanner (System.in);
			System.out.println("Enter Personal details");
			System.out.println("Enter name");
			name = input.next();
			if(name.length() >10) {
				MyException me = new MyException("Name cannot be more than 10 letters in this exp."); 
	                    throw me; 
			}
			System.out.println("Enter age");
			age = input.nextInt();
			if(age==0) {
				MyException me = new MyException("Age cannot be 0"); 
	                    throw me; 
			}
			System.out.println("Enter mobile number");
			number = input.nextInt();
			check = Long.toString(number);
			if(check.length() <10) {
				MyException me = new MyException("Mobile number cannot be less than 10 digits"); 
	                    throw me; 
			}
			if(check.length() >10) {
				MyException me = new MyException("Mobile number cannot be more than 10 digits"); 
	                    throw me; 
			}
			System.out.println();
			System.out.println();
			System.out.println("The personal details are");
			System.out.println("Name : "+name);
			System.out.println("Age : "+age+" years");
			System.out.println("Mobile Number : "+number);
		}
		catch(Exception e){
			System.out.println("Exception occurred :"+ e.toString());
		}

	}

}
