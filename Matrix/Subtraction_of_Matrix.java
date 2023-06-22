package matrix_coding;

import java.util.Scanner;

//SUBTRACTION OF MATRIX
public class Subtraction_of_Matrix {

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
			
			//matrix2
			//no of row
			System.out.println("Enter Row : ");
			int br=scan.nextInt();
			//no of column
			System.out.println("Enter Column : ");
			int bc=scan.nextInt();
			//2-D array initialization
			int b[][]=new int[br][bc];
			
			System.out.println("Enter Matrix2 Element : ");
			for(int i=0;i<br;i++) {
				for(int j=0;j<bc;j++) {
					b[i][j]=scan.nextInt();
				}
			}
			
			if(ar!=br  || ac!=bc)
			{
				System.out.println("Subtraction not possible");
				
			}
			else {
				
			//subtraction of two matrix
			int c[][]=new int[ar][ac];
			//if both matrix are compatable then do subtraction
				for(int i=0;i<ar;i++) {
					for(int j=0;j<ac;j++) {
						c[i][j]=a[i][j]-b[i][j];
						System.out.print(c[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}

}
