//Program to reverse an array
import java.util.Scanner;
public class Exp6a {

	public static void main(String[] args) {
		int n,t;
		int array[];
		array= new int[20];
		
		Scanner N = new Scanner (System.in);
		
		System.out.println("Enter how many numbers you want in an array. Should be less than 21");
		n=N.nextInt();
		System.out.println("Enter numbers in an array");
		for (int i = 0; i < n; i++) {
			array[i]= N.nextInt();
		}
		for (int i = 0; i < n; i++) {
		
			System.out.println("Element at index " + i + " : "+ array[i]);
		}
		for (int i = 0; i < n/2; i++) {
			t=array[i];
			array[i]=array[n-i-1];
			array[n-i-1]=t;
		}
		System.out.println("");
		System.out.println("After reversing");
		for (int i = 0; i < n; i++) {
			
			System.out.println("Element at index " + i + " : "+ array[i]);
		}
	}
}
