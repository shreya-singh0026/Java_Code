package recursion.Basic;
//SUM OF NUMBER
public class Sum_of_Number {

	public static void main(String[] args) {
		int res=Sum(4);//function call
		System.out.println("Sum of Number : "+res);
	}
	
	//function created
	static int Sum(int n) {
		if(n==0)return 0;
		return n+ Sum(n-1);
	}

}
