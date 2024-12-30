package Linklist;

public class Find_Length_of_a_Linked_List {
	

	class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	}
	
	public class LinkedList {
		
		public static int countNode(Node head) {
			int count=0;
			Node current=head;
			//current.next=head;
			
			while(current!=null) {
				count++;
				current=current.next;
			}
			return count;

		}
		
		public static void main( String[] args) {//Driver class hai" woh class hoti hai jahan se program execute hota hai.
			Find_Length_of_a_Linked_List obj= new Find_Length_of_a_Linked_List();
			
			Node head = obj.new Node(1);
			head.next= obj.new Node(2);
			head.next.next= obj.new Node(4);
			head.next.next.next= obj.new Node(10);
			head.next.next.next.next= obj.new Node(20);
			
			System.out.println(head.next);
			
		}
	}
}