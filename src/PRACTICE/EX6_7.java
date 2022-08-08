package PRACTICE;

import java.util.LinkedList;
import java.util.Iterator;

public class EX6_7 {

	public static void main(String[] args) {
		
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
		List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
				
		// print the list
		System.out.println("The Linked list " + List);
		
		Iterator it = List.descendingIterator();
		
		//print list in descending order
		System.out.println("Elements in Reverse Order:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
