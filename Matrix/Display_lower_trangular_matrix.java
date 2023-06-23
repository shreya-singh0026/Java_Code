package matrix_coding;
import java.util.Scanner;
//DISPLAY LOWER TRANGULAR MATRIX
public class Display_lower_trangular_matrix {

	public static void main(String[] args) {
		
	    //for user input
	    try (Scanner scan = new Scanner(System.in)) {

		//matrix1
		//no of row
		System.out.println("Enter Row : ");
		int ar=scan.nextInt();
		
		//no of column
		System.out.println("Enter Column : ");
		int ac=scan.nextInt();
		
		//2-D array initialization
		int a[][]=new int[ar][ac];
		
		System.out.println("Enter Matrix1 Element : ");
		for(int i=0;i<ar;i++) {
			for(int j=0;j<ac;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		//printing matrix
		System.out.println("MATRIX");
		for(int i=0;i<ar;i++) {
			for(int j=0;j<ac;j++) {
				System.out.print(a[i][j] +"    ");
			}
			System.out.println();
		}
		

		
		//lower trangular matrix
		System.out.println("LOWER TRANGULAR MATRIX");

		for(int i=0;i<=ar;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j] + "    ");
			}			System.out.println();

		}

	    }
	}
}
