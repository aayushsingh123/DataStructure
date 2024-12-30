package ArrayLCWD;

import java.util.Scanner;

public class SecondLarge {
	
	public static int findSecondLargestNumber(int array[]) {//int array[] se hme find karna hai findSecondLargestNumber ko
		//assumption
		int largest=array[0];// 0 se start hai isliye yeah pehle aayega
		int secondlargest=array[1];// 0 ke baad 1 aata hai toh yeah second largest hoga
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) {//array[i] ka matlab array[0] hota hai, 
				
				secondlargest=largest;
				largest=array[i];
			}
			else if(array[i]> secondlargest && array[i]!=largest) {
				secondlargest=array[i];
				
			}
		}
		
		return secondlargest;
		
	}
	
	public static void main (String[] args) {
		
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

		// find the second largest number
        int findSecondLargestNumber = findSecondLargestNumber(arr);
		System.out.println("find Second largest value " +findSecondLargestNumber);
		
	}

}
