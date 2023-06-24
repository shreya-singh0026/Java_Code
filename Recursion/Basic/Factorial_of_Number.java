package recursion.Basic;
//FACTORIAL OF A NUMBER
public class Factorial_of_Number {

	public static void main(String[] args) {
		int res=factorial(4); //function call
		System.out.println("Factorial of a Number : "+ res);
	}
	
	//function body
	static int factorial(int n) {
		if(n==1)return 1;
		return n* factorial(n-1);
	}

}
