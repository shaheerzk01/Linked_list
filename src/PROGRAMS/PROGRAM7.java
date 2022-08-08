package PROGRAMS;

import java.util.Scanner;

public class PROGRAM7 {
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
			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		
	}
	public void insertAtbeginning(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insert(Node prev_node,int data, Node after_node) {
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
		if (del != null && del.data == data) {
            head = del.next; // Changed head
            return;
		}
		while(del!= null && del.data!=data) {
			prev = del;
			del = del.next;
			
		}
		
        if (del == null) {
        	System.out.println("Item is not present in the linked list");
            return;
        }
        prev.next = del.next;
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
	public boolean search(Node head, int key) {
		Node serc = head;
		while(serc!=null) {
			if(serc.data==key) {
				System.out.println("Item is found");
				return true;
			}
			serc = serc.next;
		}
		System.out.println("Item is not found");
		return false;
	}
	
	
	public static void main(String[] args) {
		PROGRAM7 list = new PROGRAM7();
		list.addNode(10);
		list.addNode(30);
		list.addNode(70);
		list.addNode(20);
		System.out.println("The Linked List is: ");
	    list.printNode();
	    System.out.println("\n");
	    Scanner input = new Scanner(System.in);
	    System.out.println("Press 1 to insert element\nPress 2 to insert element at first position\nPress 3 to delete element\nPress 4 to search element\nPress 5 to find length of linked list");
	    int number = input.nextInt();
	    if(number==1) {
	    	System.out.println("Enter data to insert");
	    	int data = input.nextInt();
	    	System.out.println("\nAfter insertion the Linked List is: ");
		    list.insert(list.head.next, data, list.head.next.next);
		    list.printNode();
	    }
	    if(number==2) {
	    	System.out.println("Enter data to insert at first");
	    	int data = input.nextInt();
	    	System.out.println("\nAfter insertion at beginning the Linked List is: ");
		    list.insertAtbeginning(data);
		    list.printNode();
	    }
	    if(number==3) {
	    	System.out.println("Enter data to delete");
	    	int data = input.nextInt();
	    	list.delete(data);
		    System.out.println("\nAfter deletion the Linked List is: ");
		    list.printNode();
	    }
	    if(number==4) {
	    	System.out.println("Enter data to search");
	    	int data = input.nextInt();
	    	list.search(list.head, data);
	    }
	    if(number==5) {
	    	System.out.println("\nThe length of Linked List is: " + list.count());
		    
	    }
	    
	}
}
