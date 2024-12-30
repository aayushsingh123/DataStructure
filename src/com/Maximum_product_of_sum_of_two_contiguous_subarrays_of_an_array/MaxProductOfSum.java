package com.Maximum_product_of_sum_of_two_contiguous_subarrays_of_an_array;

public class MaxProductOfSum {

    public static void main(String[] args) {
        int arr[] = {4, 10, 1, 7, 2, 9};
        System.out.println("Maximum product: " + maxProductOfSum(arr)); // Output: 270
    }

    // Function to find maximum product of sum of two contiguous subarrays
    public static int maxProductOfSum(int[] arr) {
        int n = arr.length;
        
        // Step 1: Create the Prefix Sum Array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // Prefix sum calculate karte hain
        }

        int maxProduct = 0; // Maximum product ko store karenge

        // Step 2: Loop to find all possible partitions
        for (int i = 0; i < n - 1; i++) {
            // Left subarray sum = prefixSum[i]
            int leftSum = prefixSum[i];
            
            // Right subarray sum = total sum - prefixSum[i]
            int rightSum = prefixSum[n - 1] - prefixSum[i];
            
            // Calculate the product of leftSum and rightSum
            int product = leftSum * rightSum;
            
            // Store the maximum product
            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }
}
