package PRACTICE;

//To create a generic function
	//public static  void func(T a, T b){}
	//Note: In Parameter type,
	//we can not use primitives like
	//'int', 'char' or 'double'.
	
	// A Simple Java program
	// to show working of user defined
	// Generic functions


public class EX6_2 {
	
	//A generic method example
	static <T> void displayElement(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
	
	// Driver method
	public static void main(String[] args) {
		
		// Calling generic method
		// with Integer argument
		displayElement(27);
		
		// Calling generic method
		// with String argument
		displayElement("Usman institute of technology");
		
		// Calling generic method
		// with double argument
		displayElement(7.0);
	}
		
	

}
