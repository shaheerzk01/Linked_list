package PROGRAMS;

public class CircularLinkedList {
	
	//creating node class
	class Node{
		int item;
		Node next;

		//constructor
		Node(int item){
			this.item =item;
			next = null;
		}
	}
	
	//initializing head and tail
	Node head, tail = null;
		
	public void addNode(int item) {
		//creating object of node class
		Node new_node = new Node(item);
		if(head==null) {
			head = tail = new_node;
			new_node.next = head;
		}else {
			tail.next = new_node;
			tail = new_node;
			tail.next = head;
		}
	}
		
	public void printNode() {
		//initializing current to head
		Node current = head;
		if(head == null) {
		    System.out.println("circular Linked list is empty");
			return;
		}else {
			System.out.println("The Doubly Linked List is: ");
			do {
				System.out.print(current.item + " ");
				current = current.next;
			}while(current!=head); 
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.printNode();	
	}

	
}
