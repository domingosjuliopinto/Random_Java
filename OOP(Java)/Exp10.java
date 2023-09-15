//Program to demonstrate interface

import java.util.Scanner;
import java.lang.Math;

interface Area{
    public double areac();
}
class Circle implements Area{
    double radius;
    public Circle(double r){
        radius = r;
    }
    public double areac(){
        return 3.14 * radius * radius;
    }
}
class Rectangle implements Area{
    double length;
    double breadth;
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public double areac(){
        return length * breadth;
    }
}

class Triangle implements Area{
	double a,b,c,s,s1;
	public Triangle(double d,double e,double f) {
		a=d;
		b=e;
		c=f;
		s=(a+b+c)/2;
		s1=s*(s-a)*(s-b)*(s-c);
	}
	public double areac() {
		return Math.sqrt(s1);
	}
}

public class Exp10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double l,b,ra,x,y,z;
		System.out.println("Enter radius of circle : ");
		ra=sc.nextDouble();
		System.out.println("Enter Length of rectangle : ");
		l=sc.nextDouble();
		System.out.println("Enter Breadth of rectangle : ");
		b=sc.nextDouble();
		System.out.println("Enter Side 1 of triangle : ");
		x=sc.nextDouble();
		System.out.println("Enter Side 2 of triangle : ");
		y=sc.nextDouble();
		System.out.println("Enter Side 3 of triangle : ");
		z=sc.nextDouble();
		Circle c = new Circle(ra);
        System.out.println("Area of circle: " + c.areac());
        Rectangle r = new Rectangle(l, b);
        System.out.println("Area of rectangle: " + r.areac());
        Triangle t = new Triangle(x,y,z);
        System.out.println("Area of triangle: " + t.areac());

	}

}
