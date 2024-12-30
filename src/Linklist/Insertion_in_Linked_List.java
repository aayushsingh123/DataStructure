package Linklist;

public class Insertion_in_Linked_List {
    // Node class jo ek node ko represent karti hai linked list mein
    class Node {
        int data;  // Node ka data
        Node next;  // Next node ko point karne wala reference

        // Constructor jo node ka data set karta hai
        public Node(int data) {
            this.data = data;  // Node ka data set kiya
            this.next = null;  // Initially next node null hai
        }
    }

    // LinkedList class jo linked list ke operations manage karti hai
    class LinkedList {//inner class non Static Nested Class ko inner class kahte hai
    	/*
    	ab aap bilkul sahi samajh rahe ho! Agar aapne public class 
    	Insertion_in_Linked_List ke andar ek inner class LinkedList banaya hai, 
    	toh LinkedList ko sirf Insertion_in_Linked_List class ke andar hi access kiya ja sakta hai.
    	*/
        private Node head;  // Linked list ka pehla node (head)

        // Linked list ke shuru mein node insert karne ka method
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);  // Naya node banaya
            newNode.next = head;            // Naya node pehle wale head ko point karega
            head = newNode;                 // Ab head naya node ban gaya
        }

        // Linked list ke end mein node insert karne ka method
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);  // Naya node banaya
            if (head == null) {             // Agar list khali hai, to naya node head banega
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {  // Last node tak traverse karo
                current = current.next;
            }
            current.next = newNode;         // Last node ke next ko naya node point karega
        }

        // Kisi specific node ke baad insert karne ka method
        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Pichla node null nahi ho sakta.");
                return;
            }
            Node newNode = new Node(data);  // Naya node banaya
            newNode.next = prevNode.next;   // Naya node pichle node ke next ko point karega
            prevNode.next = newNode;        // Pichla node ab naye node ko point karega
        }

        // Linked list ko print karne ka method
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");  // Node ka data print karo
                current = current.next;
            }
            System.out.println("null");  // List ke end par null print hoga
        }

        // Main method linked list ke operations ko test karne ke liye
        public static void main(String[] args) {
            Insertion_in_Linked_List obj = new Insertion_in_Linked_List();
            LinkedList list = obj.new LinkedList();
            // Nodes ko insert karo
            list.insertAtEnd(1);
            list.insertAtEnd(2);
            list.insertAtBeginning(0);
            list.printList();  // Output: 0 -> 1 -> 2 -> null

            // Kisi specific node ke baad insert karo
            Node node = list.head.next;  // Dusra node lo
            list.insertAfter(node, 5);
            list.printList();  // Output: 0 -> 1 -> 5 -> 2 -> null
        }
    }
}
