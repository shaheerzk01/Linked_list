package PRACTICE;

import java.util.LinkedList;

public class EX6_5 {
	
public static void main(String[] args) {
		
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
		List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
		
		// Print the linked list
		for(String element : List) {
			System.out.println(element);
		}
}

}
