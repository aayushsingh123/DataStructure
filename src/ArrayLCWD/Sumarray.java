/*
 * package ArrayLCWD;
 * 
 * public class Sumarray {
 * 
 * public static int sumArray(int[] arr) 
 * {
 *  int sum = 0;
 *   for (int i = 0; i <arr.length; i++)
 *  { sum = sum + arr[i]; 
 *  }
 *   return sum; }
 * 
 * public static void Main(String[] args) 
 * { int[] arr = {5, 10, 15}; //
 * Hard-coded array values
 * 
 * int sum = sumArray(arr); System.out.println("Array sum = " + sum); } }
 */


//or 


package ArrayLCWD;

import java.util.Scanner;

public class Sumarray {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];// arr[i] index hai
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
       
        int[] arr = new int[size];
        System.out.println("Enter the array values one by one:");

        for (int i = 0; i < size; i++) {
        	//Ek loop shuru karo jisme i ko 0 se shuru kiya ja raha hai, jab tak i ki
        	//value size se chhoti hai, aur har iteration ke baad i ki value ko 1 se badhao."
            arr[i] = scanner.nextInt();
        }

        int sum = sumArray(arr);
        System.out.println("Array sum = " + sum);
    }
}

/*
arr variable array ko represent karta hai, jo Main method mein initialize kiya gaya hai. arr ka data i se nahi aa raha hai, balki i ka use array ke elements access karne ke liye ho raha hai.

Aapka code is tarah se kaam karta hai:

Array Initialization:


int[] arr = {5, 10, 15};
Yahan arr ek integer array hai jisme {5, 10, 15} values stored hain.
arr array hai jo memory mein ek contiguous (lagaatar) block mein allocated hai aur isme teen elements hain: 5, 10, aur 15.
Loop mein i ka Use:


for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}
Yahan i ek index variable hai jo loop ke har iteration mein increase hota hai (0, 1, 2 ...).
i ka use arr array ke har element ko access karne ke liye ho raha hai.
arr[i] ka kya Matlab Hai?:

arr[i] ka matlab hai arr array ka ith position ka element.
Example:
Jab i = 0, toh arr[i] ka value arr[0] yaani 5 hoga.
Jab i = 1, toh arr[i] ka value arr[1] yaani 10 hoga.
Jab i = 2, toh arr[i] ka value arr[2] yaani 15 hoga.
Sum Calculation:

Har iteration mein arr[i] ko sum variable mein add kiya ja raha hai.
Yeh process tab tak chalta hai jab tak array ke saare elements process nahi ho jaate.
Example Se Samjhein
Agar arr = {5, 10, 15} hai:

Pehla Iteration (i = 0):
sum = sum + arr[0] (initial sum 0 hai) => sum = 0 + 5 = 5
Dusra Iteration (i = 1):
sum = sum + arr[1] => sum = 5 + 10 = 15
Teesra Iteration (i = 2):
sum = sum + arr[2] => sum = 15 + 15 = 30
Loop khatam hone ke baad final sum ki value 30 hogi.
 
*/ 
