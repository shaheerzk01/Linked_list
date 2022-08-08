package PROGRAMS;

public class DoublyLinkedList {
	
	//creating node class
	class Node{
		int item;
		Node next;
		Node previous;
		
		//constructor
		Node(int item){
			this.item =item;
			next = null;
			previous = null;
		}
	}
	
	//initializing head and tail
	Node head, tail = null;
		
	public void addNode(int item) {
		//creating object of node class
		Node new_node = new Node(item);
		if(head==null) {
			head = tail = new_node;
			head.previous = null;
			tail.next = null;
		}else {
			tail.next = new_node;
			new_node.previous = tail;
			tail = new_node;
			tail.next = null;
		}
	}
		
	public void printNode() {
		//initializing current to head
		Node current = head;
		if(head == null) {
		    System.out.println("Doubly Linked list is empty");
			return;
		}else {
			System.out.println("The Doubly Linked List is: ");
			while(current!= null) {
				System.out.print(current.item + " ");
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.printNode();	
	}
}


