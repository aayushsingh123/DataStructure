package com.Split_array_in_three_equal_sum_subarrays;

public class split {

    // Function to check if array ko 3 equal sum subarrays mein split kiya ja sakta hai
    static boolean canSplitIntoThreeEqualSum(int[] arr) {
        int n = arr.length;

        // Step 1: Pura array ka sum calculate karna
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;  // har element ka sum add karte ja rahe hain
        }
        System.out.println("Total Sum of array: " + totalSum);  // Debugging line

        // Step 2: Check karte hain ki total sum 3 se divisible hai ya nahi
        if (totalSum % 3 != 0) {
            System.out.println("Array ka total sum 3 se divisible nahi hai.");
            return false; // Agar divisible nahi hai, to split possible nahi
        }

        int targetSum = totalSum / 3; // Har subarray ka sum ye hoga
        System.out.println("Target sum for each part: " + targetSum);  // Debugging line

        int currentSum = 0; // current sum ko track karne ke liye
        int splitCount = 0; // Split points count karne ke liye

        // Step 3: Array ko traverse karna aur split points check karna
        for (int i = 0; i < n; i++) {
            currentSum += arr[i]; // current sum mein har element ko add karte hain
            System.out.println("Current sum at index " + i + ": " + currentSum);  // Debugging line

            // Jab currentSum targetSum ke barabar hota hai, to ek subarray mil gaya
            if (currentSum == targetSum) {
                splitCount++; // Ek split point mil gaya
                System.out.println("Split found at index " + i + ", Split count: " + splitCount);  // Debugging line
                currentSum = 0; // next subarray ke liye currentSum ko reset karte hain

                // Agar hume do split points mil gaye, to array ko 3 parts mein split kar sakte hain
                if (splitCount == 2) {
                    return true; // Split possible hai
                }
            }
        }

        // Agar do split points nahi milte, to split possible nahi
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4}; // Input array
        if (canSplitIntoThreeEqualSum(arr)) {
            System.out.println("Array ko 3 equal sum subarrays mein split kiya ja sakta hai.");
        } else {
            System.out.println("Array ko 3 equal sum subarrays mein split nahi kiya ja sakta.");
        }
    }
}

	
	








/*

Array ko 3 equal sum subarrays mein split karna tab possible hota hai, jab:

Total Sum of Array ko 3 se divide karne par remainder 0 aaye, yani:

Array ka total sum 3 se perfectly divisible ho.
Agar totalSum % 3 == 0 ho, tabhi 3 equal sum subarrays ban sakte hain.
Split Points Milna:

Hume do split points milne chahiye jo array ko 3 parts mein baant sakein, aur har part ka sum equal ho.
Pehla split point hume S/3 sum ke baad milta hai (jahan S total sum hai).
Dusra split point hume 2(S/3)* sum ke baad milta hai.
Kab Possible Hai Split Karna (Step-by-Step):
Total Sum Check Karna:

Pehle array ke sab elements ka sum nikalte hain.
Phir check karte hain ki total sum ko 3 se divide karne par remainder 0 aata hai ya nahi:
Agar remainder 0 aata hai, iska matlab hai ki 3 equal sum parts mein split karna possible ho sakta hai.
Agar remainder 0 nahi aata, to split impossible hoga.
Split Points Dhoondhna:

Array ko traverse karke prefix sum nikalte hain.
Jab prefix sum S/3 ke equal ho jata hai, pehla split point mil jata hai.
Jab prefix sum 2*(S/3) ke equal ho jata hai, dusra split point milta hai.
Agar dono split points mil gaye, to array ko 3 equal sum subarrays mein split kar sakte hain.
Example:
Input: arr[] = {1, 3, 4, 0, 4}
Total Sum Calculation:

Total sum of array = 1 + 3 + 4 + 0 + 4 = 12
12 % 3 == 0, to 3 se divisible hai, isliye aage check kar sakte hain.
Target Sum:

Har part ka sum hoga: 12 / 3 = 4
Hume array ko aise split karna hai jahan har part ka sum 4 ho.
Split Points Dhoondhna:

Array ko traverse karte hain:
Prefix sum = 1 + 3 = 4 (Pehla split point index 1 par mil gaya).
Aage chalte hain, prefix sum = 4 + 0 + 4 = 8 (Total prefix sum ab 8 ho gaya, aur dusra split point index 4 par mil gaya).
Result:

Array ko {1, 3}, {4}, aur {0, 4} mein split kar sakte hain, jahan har part ka sum 4 hai.
So, split karna possible hai.

*/








