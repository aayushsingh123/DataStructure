package ArrayLCWD;

import java.util.Scanner;

public class CheckSorted {
	
	public static boolean checkSorted(int array[]) {
		boolean isSorted= true;
		for(int i=0; i<array.length-1;i++) {
			if(array[i+1]<array[i]) {
				isSorted=false;
			}
			
		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // User input ke liye Scanner object banaya
        System.out.println("Enter the size of array ..."); // User ko array ka size enter karne ka message
        int size = scanner.nextInt(); // User ke diye size ko integer variable 'size' mein store karte hain

        // User ke diye size ke according array create aur initialize karte hain
        int[] arr = new int[size];
        System.out.println("Enter the array values one by one: "); // User se array ke elements enter karne ke liye message
        
        // Loop to take array elements as input from user
        for (int i = 0; i < size; i++) { 
            arr[i] = scanner.nextInt(); // User se input le kar usse array ke i-th index par store karte hain
        }
   //checking if the array are sorted or not
        boolean checkResult = checkSorted(arr);
        System.out.println("the array is " +(checkResult ? "" : "not ") + "sorted");
        
	}

}
