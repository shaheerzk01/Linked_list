package PROGRAMS;

public class PROGRAM5 {
	
    Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}


	public void addNode(int data) {
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
		}else {
			Node last = head;
			while (last.next!=null){
				last = last.next;
			}
			last.next = new_node;
		}
		return;
	}
	
	public  void printNode() {
		//initializing current to head
		Node current = head;
		if(head == null) {
		    System.out.println("Linked list is empty");

		}else {
			System.out.println("Linked List is: ");
			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		
	}
	
	public void Clear() {
		head = null;
	}
	public static void main(String[] args) {
		PROGRAM5 list = new PROGRAM5();
		list.addNode(10);
		list.addNode(30);
		list.addNode(70);
		list.addNode(20);
	    list.printNode();
		list.Clear();
		System.out.println("\n");
		list.printNode();
	}

}
