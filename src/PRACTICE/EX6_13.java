package PRACTICE;

import java.util.LinkedList;
import java.util.*;

public class EX6_13 {

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
		
		//Swapping 1st(index 0) element(Zahir) with the 3rd(index 2) element (Nida)
		Collections.swap(List, 0,2);
		System.out.println("The New linked list after swap: " + List);
		

	}

}
