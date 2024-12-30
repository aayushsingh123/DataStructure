package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[], int target) {
		int low=0;
		int high= arr.length-1;
		int i=1;
		
		
		
		while(low<=high) {
			System.out.println("pass the value toh fine how many time call " +i);// matla kitni baar loop chala hai 
			i++;
			//find the element
			int midIndex= low+(high - low)/2;
			if(arr[midIndex] ==target) {
				return midIndex;
			}
			if(target<arr[midIndex]) {
				high= midIndex-1;
			}
			
			if(target>arr[midIndex]) {
				low= midIndex+1;
			}
		}
		
		return -1;
	}
	
	public static void main (String [] args) { ///step1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entry the size of array ...");
		int size = scanner.nextInt();
		//defining array and initializayion
		int [] arr= new int[size];
		System.out.println("enter the array value one by one : ");
		for(int i=0; i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		
		//input target element from user
		System.out.println("Enter the target elemet ... ");
		int target = scanner.nextInt();
		
		//calling linear serach method
	int foundindex=binarySearch(arr , target);//yeah niche likha hai
	if(foundindex==-1) {//-1 jo hai iska matlab nhi mila 
		System.out.println("Element not found ...");
	}else {
		System.out.println("Element found at index: " +foundindex);
	}
		
	}

}
