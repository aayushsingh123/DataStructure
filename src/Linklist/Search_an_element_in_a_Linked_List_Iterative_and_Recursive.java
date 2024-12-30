package Linklist;

/*  
QUESTION---- Search_an_element_in_a_Linked_List_Iterative_and_Recursive
Given a linked list and a key, the task is to check if key is present in the linked list or not. 

Examples:

Input: 14 -> 21 -> 11 -> 30 -> 10, key = 14
Output: Yes
Explanation: 14 is present in the linked list.

Input: 6 -> 21 -> 17 -> 30 -> 10 -> 8, key = 13
Output: No
Explanation: No node in the linked list has value = 13. 
*/

public class Search_an_element_in_a_Linked_List_Iterative_and_Recursive {
    
    // Node class definition
    class Node {
        int data; // Node ka data
        Node next; // Next node ka reference

        // Constructor to initialize a new node with data
        Node(int new_data) {
            data = new_data; // Data set karo
            next = null; // Next ko null set karo
        }
    }

    // Method to check whether key is present in the linked list
    boolean searchKey(Node head, int key) {
        Node curr = head; // Current node ko head se initialize karo

        // Iterate over all the nodes
        while (curr != null) {
            // Agar current node ka data key ke barabar hai
            if (curr.data == key) {
                return true; // True return karo
            }
            // Agli node par chalo
            curr = curr.next;
        }

        // Agar key nahi mili, toh false return karo
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        Search_an_element_in_a_Linked_List_Iterative_and_Recursive obj = new Search_an_element_in_a_Linked_List_Iterative_and_Recursive();
        
        // Hard-coded linked list banao: 14 -> 21 -> 13 -> 30 -> 10
        Node head = obj.new Node(14);
        head.next = obj.new Node(21);
        head.next.next = obj.new Node(13);
        head.next.next.next = obj.new Node(30);
        head.next.next.next.next = obj.new Node(10);

        // Key jise search karna hai
        int key = 14;

        // Key ko search karo
        if (obj.searchKey(head, key)) {
            System.out.println("Yes"); // Agar milta hai
        } else {
            System.out.println("No"); // Agar nahi milta
        }
    }
}
