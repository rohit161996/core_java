package loops;

public class Factorial {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int f=1;
		for(int x=1;x<=n;x++) {
			f *= x;
		}
		
		System.out.println("Factorial of "+n+" is "+f);
		sc.close();
	}
}