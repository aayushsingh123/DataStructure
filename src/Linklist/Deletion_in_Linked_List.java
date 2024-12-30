package Linklist;

import java.util.concurrent.ConcurrentHashMap;

/*Deleting a node in a Linked List is an important operation and can be done in three Main ways: 
 removing the first node, removing a node in the middle, or removing the last node.*/
public class Deletion_in_Linked_List{
	
	public class Node{
		
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	  Node head; // Linked list ka head
	public void deleteFirstNode() {
		 if(head!=null) {// agar head null nhi hai toh
			 head=head.next;  // // Head ko next node se update karo
		 }
	}
    // Method to delete a specific node by value

	public void deleteNodeByValue(int key) {// key variable us value ko represent karta hai jise hum linked list se delete karna chahte hain.
		if(head==null)
			return;
		if(head.data==key) {
			head=head.next;//// Head ko next se update karo
			return;
		}
		
		Node current=head;
		while(current.next!=null) {
			if(current.next.data==key) {// Agar current node ka next node key ke barabar hai
		  current.next = current.next.next;
		  return;
		}
			current = current.next;

		}
	}
	 // Method to delete the last node
	
	public void deleteLastNode() {
		if(head==null)
			return;
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node current=head;
		while(current.next.next!=null) {
			current=current.next;
			
		}
		current.next=null;
		
	}
	// Method to print the linked list
    public void printList() {
        Node curr = head; // Current node ko head se initialize karo
        while (curr != null) {
            System.out.print(curr.data + " -> "); // Print current node data
            curr = curr.next; // Agli node par chalo
        }
        System.out.println("null"); // End of the list
    }

    // Driver code
    public static void main(String[] args) {
    	Deletion_in_Linked_List obj = new Deletion_in_Linked_List();

        // Hard-coded linked list banao: 14 -> 21 -> 13 -> 30 -> 10
        obj.head = obj.new Node(14);
        obj.head.next = obj.new Node(21);
        obj.head.next.next = obj.new Node(13);
        obj.head.next.next.next = obj.new Node(30);
        obj.head.next.next.next.next = obj.new Node(10);

        // Print original list
        System.out.println("Original Linked List:");
        obj.printList();

        // Delete first node
        obj.deleteFirstNode();
        System.out.println("After deleting the first node:");
        obj.printList();

        // Delete a specific node by value (e.g., 21)
        obj.deleteNodeByValue(21);
        System.out.println("After deleting the node with value 21:");
        obj.printList();

        // Delete last node
        obj.deleteLastNode();
        System.out.println("After deleting the last node:");
        obj.printList();
    }
}