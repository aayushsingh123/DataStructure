package com.ReverseArray;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6};
		System.out.println("Original array:");
        printArray(array);
        reverseArray(array); // Array ko reverse karna
     
        System.out.println("Reverse array:");
        printArray(array);
	}
	
	public static void reverseArray(int[] array) {
		int start=0;
		int end=array.length-1;
		
		while(start<end) {
			int temp=array[start];
			array[start]= array[end];
			array[end]=temp;
			
			start++;
            end--;
		}
	
	}
	
	public static void printArray (int[] array) {
		
		for(int element :array) {
			System.out.print(element + "");
		}
		System.out.println();
			
		}
		
		
	}
	
	
	














/*


Memory updated
Bilkul, chalo ek example se samajhte hain.

Example
Maan lo humare paas ek array hai: [10, 20, 30, 40, 50].

Initial Setup:

start pointer index 0 pe hai (value 10).
end pointer index 4 pe hai (value 50).
Execution Steps
First Iteration:

Condition Check: start < end → 0 < 4 → True
Swap Elements:
array[start] (value 10) ko array[end] (value 50) se swap karo.
Array becomes: [50, 20, 30, 40, 10].
Update Pointers:
start ko 1 pe move karo.
end ko 3 pe move karo.
Second Iteration:

Condition Check: start < end → 1 < 3 → True
Swap Elements:
array[start] (value 20) ko array[end] (value 40) se swap karo.
Array becomes: [50, 40, 30, 20, 10].
Update Pointers:
start ko 2 pe move karo.
end ko 2 pe move karo.
Condition Check:

Condition Check: start < end → 2 < 2 → False
Loop Ends: start aur end pointers same index 2 pe hain, isliye loop ki condition false ho jati hai aur loop stop ho jata hai.
Final Array
Array after reversing: [50, 40, 30, 20, 10]
Summary
while (start < end) loop ko ensure karta hai ki elements ko swap karte rahen jab tak start pointer end pointer se chhota hai.
Jab start aur end pointers ek dusre ko cross kar lete hain ya same index pe aate hain, loop khatam ho jata hai aur array reverse ho jata hai.
Umeed hai ki example se clear ho gaya hoga. Agar aur koi question hai, to zaroor puchho!




Chalo is code ko line by line breakdown karte hain:

java
Copy code
public static void reverseArray(int[] array) {
public static void reverseArray(int[] array): Yeh method declaration hai. Iska naam reverseArray hai aur yeh ek integer array ko as input leta hai. Yeh method static hai, to ise bina object banaye directly class ke naam se call kiya ja sakta hai.

    int start = 0;
int start = 0;: Yahan pe ek integer variable start ko initialize kiya gaya hai, jo array ke starting index (0) ko point karega. Yeh pointer array ke pehle element ko represent karega.

    int end = array.length - 1;
int end = array.length - 1;: Yeh line array ke last index ko calculate kar rahi hai. array.length - 1 last element ka index hota hai, kyunki array ka index 0 se start hota hai. end pointer array ke last element ko point karega.

    while (start < end) {
while (start < end): Yeh loop tab tak chalega jab tak start pointer end pointer se chhota hai. Iska matlab jab tak start aur end ke beech distance hai, tab tak array ke elements ko swap kiya jayega. Jaise jaise start badhta jaayega aur end ghatta jaayega, woh array ke elements ko reverse order mein swap karega.

        int temp = array[start];
int temp = array[start];: Yeh line start pointer ke current element ko temp variable mein temporarily store karti hai. Iska reason yeh hai ki hum array[start] ki value ko badalne wale hain, isliye pehle se store kar lena zaroori hai, taaki value lost na ho.

        array[start] = array[end];
array[start] = array[end];: Yahan hum end pointer ka element start pointer ke element ke sath replace kar rahe hain. Basically, hum array ke last element ko pehle element ke jagah rakh rahe hain.

        array[end] = temp;
array[end] = temp;: Ab hum end pointer ke element ko temp ke value se replace kar rahe hain, jo originally start pointer ka element tha. Isse start aur end ke elements ka swap complete ho jata hai.
e
        start++;
        end--;
start++: Is line mein start pointer ko ek step aage (right side) move kiya jata hai, taaki next element pe jaa sake.

end--: Is line mein end pointer ko ek step piche (left side) move kiya jata hai, taaki next element pe jaa sake.










*/



