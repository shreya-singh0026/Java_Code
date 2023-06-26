package method;

public class Method_overloading {
//SAME METHOD NAME WITH DIFFERENT TYPE OF ARGUMENT AND DIFFERENT NO OF ARGUMENT
	public static void main(String[] args) {
		//method call
		getTea();
		getTea(4);
		getTea("lemon");
		getTea(4,"lemon");

		
		
	}
	//method 1
	public static void getTea() {
		System.out.println("Bill for Tea is 10rs");
	}
	
	//method 2
	public static void getTea(int quantity) {
		System.out.println("Bill for "+ quantity +" Tea is " + ( quantity*10)  + "rs");
	}
	
	//method 3
	public static void getTea(String type) {
		System.out.println("Bill for "+type + "  Tea is 12rs");
	}
	
	//method 4
	public static void getTea(int quantity,String type) {
		System.out.println("Bill for "+quantity+ " " + type +" of  Tea is " + (quantity *12) + "rs");
	}
	
	

}
