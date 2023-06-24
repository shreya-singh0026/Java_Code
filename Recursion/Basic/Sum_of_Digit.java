package recursion.Basic;
//SUM OF DIGIT
public class Sum_of_Digit {

	public static void main(String[] args) {
		int res=Sum_digit(344);//function call
		System.out.println("Sum of Digit : "+res);
	}
	
	//function created
	static int Sum_digit(int n) {
		if(n%10==n)return  n;
		return (n%10)+ Sum_digit(n/10);
	}
	
}
