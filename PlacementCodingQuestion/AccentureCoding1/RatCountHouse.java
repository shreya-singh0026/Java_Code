import java.util.*;
public class RatCountHouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int unit=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(	Fun(r,unit,arr,n));
	}
	public static int Fun(int r,int unit,int arr[],int n) {
		int rat_eat_food=r*unit;
		int sum=0;
		int count=0;
		if(arr==null) 
			return -1;

		for(int i=0;i<n;i++) {
			count++;
			sum+=arr[i];
			if(sum>=rat_eat_food)
				break;
		}
		if(sum<rat_eat_food)
			return 0;
		return count;
	}

}
