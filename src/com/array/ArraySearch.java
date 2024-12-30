package com.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Array jisme search karna hai
        int searchElement = 3; // Element jo search karna hai
        boolean found = false; // Search result ka flag
        
        for (int i = 0; i < array.length; i++) { // Array ke har element ko traverse karte hain
            if (array[i] == searchElement) { // Agar element mil jata hai
                found = true; // Flag ko true set karte hain
                break; // Loop ko break karte hain
            }
        }
        
        if (found) {
            System.out.println("Element " + searchElement + " found in the array."); // Agar element mil gaya to message print karte hain
        } else {
            System.out.println("Element " + searchElement + " not found in the array."); // Agar element nahi milta to message print karte hain
        }
    }
}






/* padho

int[] array = {1, 2, 3, 4, 5};
Yahan array ek reference variable hai jo ek array ko point karta hai jisme values {1, 2, 3, 4, 5} hain.
Array Indexing:

array[i] se hum array ke i index par jo value hai usko access karte hain.
Example: array[0] se 1, array[1] se 2, etc.
Value vs. Index:

array[i] ka matlab hai array ke i position par jo value hai usko access karna.
i ek index hai, jo 0 se lekar array.length - 1 (0 se 4 tak) tak ki values le sakta hai.
array khud ek reference hai jo pura array ko point karta hai, aur array[i] se us array ke particular index ki
 value milti hai. */