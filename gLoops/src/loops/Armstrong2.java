package loops;

public class Armstrong2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to check Armstrong:");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		n=copy;
		while(n!=0) {
			int r=n%10;
			int m=1;
			for(int x=1;x<=count;x++) {
				m *= r;
			}
			sum+=m;
			n/=10;
		}
		
		if(sum==copy) {
			System.out.println(copy+" is Armstrong");
		}else {
			System.out.println(copy+" is NOT Armstrong");
		}
	}
}
