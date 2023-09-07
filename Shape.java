// Program for area of shape
import java.lang.Math;

class Area{
	double area;
	int e=0;
	int f=0;
	int g=0;
	
	Area(int r){
		this.e=r;
		this.area=3.14*r*r;
	}
	
	Area(int h, int b){
		this.e=h;
		this.f=b;
		this.area=h*b;
	}
	
	Area(int a,int d,int c){
		double s;
		double s1;
		this.e=a;
		this.f=d;
		this.g=c;
		s=(a+d+c)/2;
		s1=s*(s-a)*(s-d)*(s-c);
		this.area= Math.sqrt(s1);
	}
	
	void display() {
		if(f==0&&g==0)
			System.out.println("For Circle");
		else if(g==0) {
			if(e==f)
				System.out.println("For Square");
			else
				System.out.println("For Rectangle");
		}
		else
			System.out.println("For Triangle");
		
		System.out.println("The Area is "+area);
	}
}

public class Shape {

	public static void main(String[] args) {
		Area d1 = new Area(2);
		Area d2 = new Area(6,7);
		Area d3 = new Area(8,8);
		Area d4 = new Area(3,4,5);
		
		d1.display();
		d2.display();
		d3.display();
		d4.display();

	}

}
