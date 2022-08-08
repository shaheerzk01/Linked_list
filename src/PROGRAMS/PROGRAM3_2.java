package PROGRAMS;

public class PROGRAM3_2 {
	
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
		
		public void insert(Node prev_node, int data, Node after_node) {
			if(prev_node==null) {
				System.out.println("Previous node cannot be null");
				return;
			}
			Node new_node = new Node(data);
			prev_node.next = new_node;
			new_node.previous = prev_node;
			new_node.next = after_node;
			after_node.previous = new_node;
		}
		
		public void delete(int data) {
			Node del = head,prev = null;
	        if (del != null && del.item == data) {
	            head = del.next; // Changed head
	            return;
			}
			
			while(del!= null && del.item!=data) {
				prev = del;
				del = del.next;
			}
			
	        if (del == null) {
	        	System.out.println("Item is not present in the linked list");
	            return;
	        }
	        prev.next = del.next;
	        del.previous = prev;
		}
		public boolean search(Node head, int key) {
			Node serc = head;
			while(serc!=null) {
				if(serc.item==key) {
					System.out.println("Item is found");
					return true;
				}
				serc = serc.next;
			}
			System.out.println("Item is not found");
			return false;
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
			PROGRAM3_2 list = new PROGRAM3_2();
			list.addNode(10);
			list.addNode(20);
			list.addNode(30);
			list.addNode(40);
			list.insert(list.head.next, 25, list.head.next.next);
			list.delete(40);
			list.printNode();
			System.out.println("\n");
			list.search(list.head, 25);
		}

}
