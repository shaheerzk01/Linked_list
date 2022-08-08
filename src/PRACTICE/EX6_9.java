package PRACTICE;

import java.util.LinkedList;

public class EX6_9 {

	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
	    List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
				
		System.out.println("Orignal Linked List" + List);
		
		//Add element at the beginning
		List.addFirst("Ariz");
		
		//Add element at the last
		List.addLast("Areeb");
		
		System.out.println("final Linked List" + List);

	}

}
