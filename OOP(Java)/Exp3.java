// Program to demonstrate constructor
class Book{
	String Name;
	int pages;
	double price;
	Book(String n,int pa,double pr){
		Name = n;
		pages=pa;
		price=pr;
	}
	void Display(){
		if(pages>500&&price<200)
		{
			System.out.println("Name of book : "+Name);
			System.out.println("Pages : "+pages);
			System.out.println("Price : "+price);
			System.out.println("");
		}
	}
}

public class Exp3{
	public static void main(String args[]){
		Book[] obj = new Book[5];
		obj[0]= new Book("Meditations",332,190);
		obj[1]= new Book("Graphics",510,199);
		obj[2]= new Book("5 Masks",290,200);
		obj[3]= new Book("Snakes",600,185);
		obj[4]= new Book("Hardy Boys",332,190);
		
		obj[0].Display();
		obj[1].Display();
		obj[2].Display();
		obj[3].Display();
		obj[4].Display();
	}
}