package recursion.Basic;
//PRINTING  N TO 1 USING RECURSION
public class Printing_n_to_1 {

	public static void main(String[] args) {
		printingNto1(10); //function call
		}

		//function created
		static void printingNto1(int n) {
			if(n==0)return;
			System.out.println(n); //printing and the calling
			printingNto1(n-1);          //calling next lower value
		}
	}
