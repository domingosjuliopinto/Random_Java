//Program for binary_search
import java.util.Scanner;

class BinarySearchAl{  
	 public void binary_search(int arr[], int l, int value){  
	  int first = 0;
	  int last=l-1;
	  int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < value ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == value ){  
	        System.out.println("Element is at position: " + (mid+1));  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }
}

public class Binary_Search {

	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		Scanner c2= new Scanner(System.in);
		int[] arr;
		int n;
		arr = new int[10];
		System.out.println("Enter the array :");
		for (int i = 0; i < arr.length; i++) {
			  arr[i]= c.nextInt();
		}
		System.out.println("Enter the number you want to search : ");
		n=c2.nextInt();
		BinarySearchAl d = new BinarySearchAl();
		d.binary_search(arr,10, n);
		
		
	}

}
