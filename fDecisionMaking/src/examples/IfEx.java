package examples;

public class IfEx {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		if(age>=13 && age<=19) {
			System.out.println("You are Teenager!");
		}
		System.out.println("Thanks!");
		sc.close();
	}

}
