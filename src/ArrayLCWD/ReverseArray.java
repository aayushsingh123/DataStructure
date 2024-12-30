package ArrayLCWD;

import java.util.Scanner;

public class ReverseArray {

    // Method to reverse the array
    public static void reverseArray(int array[]) { // Method ka naam 'reverseArray' hai jo integer array ko reverse karta hai
        // Loop to swap elements from the start and end of the array
        for (int i = 0; i < array.length / 2; i++) { 
            // array.length / 2 se loop sirf array ke middle tak chalta hai. Baaki elements automatically swap ho jaate hain
            int temp = array[i]; // 'temp' mein starting index (array[i]) ka element store karte hain
            array[i] = array[array.length - i - 1]; // Last element ko pehle element ki jagah par set karte hain
            array[array.length - i - 1] = temp; // 'temp' mein stored pehle element ko last position par set karte hain
        }
    }

    // Main method to take input and print the reversed array
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

        // Call reverseArray method to reverse the array
        reverseArray(arr); // Array ko reverse karne ke liye method call kiya
        
        // Print each element of reversed array
        System.out.println("Reversed array:");
        for (int value : arr) { 
            System.out.println(value); // Reversed array ke elements ko print karte hain
        }
    }
}
