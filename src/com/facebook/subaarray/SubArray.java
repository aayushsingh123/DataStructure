package com.facebook.subaarray;
//questio--Split an array into two equal Sum subarrays


//Question: Split an array into two equal sum subarrays

public class SubArray {

 public static void main(String[] args) {
     
     int arr[] = {1, 2, 3, 4, 5, 5}; // Array ko define kiya aur values assign ki
     int n = arr.length; // Array ki length ko n mein store kiya
     printTwoParts(arr, n); // printTwoParts method ko call kiya jo array ko do parts mein split karega
 }

 // Method to find the split point
 public static int findSplitPoint(int arr[], int n) {
	    int leftSum = 0; // Left part ka sum initialize kiya

	    // Array ko traverse karke split point find karna
	    for (int i = 0; i < n; i++) {
	        leftSum += arr[i];  // Current index tak left sum ko calculate kiya

	        int rightSum = 0; // Right part ka sum initialize kiya
	        
	        // Right sum calculate karna
	        for (int j = i + 1; j < n; j++) {
	            rightSum += arr[j];
	        }

	        // Agar left sum aur right sum barabar hain, to split point return karo
	        if (leftSum == rightSum) {//matlab yeah left 5 and right 5{1, 2, 3, 4, 5, 5};
	            return i + 1; // Split point return kiya (i + 1 kyunki split point index ke baad ka element hota hai)
	        }
	    }

	    // Agar koi split point nahi milta, to -1 return karo
	    return -1;
	}


 // Method to print the two parts of the array
 public static void printTwoParts(int arr[], int n) {
     int splitPoint = findSplitPoint(arr, n); // Split point find karna

     // Agar split point -1 hai ya n hai, to print karo ke split possible nahi hai
     if (splitPoint == -1 || splitPoint == n) {
         System.out.println("Not possible to split the array into equal sum subarrays.");
         return;
     }

     // Array ka pehla part print karna
     for (int i = 0; i < splitPoint; i++) {
         System.out.print(arr[i] + " "); // Pehla part ka element print kiya
     }
     System.out.println();  // Second part ke liye new line

     // Array ka dusra part print karna
     for (int i = splitPoint; i < n; i++) {
         System.out.print(arr[i] + " "); // Dusra part ka element print kiya
     }
 }
}

/*   EXPLAIN CODE

Bilkul! Chaliye, findSplitPoint method ke example ko Hinglish mein samjhte hain:

Array: [1, 2, 3, 4, 5, 5]

Initial State:

leftSum ki value 0 se start hoti hai.
rightSum ko har iteration mein calculate kiya jayega.
Iteration by Iteration:

i = 0:

leftSum ab 1 ho jayega (kyunki pehle element 1 ko add kiya).
rightSum = 2 + 3 + 4 + 5 + 5 = 19
leftSum (1) aur rightSum (19) barabar nahi hain, to next iteration pe chalte hain.
i = 1:

leftSum ab 1 + 2 = 3 ho jayega.
rightSum = 3 + 4 + 5 + 5 = 17
leftSum (3) aur rightSum (17) barabar nahi hain, to next iteration pe chalte hain.
i = 2:

leftSum ab 3 + 3 = 6 ho jayega.
rightSum = 4 + 5 + 5 = 14
leftSum (6) aur rightSum (14) barabar nahi hain, to next iteration pe chalte hain.
i = 3:

leftSum ab 6 + 4 = 10 ho jayega.
rightSum = 5 + 5 = 10
leftSum (10) aur rightSum (10) barabar hain, to yeh split point hai. Array ko yahaan split kiya ja sakta hai.
Split Point:

Index i = 3 hai (0-based index).
Left Subarray: [1, 2, 3, 4] (index 3 ke pehle ke elements).
Right Subarray: [5, 5] (index 3 ke baad ke elements).
Output:

Pehla part: 1 2 3 4
Dusra part: 5 5
Yeh example dikhata hai ki kaise split point find hota hai aur array ko do parts mein divide kiya jata hai jahan dono parts ka sum barabar hota hai.



*/



