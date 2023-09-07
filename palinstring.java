// Program for string palindrome
import java.io.* ;
import java.util.Scanner;
public class palinstring {
		  
	 
	    static boolean isPalindrome(String str) 
	    { 
	  
	         
	        int i = 0, j = str.length() - 1; 
	  
	        
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	    } 
	  
	 
	    public static void main(String[] args) 
	    { 	
	    	String str;
	    	Scanner st = new Scanner(System.in);
	    	System.out.println("Enter string : ");
	    	str=st.next();
	    	StringBuffer s1 = new StringBuffer(str) ; 
	    	int p = s1.length(); 
	        int q = s1.capacity(); 
	        System.out.println("The length of string is "+p);
	        System.out.println("The capacity is "+q);
	        if (isPalindrome(str)) 
	        	System.out.print("It's Palindrome"); 
	        else
	            System.out.print("No, it's not palindrome"); 
	    } 
	} 
