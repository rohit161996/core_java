package eInputMethod;

public class ScannerEx {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a Integer:");
		int a=sc.nextInt();
		System.out.println("Enter a Floating Point:");
		double b=sc.nextDouble();
		System.out.println("Enter a String:");
		String c=sc.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}
}