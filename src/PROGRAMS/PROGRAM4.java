package PROGRAMS;

public class PROGRAM4 {
	
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
	
	public int[] ToArray() {
		int[] Array = new int[count()];
		int index = 0;
		Node currents = head;
		while(currents!=null) {
			Array[index++] = currents.data;
			currents = currents.next;
		}
		for(int i=0; i<Array.length; i++) {
			System.out.print(Array[i] + " ");
		}		
		return Array;
	}
	public int count() {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		PROGRAM4 list = new PROGRAM4();
		list.addNode(10);
		list.addNode(30);
		list.addNode(70);
		list.addNode(20);
	    list.printNode();
		int A = list.count();
		System.out.println("\n" + A);
		list.ToArray();
		
	}

}
