package matrix_coding;

public class Search_an_element_in_matrix {
	//SEARCH AN ELEMENT IN MATRIX

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{5,6,7},{4,8,4}};
		int search = 14;
		int flag=0;
		int ar=a.length;
		int ac=a[0].length;
		for(int i=0;i<ar;i++) {
			for(int j=0;j<ac;j++) {
				if(a[i][j]==search) {
					System.out.println(i + " "+ j);
					flag=1;break;
				}
			}
			if (flag==1)
				break;
			}
		if (flag==0)
			System.out.println("Not found");
		
	}
}
