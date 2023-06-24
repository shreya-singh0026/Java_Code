package recursion.Basic;

public class Product_of_Number {
//PRODUCT OF A NUMBER
	
	public static void main(String[] args) {
		int res=prod(4);//function call
		System.out.println("Product of Number : "+res);
	}
	
	//function created
	static int prod(int n) {
		if(n==1)return 1;
		return n* prod(n-1);
	}


}
