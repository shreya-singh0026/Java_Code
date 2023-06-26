package method;
//perform :2 no addition,3 no additon,2 no subtraction,
//3 no subtraction,2 no multiplication,2 no division
public class Task1Arithmetic {

	public static void main(String[] args) {
		
		//method call
		add(3,4);
		add(3,4,5);
		sub(40,30);
		sub(30,20,10);
		mul(22,2);
		div(4,2);
	}
	
	//method-1
	public static void add(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Addition of 2 Number : " + sum);
	}
	
	//method-2
	public static void add(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		System.out.println("Addition of 3 Number : " + sum);
	}
	
	//method-3
	public static void sub(int num1,int num2) {
		int dif=num1-num2;
		System.out.println("Subtraction of 2 Number : " + dif);
	}
	
	//method-4
	public static void sub(int num1,int num2,int num3) {
		int dif=num1-num2-num3;
		System.out.println("Subtraction of 3 Number : " + dif);
	}
	
	//method-5
	public static void mul(int num1,int num2) {
		int mul=num1*num2;
		System.out.println("Multiplication of 2 Number : " + mul);
	}
	
	//method-6
	public static void div(int num1,int num2) {
		int div=num1/num2;
		System.out.println("Division of 2 Number : " + div);
	}
}
