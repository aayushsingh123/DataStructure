package LinkedlistViaPointerLCWD;

public class LinkedlistViaPointer {
    
	public static void main(String[] args) {
        // Pehla node banayein aur usmein data daalein
        Node node1 = new Node(10); // Example data: 10
        System.out.println("Node1 Data: " + node1.data);  // Node1 ka data print karega
        System.out.println("Node1 Next: " + node1.next);  // Yeh null print karega kyunki next node assign nahi kiya

        // Dusra node banayein aur first node ko link karein
        Node node2 = new Node(667);
        node1.next = node2; // node1 ko node2 ke saath link kiya
        System.out.println("Node2 data: " + node1.next.data); // node1.next ab node2 ho gaya hai

        // Teesra node banayein aur second node ko link karein
        Node node3 = new Node(8946);
        node2.next = node3; // node2 ko node3 ke saath link kiya
        System.out.println("Node3 data: " + node2.next.data); // node2.next ab node3 ho gaya hai
        
        
        System.out.println("call by value...... ");
        //call by value : copy karna
        int x=46;
        //value copy 
        int y=x;
        System.out.println(x);
        System.out.println(y);
        y=90;
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("call by refrence ... ");//isme copy nhi hota hai bas ref leta hai ek se dusre ka
        Node nodeRef = new Node(12);
     Node  nodeRef1=nodeRef;
     System.out.println(nodeRef.data);
     System.out.println(nodeRef1.data);
     
     nodeRef1.data=66;// ab yaha 66 kiye hai toh nodeRef1 , nodeRef dono mein aayega
     System.out.println(nodeRef1.data);
     System.out.println(nodeRef.data);
        
    }
}