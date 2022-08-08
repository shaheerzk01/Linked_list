package PRACTICE;

public class Main6_1 {
	
	public static void main(String[] args) {
		// instance of Integer type
		
		//Instance of integer type
		EX6_1 <Integer> obj = new EX6_1<Integer>(27);
		
		System.out.println(obj.getObject());
		
		//Instance of string type
		EX6_1 <String> obj1 = new EX6_1<String>("Usman institute of technology");
		
		System.out.println(obj1.getObject());
		
	}

}
