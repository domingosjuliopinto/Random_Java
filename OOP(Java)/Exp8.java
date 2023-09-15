//Program to try vector operations
import java.util.*;
public class Exp8 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(5,2);
		Scanner sc = new Scanner(System.in);
		int choice,pos,c=1;
		String item;
		
		System.out.println("Your shopping cart");
		while(c!=0) {
		System.out.println("1- Add , 2- Delete , 3-Add item at specific position , 4-display, 5-exit");
		System.out.println("Your choice :");
		choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter item : ");
		 			item = sc.next();
		 			v.addElement(new String(item));
		 			break;
			case 2: System.out.println("Enter item to be removed : ");
			 		item=sc.next();
			 		v.remove(item);
			 		break;
			case 3:System.out.println("Enter item :");
					item=sc.next();
					System.out.println("Enter position to be added at :");
					pos=sc.nextInt();
					v.insertElementAt(item, pos-1);
					break;
			case 4:System.out.println("The shopping cart has : "+v);
					break;
			case 5: System.out.println("You have exited the shopping cart");
					c=0;
					break;
			default:System.out.println("You entered wrong choice");
			}
		}

	}

}
