package Linklist;

public class Insert_a_Node_At_a_Specific_Position {

    // Node class ka definition
    class Node {
        int data;  // Node ka data
        Node next;  // Next node ko point karne wala reference

        // Node ka constructor jisme data set hota hai aur next ko null set kiya jata hai
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class ka definition
    class LinkedList {

        private Node head; // Head node jo list ke starting node ko point karta hai
        
        /*
        public class LinkedList: Yeh ek class banayi ja rahi hai jiska naam LinkedList hai.
        Is class ke andar aap linked list ka logic likhoge.

        Node head: Yeh variable head type ka Node hai. head ka kaam hai linked list ke first node ko point karna 
        (yaani jo linked list ka starting point hai, usko represent karega).

        Example:
        Jab linked list empty hoti hai, head null hota hai, matlab list mein koi node nahi hai.
        Jab linked list mein ek ya zyada nodes hoti hain, head linked list ke first node ko point karta hai.
        Iska seedha matlab hai ki head wo reference hai jo linked list ke shuruwat ka pata rakhta hai.
        */

        // Yeh function ek specific position par naya node insert karega
        public void insertAtPosition(int data, int position) {
            // Naya node create kar rahe hain
            Node newNode = new Node(data);

            // Agar position 0 hai, to naya node ko head bana dena hai
            if (position == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            // Ab hum current node ko head se start karenge
            Node current = head;
            // Hum ith position tak pahuchne ke liye loop chalate hain
            for (int i = 0; i < position - 1; i++) {
                if (current != null) {
                    current = current.next;
                } else {
                    // Agar position list se bahar ho to return kar dena
                    return;
                }
            }

            // Naye node ka next set karo current ke next par
            newNode.next = current.next;
            // Aur current ke next ko naye node se point kar do
            current.next = newNode;
        }

        // Yeh function linked list ko print karega
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Insert_a_Node_At_a_Specific_Position obj = new Insert_a_Node_At_a_Specific_Position();
        LinkedList list = obj.new LinkedList();

        // Linked list mein kuch nodes insert karte hain
        list.insertAtPosition(10, 0); // position 0 par insert
        list.insertAtPosition(20, 1); // position 1 par insert
        list.insertAtPosition(30, 1); // position 1 par insert

        // List ko print karte hain
        list.printList(); // Output: 10 30 20
    }
}
