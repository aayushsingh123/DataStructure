package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicIncreasingStack {
    // Function jo monotonic increasing stack implement karta hai
    public static int[] monotonicIncreasing(int[] nums) {
        // Deque (double-ended queue) ko stack ke liye represent karne ke liye
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Input array ko traverse karo
        for (int num : nums) {
            // Jab tak stack khaali nahi hai aur stack ka top element current element se bada hai
            while (!stack.isEmpty() && stack.peekLast() > num) {
                // Stack se top element ko pop karo
                stack.pollLast();
            }
            // Current element ko stack mein push karo
            stack.offerLast(num);
        }

        // Stack se result array ko construct karo
        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pollLast();
        }

        return result;
    }

    // Main method for example usage
    public static void main(String[] args) {
        // Example usage:
        int[] nums = {7, 8, 4, 1, 5, 9, 2, 6}; // Yeh input use karo
        int[] result = monotonicIncreasing(nums);
        
        // Result print karo
        System.out.print("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


//explaination



/*
 Chalo, ab is Java code ko Monotonic Increasing Stack ke liye Hinglish mein samjhate hain, input array {7, 8, 4, 1, 5, 9, 2, 6} ke sath.

Code Explanation
Initialization:

Ek Deque (double-ended queue) ka use kiya gaya hai jo stack ko simulate karne ke liye hota hai.
Main Logic:

Har number ke liye input array mein, code check karta hai ki stack khaali nahi hai aur stack ka top element current number se bada hai ya nahi.
Agar ye conditions true hain, toh stack ka top element remove (pop) kar diya jata hai.
Fir current number ko stack mein add (push) kar diya jata hai.
Result Construction:

Jab saare elements ko process kar liya jata hai, tab stack mein jo elements bache hain unhe result array mein transfer kiya jata hai.
Iteration Steps
Chalo ab input array ko step-by-step dekhte hain:

Initial Stack: []
Add 7: Stack ho jata hai [7]
Add 8: Stack ho jata hai [7, 8]
Add 4:
8 ko pop karo (kyunki 4 < 8): Stack ho jata hai [7]
7 ko pop karo (kyunki 4 < 7): Stack ho jata hai []
4 ko add karo: Stack ho jata hai [4]
Add 1:
4 ko pop karo (kyunki 1 < 4): Stack ho jata hai []
1 ko add karo: Stack ho jata hai [1]
Add 5: Stack ho jata hai [1, 5]
Add 9: Stack ho jata hai [1, 5, 9]
Add 2:
9 ko pop karo (kyunki 2 < 9): Stack ho jata hai [1, 5]
5 ko pop karo (kyunki 2 < 5): Stack ho jata hai [1]
2 ko add karo: Stack ho jata hai [1, 2]
Add 6: Stack ho jata hai [1, 2, 6]
Final Stack
Saare elements process karne ke baad, final stack mein elements monotonic increasing order mein honge:

Final Stack: [1, 2, 6]

*/
