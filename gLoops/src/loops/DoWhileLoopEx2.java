package loops;

public class DoWhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a Number:");
			int n=sc.nextInt();
			System.out.println("Square of "+n+" is "+n*n);
			
			System.out.println("Do u wanna continue? [yes/no]");
			choice=sc.next();
			
		}while(choice.equals("yes"));
		
		System.out.println("Thanks for using My App.");
		sc.close();
	}
}
