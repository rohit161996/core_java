package recursion;

public class RecursiveFunctionEx3 {
	static int x=0;
	public static void main(String[] args) {
		System.out.println("Hi Main");
		m1();
		System.out.println("Bye Main");
	}
	static void m1() {
		System.out.println("Hello M1");
		if(x<=1) {
			x++;
			m1();
		}
		System.out.println("Bye M1");
	}
}
