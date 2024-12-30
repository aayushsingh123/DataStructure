package Linklist;

import java.util.LinkedList;

public class Delete_a_Linked_List_node_at_a_given_position {
    
    public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            super();
            this.data = data;
            this.next = null;// Naya node ka next initially null hota hai
        }
    }
    
    public class Linkedlist { 
        Node head;// Linked list ka head
        
     // Node ko specified position se remove karne ka method
        public void removeAtPosition(int position) {
            if (head == null) return; // Agar list khaali hai

            if (position == 0) {
                head = head.next; // Head ko remove karna hai
                return;
            }
            
            Node current = head; 
            // Diagram 1: Initial State
            // head -> [8] -> [2] -> [3] -> null
            // Current points to head
            
            for (int i = 0; current != null && i < position - 1; i++) {
                current = current.next; // Current ko position tak le jaana
                
                // Diagram 2: Traversing to the Node Before the Position
                // Agar position 2 hai, to current ab 2 ke node ke pehle (node 2) par hoga
                // head -> [8] -> [2] -> [3] -> null
                //                       ^
                //                   current
            }
            
            if (current == null || current.next == null) return; // Agar position out of bounds hai
            current.next = current.next.next; // Node ko remove karna
            /* Visualization:
            Before: 8 -> 2 -> 3 -> 1 -> 7
            After:  8 -> 2 -> 1 -> 7 (Node 3 remove ho gaya)
            */    
        
            /* Linked List: 8 -> 2 -> 3 -> 1 -> 7
            Suppose current abhi node 8 pe hai, aur tum position 2 ko delete karna chahte ho (which is 3).
            current.next points to 2.
            current.next.next points to 3.
            After current.next = current.next.next, ab current.next directly 1 ko point karega, jo 3 ke baad aata hai.
            Visualization:
            Before: 8 -> 2 -> 3 -> 1 -> 7
            After: 8 -> 2 -> 1 -> 7 (Node 3 remove ho gaya). */    
        }
        
        public void printList() { // method ka naam capital "L" hona chahiye
            Node current = head;
            while (current != null) {
                System.out.println(current.data + (current.next != null ? "->" : ""));
                
                /*? ka matlab hota hai "agar true hai", yaani condition satisfy hoti hai.
                : ka matlab hota hai "agar false hai", yaani condition satisfy nahi hoti.*/
                
                current = current.next;
            }
            System.out.println();
        }
        
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Delete_a_Linked_List_node_at_a_given_position obj = new Delete_a_Linked_List_node_at_a_given_position();
            Linkedlist list = obj.new Linkedlist();
            list.add(8);
            list.add(2);
            list.add(3);
            list.add(1);
            list.add(7);

            System.out.print("Original List: ");
            list.printList(); 

            list.removeAtPosition(2); // Position 2 ka node remove karein
            System.out.print("Position 2 ko remove karne ke baad: ");
            list.printList(); 

            list.removeAtPosition(1); // Position 1 ka node remove karein
            System.out.print("Position 1 ko remove karne ke baad: ");
            list.printList(); 
        }
    }
}
