package recursion.Basic;
//PRINTING 1 TO N USING RECURSION
public class Printing_1_to_n {

	public static void main(String[] args) {
		printing1toN(10); //function call
	}

	//function created
	static void printing1toN(int n) {
		if(n==0)return;
		printing1toN(n-1);          //calling next lower value and then printing
		System.out.println(n);
	}
}
