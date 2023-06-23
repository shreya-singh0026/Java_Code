package matrix_coding;

import java.util.Scanner;
//MATRIX EQUAL OR NOT
public class matrix_Equal_or_Not {

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

			int flag=0;
			if(ar!=br || ac!=bc) {   //if row and column are different of both matrix
				System.out.println("Matrices row and column are not equal");
			}
			else {
				for(int i=0;i<br;i++) {
					for(int j=0;j<bc;j++) {
						if (a[i][j] != b[i][j]) {
							System.out.println("Matrix Element are not equal");
							flag=1;
							break;    //move out from the current loop
						}
					}
					if(flag==1) System.out.println("Matrix are not  equal");
				}
				if(flag==0) System.out.println("Matrix are equal");
			}
		}	
	}
}