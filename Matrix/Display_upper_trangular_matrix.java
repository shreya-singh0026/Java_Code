package matrix_coding;
import java.util.Scanner;
//DISPLAY UPPER TRANGULAR MATRIX
public class Display_upper_trangular_matrix {
		public static void main(String[] args) {
			
		    //for user input
		    try (Scanner scan = new Scanner(System.in)) {

			//matrix1
			//no of row & column
			System.out.println("Enter Row & Column : ");
			int n=scan.nextInt();
			
			//2-D array initialization
			int a[][]=new int[n][n];
			
			System.out.println("Enter Matrix1 Element : ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=scan.nextInt();
				}
			}
			//printing matrix
			System.out.println("MATRIX");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j] +"    ");
				}
				System.out.println();
			}
			

			
			//upper triangular matrix
			System.out.println("UPPER TRANGULAR MATRIX");

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i>j)
						System.out.print(0 + "    ");
					else
						System.out.print(a[i][j] + "    ");
				}			System.out.println();

			}

		    }
		}
	}