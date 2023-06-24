package recursion.Basic;
//PRODUCT OF DIGIT
public class Product_of_Digit {

	public static void main(String[] args) {
		
		int res=Prod_digit(344);//function call
		System.out.println("Product of Digit : "+res);
	}
	
	//function created
	static int Prod_digit(int n) {
		if(n%10==n)return  n;
		return (n%10) * Prod_digit(n/10);
	}

}
