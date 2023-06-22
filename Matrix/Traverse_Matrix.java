package matrix_coding;

public class Traverse_Matrix {
//TRAVERSE MATRIX

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
		//row size
		int n=a.length;    
		
		//column size
		int m=a[0].length; 
		
		//traverse the matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				//print the matrix
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
		}
		
	}

}
