package eInputMethod;

public class AddApp {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter 1st no.:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd no.:");
		int n2=sc.nextInt();
		int n=n1+n2;
		System.out.println("Sum= "+n);
		
		sc.close();
	}
}