//Program to check number is palindrome or not
class Exp1b
{  
 public static void main(String B[])
 {  
   int r,sum=0,temp;    
   int n=100;
  
   temp=n;    
   while(n>0)
   {    
    r=n%10;  
    sum=(sum*10)+r;    
    n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(temp+" is a palindrome number");    
  else    
   System.out.println(temp+" not palindrome");    
}  
}  