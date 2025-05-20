package examples;

public class NestedIfElseEx1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age<0 || age>120) {
			System.out.println("Invalid Age!");
		}else {
			if(age>=13 && age<=19) {
				System.out.println("You are Teenager!");
			}else {
				System.out.println("You are NOT Teenager!");
			}
		}
		
		System.out.println("Thanks for using APP");
		
		sc.close();
	}

}