package PRACTICE;

import java.util.LinkedList;
import java.util.Iterator;

public class EX6_6 {
	
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> List = new LinkedList<>();
		// use add() method to add values in the linked list
		List.add("Zahir");
		List.add("Moosa");
		List.add("Nida");
		List.add("Sooraj");
		List.add("Hammad");
		
		// set Iterator at specified index
		Iterator p = List.listIterator(1);
		
		//print list from second position
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
