package LinearSerachLCWD;

import java.util.Scanner;

public class LinearSerach {
	
	public static int linearSearch(int array[], int target) {
		
		int index=-1;//-1 matlab abhi nhi mila hai 
		for(int i=0; i <array.length; i++) {
			if(array[i]==target) {
				index=i;// i ko index mein daal denge
				break;
			}
		}
		
		return index;
		
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
	int foundindex=linearSearch(arr , target);//yeah niche likha hai
	if(foundindex==-1) {//-1 jo hai iska matlab nhi mila 
		System.out.println("Element not found ...");
	}else {
		System.out.println("Element found at index: " +foundindex);
	}
		
	}

}


//or
/*
 package LinearSerachLCWD;

public class LinearSearch {
    
    public static int linearSearch(int array[], int target) {
        int index = -1; // -1 matlab abhi nahi mila hai
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i; // i ko index mein daal denge
                break;
            }
        }
        return index;
    }
    
    public static void Main(String[] args) {
        // Step 1: Define and initialize the array
        int[] arr = {10, 20, 30, 40, 50}; // Array values
        int target = 30; // Target element
        
        // Calling linear search method
        int foundIndex = linearSearch(arr, target);
        
        if (foundIndex == -1) { // -1 ka matlab nahi mila
            System.out.println("Element not found...");
        } else {
            System.out.println("Element found at index: " + foundIndex);
        }
    }
}
*/
