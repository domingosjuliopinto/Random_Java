//Program for sum of matrix
import java.util.Scanner;
public class Exp6b {

	public static void main(String[] args) {
		int r,c,t=0,s;
		int array[][];
		array = new int[20][20];
		
		Scanner N = new Scanner(System.in);
		
		System.out.println("Enter how many rows you want in an array. Should be less than 21");
		r=N.nextInt();
		System.out.println("Enter how many columns you want in an array. Should be less than 21");
		c=N.nextInt();
		System.out.println("Enter numbers in an 2d array");
		for (int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				array[i][j]= N.nextInt();
			}
		}
		System.out.println("");
		System.out.println("The elements in matrix are ");
		for (int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < c; i++) {
			s=0;
			for(int j = 0; j <r; j++) {
				s=s+array[j][i];
			}
			System.out.println("Sum of Column "+(i+1)+" is "+s);
			t=t+s;
		}
		System.out.println("Sum of the entire matrix is "+t);
	}
		
}

