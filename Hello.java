//Program for hello world followed by number even or odd
import java.util.Scanner;
public class Hello {
	
	public static void main(String[] args) {
			
	Scanner input = new Scanner (System.in);
		
	System.out.println("Hello world !");
	System.out.println();
	System.out.println("Tell first no.");
	 int num=input.nextInt() ;
	 System.out.println(num+" is the number");
	 if(num%2==0) {
		 System.out.println("Number is even");
	 }
	 else {
		 System.out.println("Number is odd");
	 }
	 input.close();
		}

}
