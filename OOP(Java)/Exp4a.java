// Program for function overloading
import java.util.Scanner;

class Book_{
	float g;
	int gi;
	
	void max(int a,int b){
		gi=(a>=b)?a:b;
		System.out.println(gi+" is the maximum number");
	}
	
	void max(float c, float d){
		g=(c>=d)?c:d;
		System.out.println(g+" is the maximum number");
	}
	void max(int a,int b,int e){
		int t;
		t=(a>=b)?a:b;
		gi=(t>=e)?t:e;
		System.out.println(gi+" is the maximum number");
	}
}
	
class Exp4a{
  public static void main(String args[]){
	Scanner S= new Scanner(System.in);
	Scanner S1= new Scanner(System.in);
	int h;
	System.out.println("Do you want maximum of ");
	System.out.println("1) 2 integer numbers ");
	System.out.println("2) 2 floating numbers ");	
	System.out.println("3) 3 integer numbers ");
	h=S.nextInt();
	switch(h) {
  	case 1:	int i;
		int j;
    		System.out.println("Enter one number");
		i=S1.nextInt();
		System.out.println("Enter second number");
		j=S1.nextInt();
		Book_ gr1 = new Book_();
		gr1.max(i,j);
    		break;
  	case 2:
    		float k;
		float l;
    		System.out.println("Enter one number");
		k=S1.nextFloat();
		System.out.println("Enter second number");
		l=S1.nextFloat();
		Book_ gr2 = new Book_();
		gr2.max(k,l);
    		break;
	case 3:	int m;
		int n;
		int o;
    		System.out.println("Enter one number");
		m=S1.nextInt();
		System.out.println("Enter second number");
		n=S1.nextInt();
		System.out.println("Enter second number");
		o=S1.nextInt();
		Book_ gr3 = new Book_();
		gr3.max(m,n,o);
    		break;
  	default: System.out.println("Wrong choice");
	}

   } 
}
