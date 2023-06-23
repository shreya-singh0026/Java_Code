package method;

public class Method_wo_ip_wo_op {
//NO PARAMETER AND NO OUTPUT
	
	public static void main(String[] args) {
		add(); //method1 call
		sub();//method2 call
	}
  
	//method1 body
	public static void add() {
		System.out.println("ADDITION");

		int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
		int b[][]= {{1,2,3},{5,6,7},{4,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
}
	
	//method2 body
		public static void sub() {
			System.out.println("SUBTRACTION");

			int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
			int b[][]= {{1,2,3},{5,6,7},{4,8,9}};
			int c[][]=new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}

}
}
