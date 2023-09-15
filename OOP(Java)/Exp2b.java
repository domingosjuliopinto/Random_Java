// Program to find greatest of the three
class Exp2b{
  public static void main(String args[]){  
	int t;
	int g;
	System.out.println("The three numbers are ");
	for(int i=0;i<args.length;i++){
  
		System.out.println(args[i]);
		
	}
	int n1 = Integer.parseInt(args[0]);  
	int n2 = Integer.parseInt(args[1]);  
	int n3 = Integer.parseInt(args[2]);    
  	t=(n1>=n2)?n1:n2;
	g=(t>=n3)?t:n3;
	System.out.println("The greatest of the three numbers is "+g);
	  
	}  
}  