package loops;

public class ContinueEx4 {
	public static void main(String[] args) {
		int a=1;
		while(a<=5) {
			System.out.println("Rahul");
			if(a==3){
				continue;
			}
			a++;
			System.out.println("Chauhan");
		}
		System.out.println("Bye");
	}
}
