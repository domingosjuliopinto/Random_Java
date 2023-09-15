// Program to count the word from a given string
import java.util.Scanner;
public class Exp7a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
			String string="how much fish could bobby fish fry if bobby fish could fry fish" ;
			String word ;
			System.out.println("how much fish could bobby fish fry if bobby fish could fry fish");
			System.out.println("Enter word you want to count :");
			word = sc.next();
			String temp[] = string.split(" ");
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
			count++;
			}
			System.out.println("The string is: " + string);
			System.out.println("The word " + word + " occurs " + count + " times in the above string");

	}

}
