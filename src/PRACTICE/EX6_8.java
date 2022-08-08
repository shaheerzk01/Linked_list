package PRACTICE;

import java.util.LinkedList;

public class EX6_8 {

	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
	    List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
		
		System.out.println("Orignal Linked List");
		System.out.println("Let add the faculty member Hassan after Zahir: " + List);
		
		List.add(1, "Hassan");
		// print the list
		System.out.println("The Linked list " + List);

	}

}
