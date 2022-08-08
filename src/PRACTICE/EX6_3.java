package PRACTICE;

//Linked list implementation in Java

public class EX6_3 {
	
	//creating a node
	Node head;
	
	static class Node {
		int value;
		Node next;
		
		Node(int d){
			value = d;
			next = null;
		}	
	}
	
	// Driver method
	public static void main(String[] args) {
		EX6_3 LinkedList = new EX6_3();
		
		//Assign the values
		LinkedList.head = new Node(1);
		Node Second = new Node(2);
		Node third = new Node(3);
		
		//connect the nodes
		LinkedList.head.next = Second;
		Second.next = third;
		
		//printing node values
		while(LinkedList.head != null) {
			System.out.print(LinkedList.head.value + " ");
			LinkedList.head = LinkedList.head.next;
		}
	
	}

}
