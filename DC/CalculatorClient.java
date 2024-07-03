import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class CalculatorClient {
 public static void main(String[] args) {
 try {
 Calculator c = (Calculator)
 Naming.lookup("rmi://localhost/CalculatorService");
 System.out.println( c.add(6, 9) );
 System.out.println( c.sub(10, 3) );
 System.out.println( c.mul(4, 5) );
 System.out.println( c.div(144, 12) );
 System.out.println( c.power(2, 4) );
 System.out.println( c.sq(6) );
 System.out.println( c.squrt(169) );
 System.out.println( c.cube(3) );
 }
 catch (MalformedURLException murle) {
 System.out.println();
 System.out.println("MalformedURLException");
 System.out.println(murle);
 }
 catch (RemoteException re) {
 System.out.println();
 System.out.println("RemoteException");
 System.out.println(re);
 }
 catch (NotBoundException nbe) {
 System.out.println();
 System.out.println("NotBoundException");
 System.out.println(nbe);
 }
 catch (java.lang.ArithmeticException ae) {
 System.out.println();
 System.out.println("java.lang.ArithmeticException");
 System.out.println(ae);
 }
 }
}

