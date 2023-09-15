//Program to try different string operations
import java.util.Scanner;
public class Exp7b {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String string1,string2;
		int choice;
		System.out.println("Enter 1st string : ");
		string1=sc.next();
		System.out.println();
		System.out.println("1) Append 2)Insert 3)Replace 4)Delete");
		System.out.println("5)Reverse 6)Capacity 7)Ensure Capacity");
		System.out.println("Enter choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : StringBuffer sb1=new StringBuffer(string1); 
				 System.out.println("Enter 2nd string : ");
				 string2=sc.next();
				 sb1.append(string2);
				 System.out.println(sb1);
				 break;
		case 2 : StringBuffer sb2=new StringBuffer(string1);  
		         System.out.println("Enter 2nd string : ");
				 string2=sc.next();
				 sb2.insert(1,string2);
				 System.out.println(sb2);  
				 break;
		case 3 :StringBuffer sb3=new StringBuffer(string1);  
				System.out.println("Enter 2nd string : ");
				string2=sc.next();
				sb3.replace(1,3,string2);  
				System.out.println(sb3); 
				break;
		case 4 : StringBuffer sb4=new StringBuffer(string1);  
				 sb4.delete(1,3);  
				 System.out.println(sb4);
				 break;
		case 5: StringBuffer sb5=new StringBuffer(string1);  
				sb5.reverse();  
				System.out.println(sb5); 
				break;
		case 6:StringBuffer sb6=new StringBuffer();  
				System.out.println(sb6.capacity());  
				sb6.append(string1);  
				break;
		case 7:StringBuffer sb=new StringBuffer();  
				System.out.println(sb.capacity());
				sb.append(string1);  
				System.out.println("Enter 2nd string : ");
				 string2=sc.next();
				System.out.println(sb.capacity());
				sb.append(string2);  
				System.out.println(sb.capacity());
				sb.ensureCapacity(10);
				System.out.println(sb.capacity()); 
				sb.ensureCapacity(50); 
				System.out.println(sb.capacity());
				break;
		default: System.out.println("You entered wrong number");
		}

	}

}
