package Stack;

import java.util.*;

class ImplementTwoStacksInArray {
    int[] arr; // Array jo do stacks ko store karega
    int size;  // Array ka total size
    int top1, top2; // Stack 1 aur Stack 2 ke pointers

    // Constructor (Array ko initialize karne ke liye)
    ImplementTwoStacksInArray(int n) {
        size = n;
        arr = new int[n]; // Array banate hain
        top1 = -1;        // Stack 1 ka starting point left side se
        top2 = n;         // Stack 2 ka starting point right side se
    }

    // Stack 1 mein element daalne ka method
    void push1(int x) {
        if (top1 < top2 - 1) {  // Agar stack mein jagah hai
            top1++;             // Pointer ko aage badhate hain
            arr[top1] = x;      // Element ko array mein daalte hain
        } else {
            System.out.println("Stack Overflow: Stack 1"); // Agar jagah nahi hai
        }
    }

    // Stack 2 mein element daalne ka method
    void push2(int x) {
        if (top1 < top2 - 1) {  // Agar stack mein jagah hai
            top2--;             // Pointer ko piche le jate hain
            arr[top2] = x;      // Element ko array mein daalte hain
        } else {
            System.out.println("Stack Overflow: Stack 2"); // Agar jagah nahi hai
        }
    }

    // Stack 1 se element nikalne ka method
    int pop1() {
        if (top1 >= 0) {  // Agar stack khaali nahi hai
            int x = arr[top1];
            top1--;       // Pointer ko ek peeche le aate hain
            return x;     // Element return karte hain
        } else {
            System.out.println("Stack UnderFlow: Stack 1"); // Agar stack khaali hai
            return -1;
        }
    }

    // Stack 2 se element nikalne ka method
    int pop2() {
        if (top2 < size) {  // Agar stack khaali nahi hai
            int x = arr[top2];
            top2++;          // Pointer ko ek aage le jate hain
            return x;        // Element return karte hain
        } else {
            System.out.println("Stack UnderFlow: Stack 2"); // Agar stack khaali hai
            return -1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Do stacks ko manage karne ke liye ek array banate hain (size 5)
        ImplementTwoStacksInArray ts = new ImplementTwoStacksInArray(5);

        ts.push1(5); // Stack 1 mein 5 push kiya
        ts.push2(10); // Stack 2 mein 10 push kiya
        ts.push2(15); // Stack 2 mein 15 push kiya
        ts.push1(11); // Stack 1 mein 11 push kiya
        ts.push2(7); // Stack 2 mein 7 push kiya
        System.out.println("Popped element from stack1 is : " + ts.pop1()); // Stack 1 se pop kiya
        ts.push2(40); // Stack 2 mein 40 push kiya
        System.out.println("Popped element from stack2 is : " + ts.pop2()); // Stack 2 se pop kiya
    } 
} 


//explanation

/*
Initialization (Array ko set karte hain):
Tumhare paas ek array hai arr[], iska size 5 hai. Tumhare do stack ke pointer (top1 aur top2) hain:
top1 = -1 se shuru hota hai, jo left se grow karega (Stack 1 ke liye).
top2 = size = 5 se shuru hota hai, jo right se grow karega (Stack 2 ke liye).
Array initially khaali hai: [ , , , , ]

Operations ka Explanation:
1. ts.push1(5):
Tum Stack 1 mein 5 daalte ho.
top1 ko -1 se 0 par badhate ho.
Array mein arr[0] par 5 store ho jaata hai.
Array: [5, , , , ]

2. ts.push2(10):
Tum Stack 2 mein 10 daalte ho.
top2 ko 5 se 4 par kam karte ho.
Array ke arr[4] mein 10 store hota hai.
Array: [5, , , , 10]

3. ts.push2(15):
Tum Stack 2 mein 15 daalte ho.
top2 ko 4 se 3 par kam karte ho.
Array ke arr[3] mein 15 store hota hai.
Array: [5, , , 15, 10]

4. ts.push1(11):
Tum Stack 1 mein 11 daalte ho.
top1 ko 0 se 1 par badhate ho.
Array ke arr[1] mein 11 store hota hai.
Array: [5, 11, , 15, 10]

5. ts.push2(7):
Tum Stack 2 mein 7 daalte ho.
top2 ko 3 se 2 par kam karte ho.
Array ke arr[2] mein 7 store hota hai.
Array: [5, 11, 7, 15, 10]

6. ts.pop1():
Tum Stack 1 se element nikaalte ho, jo top1 = 1 pe tha, yani 11.
top1 ko 1 se 0 par kam karte ho.
Tumhe 11 return hota hai.
Array: [5, , 7, 15, 10]
Output: Popped element from stack1 is: 11

7. ts.push2(40):
Tum Stack 2 mein 40 daalte ho.
top2 ko 2 se 1 par kam karte ho.
Array ke arr[1] mein 40 store hota hai.
Array: [5, 40, 7, 15, 10]

8. ts.pop2():
Tum Stack 2 se element nikaalte ho, jo top2 = 1 par tha, yani 40.
top2 ko 1 se 2 par badhate ho.
Tumhe 40 return hota hai.
Array: [5, , 7, 15, 10]
Output: Popped element from stack2 is: 40

*/