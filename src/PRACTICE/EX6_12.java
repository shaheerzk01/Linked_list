package PRACTICE;

import java.util.LinkedList;
import java.util.*;

public class EX6_12 {
	
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
		
		// Remove the first element
		Object firstElement = List.removeFirst();
		System.out.println("Element removed: "+ firstElement);
		
		// Remove the last element
		Object lastElement = List.removeLast();
		System.out.println("Element removed: "+ firstElement);
		System.out.println("The New linked list: " + List);

	}

}
