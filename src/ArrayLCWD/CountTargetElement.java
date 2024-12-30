package ArrayLCWD;

import java.util.Scanner;

public class CountTargetElement {

    // Ye method array mein target element ki ginti karta hai
    public static int countTargetElement(int[] array, int targetElement) {
        int count = 0;
        // Array mein har element par loop lagate hain
        for (int i = 0; i < array.length; i++) {//array.length tak chahlega yeag hme pata nhi hai ki kitna hoga yeah manually hoga
            // Agar current element target ke barabar hai, to count badhao
            if (array[i] == targetElement) {
                count++;
            }
        }
        // Total count wapas karo
        return count;
    }

    public static void main(String[] args) {  // Method ka naam 'Main' rakha
        Scanner scanner = new Scanner(System.in);
        
        // Array ka size input lene ke liye
        System.out.println("Array ka size bataiye:");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        
        // Array ke elements input lene ke liye
        System.out.println("Array ke values ek ek karke dijiye:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();  // Har element ko array mein daalte hain
        }
        
        // Target element input karte hain
        System.out.println("Target element bataiye:");
        int target = scanner.nextInt();

        // Target element ki ginti nikaalne ka logic
        int count = countTargetElement(arr, target);
        System.out.println("Target element ki ginti: " + count);
        
        // Scanner ko close karte hain
        scanner.close();
    }
}



//samjhne ke liye niche likha hai

/*
ek example lete hain jisme aapne 4 baar target element ki value 11 di hai aur aapke array ki values hain [11, 13, 14, 11]. Yahan par hum dekhenge ki code kaise kaam karega aur kaise target element ki ginti karega.

Example Scenario:
User Input:
Array size: 4
Array values: 11, 13, 14, 11 (ye values user input ke roop mein daalega)
Target element: 11
Code Execution:
Input lene ka process:

User se array ka size poocha jaata hai (4).
User se array ke elements liye jaate hain (user 11, 13, 14, 11 dalta hai).
Target element input liya jaata hai (user 11 dalta hai).
Count ka calculation:

Program countTargetElement method ko call karta hai.
Ye method loop se array ke elements ko target element (11) se compare karega.
Loop Execution Breakdown:
First iteration (i = 0):

array[0] (value 11) ko targetElement (value 11) se compare karega.
Condition true hai, to count ko 1 se badha kar count = 1.
Second iteration (i = 1):

array[1] (value 13) ko targetElement (value 11) se compare karega.
Condition false hai, to count waise ka waise rahega (count = 1).
Third iteration (i = 2):

array[2] (value 14) ko targetElement (value 11) se compare karega.
Condition false hai, to count waise ka waise rahega (count = 1).
Fourth iteration (i = 3):

array[3] (value 11) ko targetElement (value 11) se compare karega.
Condition true hai, to count ko 1 se badha kar count = 2.






*/