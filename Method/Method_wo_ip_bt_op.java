package method;

public class Method_wo_ip_bt_op {
	// NO PARAMETER BUT  OUTPUT

	public static void main(String[] args) {

		int res[][] =add();//method1 call
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int res2[][]=sub();//method2 call
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(res2[i][j]+ " ");
			}
			System.out.println();
		}

	}

	//method1 body with O/P
	public static int[][] add() {
		System.out.println("ADDITION");
		int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
		int b[][]= {{1,2,3},{5,6,7},{4,8,9}};
		
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}				
		}
		return c;
	}
	//method2 body  with O/P
		public static int[][] sub() {
			System.out.println();
			System.out.println("SUBTRACTION");
			int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
			int b[][]= {{1,2,3},{5,6,7},{4,8,9}};
			int c[][]=new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					c[i][j]=a[i][j]-b[i][j];
				}
			}
			return c;
		}
}
