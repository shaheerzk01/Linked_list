package PRACTICE;

import java.util.LinkedList;

public class EX6_14 {
	
public static void main(String[] args) {
		
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
	    List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
		
		LinkedList<String> List1 = new LinkedList<>();
		List1.add("Sawera");
		List1.add("Shaheer");
		List1.add("Areeb");
		List1.add("Hassan");
		
		//comparison output in linked list
		LinkedList<String> List2 = new LinkedList<>();
		for(String e : List) {
			List2.add(List1.contains(e)? "Yes" : "No");
		System.out.println(List2);
		}
}

}
