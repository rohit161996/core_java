package loops;

public class BreakEx5 {
	public static void main(String[] args) {
		System.out.println("Hello");
		for(int a=1;a<=8;a++) {
			System.out.println("Rahul");
			if(a++==3){
				break;
			}else {
				a++;
			}
			System.out.println("Chauhan");
		}
		System.out.println("Bye");
	}
}
