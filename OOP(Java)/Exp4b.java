// Distance in Feet and Inches.
import java.util.Scanner;

//class Distance to read, print and add distance
class Distance
{	
	int inches,feet;
	Distance(int feet1,int feet2,int inches1,int inches2)
	{	
		inches=inches1+inches2;
		feet=feet1+feet2+(inches/12);
		inches=inches%12;
	}
	
	void show()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
}

public class Exp4b
{
	public static void main(String []s)
	{
		try
		{
			int feet1, feet2;
			int inches1, inches2;
			
			Scanner sc1=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
		
			System.out.println("1st Distance");
			System.out.println("Enter feet: ");
			feet1=sc1.nextInt();
			System.out.println("Enter inches: ");
			inches1=sc1.nextInt();
			
			System.out.println("2nd Distance");
			System.out.println("Enter feet: ");
			feet2=sc2.nextInt();
			System.out.println("Enter inches: ");
			inches2=sc2.nextInt();
			
			Distance D=new Distance(feet1,feet2,inches1,inches2);
			D.show();						
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred :"+ e.toString());
		}
	}
}