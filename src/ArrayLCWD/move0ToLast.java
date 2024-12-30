package ArrayLCWD;

import java.util.Scanner;

public class move0ToLast {
    
    // Method to move all zeros to the end of the array
    public static void moveZeroToLast(int [] arr) {
        
        int index = 0; // Yeh index track karega ki non-zero elements kaha insert karne hain
        // Loop through the array
        for(int i = 0; i < arr.length; i++) {
            // Agar current element zero nahi hai
            if(arr[i] != 0) {
                arr[index] = arr[i]; // Non-zero element ko correct position pe rakhna
                index++; // Position ko increment karna
            }
        }
        
        // Ab remaining positions ko zero se fill karna
        while(index < arr.length) {
            arr[index] = 0; // Yaha zero dal rahe hain
            index++; // Incrementing the index
        }
    }
    
    public static void main(String[] args) {
        // User input ke liye Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // User se array ka size puchhna
        System.out.println("Enter the size of array ...");
        int size = scanner.nextInt(); // User se size ko input lena
        
        // Size ke according array create karna
        int[] arr = new int[size];
        
        // User se array elements input lena
        System.out.println("Enter the array values one by one: ");
        for (int i = 0; i < size; i++) { 
            arr[i] = scanner.nextInt(); // User input ko array mein store karna
        }

        // Zero ko end mein shift karne wale method ko call karna
        moveZeroToLast(arr);
        
        // Array ko print karna
        for(int value : arr) {
            System.out.print(value + "\t"); // Elements ko print karna, tab ke saath
        }
        System.out.println(); // Newline for better formatting
    }
}


//for(int value : arr) { int value kaise aaya

/* int value
int value ek temporary variable hai, jo har iteration mein array ke ek element ko store karta hai.
Har baar loop chalne par, value ko arr ke current element ki value assign ki jaati hai.   */