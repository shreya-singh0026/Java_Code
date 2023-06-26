package method;

public class method_overloading1 {
//SAME METHOD NAME WITH DIFFERENT TYPE OF ARGUMENT AND DIFFERENT NO OF ARGUMENT
	
	public static void main(String[] args) {
		//method call
		getTea();
		getTea(4,15);
		getTea("lemon",20);
		getTea(4,"lemon",20);
	
		
	}
	//method 1
	public static void getTea() {
		System.out.println("Bill for Tea is 10rs");
	}
	
	//method 2
	public static void getTea(int quantity,int price) {
		System.out.println("Bill for "+ quantity +" Tea is " + ( quantity*price)  + "rs");
	}
	
	//method 3
	public static void getTea(String type,int price) {
		System.out.println("Bill for "+type + "  Tea is " + price);
	}
	
	//method 4
	public static void getTea(int quantity,String type,int price) {
		System.out.println("Bill for "+quantity+ " " + type +" of  Tea is " + (quantity *price) + "rs");
	}
	
	

}
