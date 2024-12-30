package Linklist;

import java.util.Currency;

import Linklist.Search_an_element_in_a_Linked_List_Iterative_and_Recursive.Node;

public class Reverse_a_Linked_List {
	
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
    
 // Method to reverse the linked list
    public Node reverse(Node head) {
        Node prev = null; // Previous node ko null se initialize karo
        Node curr = head; // Current node ko head se initialize karo
        Node next = null; // Next node ka reference

        // Iterate over the list
        while (curr != null) {
            next = curr.next; // Next node ko store karo
            curr.next = prev; // Current node ka next ko previous node set karo
            prev = curr; // Previous node ko current node set karo
            curr = next; // Current node ko next node set karo
        }
        return prev; // Reversed list ka head return karo
    }
    
    public void printList(Node head) {
    	Node current=head;//"Initialize" ka matlab hota hai kisi variable ya object ko pehli baar value ya reference assign karna.
    	/* Haan, jab hum curr variable ko head se assign karte hain, toh iska matlab hai ki hum curr ko linked list ke pehle node (head) ka reference de rahe hain.

Kya Hota Hai:   */
    	
    	 while (current != null) {
             System.out.print(current.data + " -> "); // Print current node data
             current = current.next; // Agli node par chalo
         }
         System.out.println("null"); // End of the list
     }

     // Driver code
     public static void main(String[] args) {
    	 Reverse_a_Linked_List obj = new Reverse_a_Linked_List();
         
         // Hard-coded linked list banao: 14 -> 21 -> 13 -> 30 -> 10
         Node head = obj.new Node(14);
         head.next = obj.new Node(21);
         head.next.next = obj.new Node(13);
         head.next.next.next = obj.new Node(30);
         head.next.next.next.next = obj.new Node(10);

         // Print original list
         System.out.println("Original Linked List:");
         obj.printList(head);

         // Reverse the linked list
         head = obj.reverse(head);

         // Print reversed list
         System.out.println("Reversed Linked List:");
         obj.printList(head);
     }
 
    	
    	
    
    }
  