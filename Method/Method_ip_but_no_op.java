package method;

public class Method_ip_but_no_op {
	// PARAMETER BUT NO OUTPUT

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{5,6,7},{4,8,9}};
		int b[][]= {{1,2,3},{5,6,7},{4,8,9}};
		add( a, b);//method1 call
		sub(a,b);//method2 call
	}

//method1 body with parameter
public static void add(int a[][],int b[][]) {
	System.out.println("ADDITION");
	
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
//method2 body  with parameter
	public static void sub(int a[][],int b[][]) {
		System.out.println("SUBTRACTION");

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