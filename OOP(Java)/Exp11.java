//Program to try abstract class
import java.lang.Math;
import java.util.Scanner;

abstract class Area1{
	private double s,s1;
	private double arc,arr,art;
	
	public Area1(double a, double b, double c, double d, double e, double f) {
		this.arc=3.14*a*a;
		this.arr=b*c;
		this.s = (d+e+f)/2;
		this.s1=s*(s-d)*(s-e)*(s-f);
		this.art= Math.sqrt(s1);
	}
		
	void disp() {
		System.out.println("Area of circle is "+arc);
		System.out.println("Area of rectangle is "+arr);
		System.out.println("Area of triangle is "+art);
	}
}

class displ extends Area1{
	displ(double a,double b,double c,double d,double e,double f){
		super(a,b,c,d,e,f);
	}	
}
public class Exp11 {

	public static void main(String[] args) {
		double r,l,b,at,bt,ct;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Program for area of circle, rectangle and triangle");
		System.out.println("Enter radius of circle : ");
		r=sc.nextDouble();
		System.out.println("Enter length of rectangle : ");
		l=sc.nextDouble();
		System.out.println("Enter breadth of rectangle : ");
		b=sc.nextDouble();
		System.out.println("Enter side 1 of triangle : ");
		at=sc.nextDouble();
		System.out.println("Enter side 2 of triangle : ");
		bt=sc.nextDouble();
		System.out.println("Enter side 3 of triangle : ");
		ct=sc.nextDouble();
		
		displ d = new displ(r,l,b,at,bt,ct);
		d.disp();
		sc.close();
	}
}
