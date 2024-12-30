package ArrayLCWD;

import java.util.Scanner;

//Question-- find the largest element in an Array
public class LargestElement {
	//findLargestElement yeah ek int array[] le raha hai
	//step 2
	public static int findLargestElement(int array[]) { //static se hme object banana nhi padhta and directly call kar sakte hai
		//access
		int  largestElement=array[0];
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>largestElement) 
				largestElement=array[i];
			}
			return largestElement;
		}
	
	
	
	public static void main (String [] args) { ///step1
		Scanner scanner = new Scanner(System.in);
		//int[] arr = { 20,45,23,11,67 };
		System.out.println("Entry the size of array ...");
		int size = scanner.nextInt();
		//defining array and initializayion
		int [] arr= new int[size];
		System.out.println("enter the array value one by one : ");
		for(int i=0; i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		//logic to find largest element in array
		int largestElement = findLargestElement(arr); //step 3
		System.out.println("largestElement of value is " +largestElement);
	}

}
