// program for throws example
import java.io.*; 
 class ThrowsExample 
{ 
 void mymethod(int num)throws IOException, ClassNotFoundException  { 
 if(num==1) 
 throw new IOException("Exception Message1"); 
 else 
 throw new ClassNotFoundException("Exception Message2");  } 
} 
 
class Arithmeticexceptionc{
	float f;
	void aem(int nu){
		if(nu==0) {
			throw new ArithmeticException("/ by zero");
		}
		else {
			f=1/nu;
		}
	}
}

public class Exp12 {

	public static void main(String[] args) {
			 try 
			 { 
			 ThrowsExample obj=new ThrowsExample(); 
			 obj.mymethod(1);
			 } 
			 catch(Exception ex) 
			 { 
			 System.out.println(ex); 
			 }
			 try {
				 Arithmeticexceptionc a = new Arithmeticexceptionc();
				 a.aem(0);
			 }
			 catch(Exception e) 
			 { 
			 System.out.println(e); 
			 }
			 finally 
			 { 
			 System.out.println("finally block is always executed"); 
			 } 
			 System.out.println("rest of the code..."); 

	}

}
