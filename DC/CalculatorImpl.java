import java.lang.Math;
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator {
 // Implementations must have an
 //explicit constructor
 // in order to declare the
 //RemoteException exception
 public CalculatorImpl() throws java.rmi.RemoteException {
 super();
 }
 public long add(long a, long b) throws java.rmi.RemoteException {
 System.out.println ("Doing addition");
 return a + b;
 }
 public long sub(long a, long b) throws java.rmi.RemoteException {
 System.out.println ("Doing subtraction");
 return a - b;
 }
 public long mul(long a, long b) throws java.rmi.RemoteException {
 System.out.println ("Doing multiplication");
 return a * b;
 }
 public long div(long a, long b) throws java.rmi.RemoteException {
 System.out.println ("Doing division");
 return a / b;
 }
 public double power(long a, long b) throws java.rmi.RemoteException {
 System.out.println ("Doing raise to");
 return Math.pow(a , b);
 }
 public long sq(long a) throws java.rmi.RemoteException {
 System.out.println ("Doing square");
 return a * a;
 }
 public double squrt(long a) throws java.rmi.RemoteException {
 System.out.println ("Doing square root");
 return Math.sqrt(a);
 }
 public long cube(long a) throws java.rmi.RemoteException {
 System.out.println ("Doing cube");
 return a * a * a;
 }
}
