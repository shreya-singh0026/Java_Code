package matrix_coding;
import java.util.*;
public class Take_Input_in_Matrix {
//CREATE MATRIX WITH USER INPUT USING JAVA
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			//no of row
			System.out.println("Enter Row : ");
			int row=scan.nextInt();
			
			//no of column
			System.out.println("Enter Column : ");
			int col=scan.nextInt();
			
			//2-D array initialization
			int arr[][]=new int[row][col];
      
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr[i][j]=scan.nextInt();
				}
			}
			System.out.println();
			System.out.println("MATRIX : ");


			//for printing matrix
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
	}

}
