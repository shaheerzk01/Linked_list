package PROGRAMS;

public class PROGRAM3 {
	

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
	
	public void insert(Node prev_node , int data, Node after_node) {
		if(prev_node==null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		Node new_node = new Node(data);
		prev_node.next = new_node;
		new_node.next = after_node;
	}
	
	public void delete(int data) {
        Node del = head,prev = null;
        // CASE 1:
        // If head node itself holds the key to be deleted
        if (del != null && del.item == data) {
            head = del.next;
            del.next = head;
            return;
		}
        // CASE 2:
        // If the key is somewhere other than at head
		while(del!= null && del.item!=data) {
			prev = del;
			del = del.next;
			
		}
		
        if (del == null) {
        	System.out.println("Item is not present in the linked list");
            return;
        }
        prev.next = del.next;
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
		    System.out.println("circular Linked list is empty");
			return;
		}else {
			System.out.println("The CIRCULAR Linked List is: ");
			do {
				System.out.print(current.item + " ");
				current = current.next;
			}while(current!=head); 
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
		PROGRAM3 list = new PROGRAM3();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.insert(list.head.next, 50, list.head.next.next);
		list.delete(30);
		list.printNode();
		list.search(list.head, 20);
	}

}
