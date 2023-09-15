// Program for Pizza Bill
import java.util.Scanner;
class Exp2a
{
  public static void main(String args[])
  {
    int pizza=120,top=15,nop,not;
    float tax=0.125f,taxadd,bill,total;
    Scanner S= new Scanner(System.in);
    System.out.print("Enter no. of pizza : ");
    nop=S.nextInt();
    System.out.print("Enter no. of toppings on each pizza: ");
    not=S.nextInt();
    total=(pizza*nop)+(not*top*nop);
    taxadd=(total*tax);
    bill=total+taxadd;
    System.out.println();
    System.out.println("-------Receipt-------");
    System.out.println("Thanks for coming to OOPS Pizzas ");
    System.out.println("No. of Pizza = "+nop);
    System.out.println("No. of Toppings on each pizza = "+not);
    System.out.println("Price of one pizza = "+pizza);
    System.out.println("Price of one additional topping = "+top);
    System.out.println("Total = "+total);
    System.out.println("12.5% Tax Therefore additional tax added = "+taxadd);
    System.out.println("Bill = "+bill);
  }
} 