package PRACTICE;

import java.util.LinkedList;

public class EX6_11 {
	
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
	    List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
		
		//print the list
		System.out.println("Orignal Linked List" + List);
		
		for(int i=0; i<List.size(); i++) {
			System.out.println("Element at index "+i+": "+List.get(i));
		}
		
	}

}
